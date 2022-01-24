package net.jayinblue.usefulblocks;

import net.fabricmc.api.ModInitializer;
import net.jayinblue.usefulblocks.block.ModBlocks;
import net.jayinblue.usefulblocks.item.ModItems;

public class UsefulBlocks implements ModInitializer {

	public static final String MOD_ID = "usefulblocks";

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		System.out.println("UsefulBlocks 1.18.1-1.0.1 is initializing! F*CK COPPER ALL MY HOMIES HATE COPPER");
	}
}
