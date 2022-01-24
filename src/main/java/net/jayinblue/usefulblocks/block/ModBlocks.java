package net.jayinblue.usefulblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jayinblue.usefulblocks.UsefulBlocks;
import net.jayinblue.usefulblocks.block.custom.ModStairsBlock;
import net.jayinblue.usefulblocks.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //modblocks

    //copperbricks and its variants
    public static final Block COPPER_BRICKS = registerBlock("copper_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block COPPER_BRICK_SLAB = registerBlock("copper_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block COPPER_BRICK_STAIRS = registerBlock("copper_brick_stairs",
            new ModStairsBlock(ModBlocks.COPPER_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block COPPER_BRICK_WALL = registerBlock("copper_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));


    //exposedcopperbricks and its variants
    public static final Block EXPOSED_COPPER_BRICKS = registerBlock("exposed_copper_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block EXPOSED_COPPER_BRICK_SLAB = registerBlock("exposed_copper_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block EXPOSED_COPPER_BRICK_STAIRS = registerBlock("exposed_copper_brick_stairs",
            new ModStairsBlock(ModBlocks.COPPER_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block EXPOSED_COPPER_BRICK_WALL = registerBlock("exposed_copper_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));


    //weatheredcopperbricks and its variants
    public static final Block WEATHERED_COPPER_BRICKS = registerBlock("weathered_copper_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block WEATHERED_COPPER_BRICK_SLAB = registerBlock("weathered_copper_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block WEATHERED_COPPER_BRICK_STAIRS = registerBlock("weathered_copper_brick_stairs",
            new ModStairsBlock(ModBlocks.COPPER_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block WEATHERED_COPPER_BRICK_WALL = registerBlock("weathered_copper_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));


    //oxidizedcopperbricks and its variants
    public static final Block OXIDIZED_COPPER_BRICKS = registerBlock("oxidized_copper_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block OXIDIZED_COPPER_BRICK_SLAB = registerBlock("oxidized_copper_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block OXIDIZED_COPPER_BRICK_STAIRS = registerBlock("oxidized_copper_brick_stairs",
            new ModStairsBlock(ModBlocks.COPPER_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));

    public static final Block OXIDIZED_COPPER_BRICK_WALL = registerBlock("oxidized_copper_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).breakByHand(false).sounds(BlockSoundGroup.COPPER).strength(3, 6).requiresTool()));


    //register the blocks and their blockitem counterparts
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(UsefulBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(UsefulBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.USEFUL_BLOCKS)));
    }

    //prints in the console
    public static void registerModBlocks() {
        System.out.println("Registering UB mod blocks!");
    }

}
