package com.filip.tutorialmod.block;

import com.filip.tutorialmod.Tutorialmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import javax.swing.*;

public class ModBlocks {

    public static final Block PINK_GEM_BLOCK = registerBlock("pink_gem_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_PINK_GEM_BLOCK = registerBlock("raw_pink_gem_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(4f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

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
