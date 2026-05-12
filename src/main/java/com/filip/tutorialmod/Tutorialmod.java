package com.filip.tutorialmod;

import com.filip.tutorialmod.block.ModBlocks;
import com.filip.tutorialmod.item.ModItemGroups;
import com.filip.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STAR_DUST, 1000);
	}
}