package net.cymc888.fnaf.item;

import net.cymc888.fnaf.FNAFRedefined;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FNAFRedefined.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FNAFRedefined.LOGGER.info("Registering mod items for " + FNAFRedefined.MOD_ID);
    }

    //                                                                                                                  Added Items

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

}
