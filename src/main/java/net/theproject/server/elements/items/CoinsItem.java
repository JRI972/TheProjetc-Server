package net.theproject.server.elements.items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CoinsItem extends Item {

    public CoinsItem(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        if(hand == Hand.MAIN_HAND){
            user.sendMessage(new TranslatableText((String) "item.tpserver.coins.tooltip"), true);
        }

        return super.use(world, user, hand);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText((String) "item.tpserver.coins.line1"));
    }

}
