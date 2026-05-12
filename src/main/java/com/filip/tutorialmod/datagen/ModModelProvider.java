package com.filip.tutorialmod.datagen;

import com.filip.tutorialmod.block.ModBlocks;
import com.filip.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GEM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GEM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GEM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUPER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_PINK_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_DUST, Models.GENERATED);
    }
}
