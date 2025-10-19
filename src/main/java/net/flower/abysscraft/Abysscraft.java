package net.flower.abysscraft;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abysscraft implements ModInitializer {
	public static final String MOD_ID = "abysscraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
//        CustomPortalBuilder.beginPortal()
//                .frameBlock(Blocks.DIAMOND_BLOCK)
//                .lightWithItem(Items.DIAMOND_SWORD)
//                .destDimID(Identifier.of(MOD_ID, "abyss"))
//                .tintColor(0, 0, 0)
//                .registerPortal();
	}
}