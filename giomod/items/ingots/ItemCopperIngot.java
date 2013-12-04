package giomod.items.ingots;

import giomod.GioMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item
{
	public ItemCopperIngot(int par1)
	{
		super(par1);
		setCreativeTab(GioMod.GioTab);
	}
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:copperingot");
	}
}