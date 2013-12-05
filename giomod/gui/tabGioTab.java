package giomod.gui;

import giomod.GioMod;
import giomod.items.ModItem;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public final class tabGioTab extends CreativeTabs 
{

	public tabGioTab(int id)
	{
		super(id, "gioTab");
	}
	@Override
	public String getTabLabel() {
		return "gioTab";
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return ModItem.EmeraldPickaxe.itemID;
	}
}

