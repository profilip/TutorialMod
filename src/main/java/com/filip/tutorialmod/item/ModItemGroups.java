package com.filip.tutorialmod.item;

import com.filip.tutorialmod.Tutorialmod;
import com.filip.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.lang.reflect.GenericDeclaration;

public class ModItemGroups {
    public static final ItemGroup PINK_GEM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "pink_gem_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(TutorialmodItems.PINK_GEM))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(TutorialmodItems.PINK_GEM);
                        entries.add(TutorialmodItems.RAW_PINK_GEM);
                        entries.add(TutorialmodItems.CHISEL);
                        entries.add(TutorialmodItems.BLUE_BERRIES);
                        entries.add(TutorialmodItems.CAULIFLOWER);
                    })
                    .build());

    public static final ItemGroup PINK_GEM_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "pink_gem_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.PINK_GEM_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GEM_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GEM_BLOCK);
                        entries.add(ModBlocks.PINK_GEM_DEEPSLATE_ORE);
                        entries.add(ModBlocks.PINK_GEM_ORE);
                        entries.add(ModBlocks.SUPER_BLOCK);
                    })
                    .build());

    public static void registerItemGroups(){
        Tutorialmod.LOGGER.info("Registering Item Groups for" + Tutorialmod.MOD_ID);
    }
}
