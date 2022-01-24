package net.jayinblue.usefulblocks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.jayinblue.usefulblocks.UsefulBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //moditems
    public static final Item TESTING = registerItem("testing",
            new Item(new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_PLATE = registerItem("copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    //register moditems
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(UsefulBlocks.MOD_ID, name), item);
    }

    //prints in console
    public static void registerModItems() {
        System.out.println("Registering UB mod items!");
    }
}
