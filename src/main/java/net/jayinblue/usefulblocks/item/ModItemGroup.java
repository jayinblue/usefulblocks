package net.jayinblue.usefulblocks.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.jayinblue.usefulblocks.UsefulBlocks;
import net.jayinblue.usefulblocks.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup USEFUL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(UsefulBlocks.MOD_ID, "usefulblocks"),
            () -> new ItemStack(ModBlocks.COPPER_BRICKS));
}