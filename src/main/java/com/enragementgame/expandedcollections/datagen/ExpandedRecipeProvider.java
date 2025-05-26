package com.enragementgame.expandedcollections.datagen;

import com.enragementgame.expandedcollections.ExpandedCollections;
import com.enragementgame.expandedcollections.registries.ItemRegister;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ExpandedRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ExpandedRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        trimSmithing(recipeOutput, ItemRegister.GUARD_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(ExpandedCollections.MODID, "guard"));

    }
}
