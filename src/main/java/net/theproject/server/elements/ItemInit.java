package net.theproject.server.elements;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.theproject.server.elements.items.CoinsItem;
import net.minecraft.text.Text;


import static net.theproject.server.Init.MOD_ID;

import javax.sound.sampled.Line;

import com.mojang.datafixers.types.templates.List;


public class ItemInit {

    //Item
	public static final Item COINS = new CoinsItem(new FabricItemSettings().group(ItemGroup.MISC).fireproof().maxCount(1000).maxDamage(0).rarity(Rarity.COMMON));
    
    public static void Init(){
	    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "coins"), COINS);
	}
	
}
