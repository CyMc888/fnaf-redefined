package net.cymc888.fnaf;

import net.cymc888.fnaf.item.ModItemGroups;
import net.cymc888.fnaf.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FNAFRedefined implements ModInitializer {

	public static final String MOD_ID = "fnaf-redefined";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}