package net.theproject.server;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.theproject.server.utils.Logger.logInfo;

public class Init implements ModInitializer {

	public static final String MOD_ID = "tpserver";
	
	//ITEM
	public static final Item COINS = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(1000).maxDamage(0).rarity(Rarity.COMMON));

	@Override
	public void onInitialize() {
		logInfo("Hello Fabric world!");


		//Registerie
			//Item
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, "coins"), COINS);
	}
}
