package com.filip.tutorialmod.item;

import com.filip.tutorialmod.Tutorialmod;
import com.filip.tutorialmod.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TutorialmodItems {
    public static final Item PINK_GEM = registerItem("pink_gem", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GEM = registerItem("raw_pink_gem", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(25)));

    private static Item registerItem(String name,  Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name), item);
    }

    public static void registerItems() {
        Tutorialmod.LOGGER.info("Registering Items for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GEM);
            entries.add(RAW_PINK_GEM);
        });
    }
}
