package com.filip.tutorialmod.block;

import com.filip.tutorialmod.Tutorialmod;
import com.filip.tutorialmod.block.custom.SuperBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import javax.swing.*;

public class ModBlocks {

    public static final Block PINK_GEM_BLOCK = registerBlock("pink_gem_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_PINK_GEM_BLOCK = registerBlock("raw_pink_gem_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block PINK_GEM_ORE = registerBlock("pink_gem_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 5), AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.STONE).strength(3f)));
    public static final Block PINK_GEM_DEEPSLATE_ORE = registerBlock("pink_gem_deepslate_ore", new ExperienceDroppingBlock(UniformIntProvider.create(5, 7), AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.DEEPSLATE).strength(4f)));
    public static final Block SUPER_BLOCK = registerBlock("super_block", new SuperBlock(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Tutorialmod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        Tutorialmod.LOGGER.info("Registering Blocks for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModBlocks.PINK_GEM_BLOCK);
            entries.add(ModBlocks.RAW_PINK_GEM_BLOCK);
        });
    }
}
