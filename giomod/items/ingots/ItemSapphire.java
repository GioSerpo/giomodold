package giomod.items.ingots;

import giomod.GioMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemSapphire extends Item
{
	public ItemSapphire(int par1)
	{
		super(par1);
		setCreativeTab(GioMod.GioTab);
	}
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:sapphire");
	}
}