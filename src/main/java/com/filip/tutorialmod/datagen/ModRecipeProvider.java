package com.filip.tutorialmod.datagen;

import com.filip.tutorialmod.block.ModBlocks;
import com.filip.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> PINK_GEM_SMELTABLES = List.of(ModItems.RAW_PINK_GEM, ModBlocks.PINK_GEM_ORE, ModBlocks.PINK_GEM_DEEPSLATE_ORE);

        offerSmelting(exporter ,PINK_GEM_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GEM, 0.5f, 200, "pink_gem");
        offerBlasting(exporter ,PINK_GEM_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GEM, 0.5f, 100, "pink_gem");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GEM, RecipeCategory.DECORATIONS, ModBlocks.PINK_GEM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_PINK_GEM_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_PINK_GEM)
                .criterion(hasItem(ModItems.RAW_PINK_GEM), conditionsFromItem(ModItems.RAW_PINK_GEM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GEM, 9)
                .input(ModBlocks.RAW_PINK_GEM_BLOCK)
                .criterion(hasItem(ModItems.RAW_PINK_GEM), conditionsFromItem(ModItems.RAW_PINK_GEM))
                .offerTo(exporter);
    }
}
