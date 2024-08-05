package net.xono.cellakay;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.xono.cellakay.block.ModBlocks;
import net.xono.cellakay.item.ModItemGroups;
import net.xono.cellakay.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CellaKay implements ModInitializer {
	public static final String MOD_ID = "cellakay";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.MINI_COAL, 400);
	}
}