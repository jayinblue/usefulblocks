package net.jayinblue.usefulblocks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jayinblue.usefulblocks.item.custom.ModAxeItem;
import net.jayinblue.usefulblocks.item.custom.ModHoeItem;
import net.jayinblue.usefulblocks.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.jayinblue.usefulblocks.UsefulBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //moditems
    public static final Item TESTING = registerItem("testing",
            new Item(new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_PLATE = registerItem("copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    //copper tools
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.5f,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1, -3f,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterial.COPPER, 1, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterial.COPPER, 5, -3.2f,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterial.COPPER, -2, -1f,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    //copper armour
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmourMaterial.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmourMaterial.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmourMaterial.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmourMaterial.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));

    //register moditems
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(UsefulBlocks.MOD_ID, name), item);
    }

    //prints in console
    public static void registerModItems() {
        System.out.println("Registering UB mod items!");
    }
}
