package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.registries.ItemRegister;
import com.enragementgame.expandedcollections.util.ExpandedTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ExpandedRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ExpandedRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.CROAK_BANNER_PATTERN.get())
                .requires(Items.PAPER).requires(Items.OCHRE_FROGLIGHT).requires(Items.PEARLESCENT_FROGLIGHT).requires(Items.VERDANT_FROGLIGHT)
                .unlockedBy("has_froglight", has(ExpandedTags.Items.FROGLIGHTS)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.EARS_BANNER_PATTERN.get())
                .requires(Items.PAPER).requires(Items.RABBIT_FOOT)
                .unlockedBy("has_rabbit_foot", has(Items.RABBIT_FOOT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.RIVETS_BANNER_PATTERN.get())
                .requires(Items.PAPER).requires(Items.OXIDIZED_COPPER)
                .unlockedBy(getHasName(Items.OXIDIZED_COPPER), has(Items.OXIDIZED_COPPER)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE, 2)
                .pattern("DTD")
                .pattern("DID")
                .pattern("DDD")
                .define('D',Items.DIAMOND)
                .define('T', ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE)
                .define('I', Items.IRON_BLOCK)
                .unlockedBy("get_guard_trim", has(ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE))
                .save(recipeOutput);

        trimSmithing(recipeOutput, ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "guard"));

    }
}
