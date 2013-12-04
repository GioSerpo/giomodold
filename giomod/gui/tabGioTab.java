package giomod.gui;

import giomod.GioMod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public final class tabGioTab extends CreativeTabs 
{

	public tabGioTab(int par1, String par2str)
	{
		super(par1, par2str);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return GioMod.GioTabIcon.itemID;
	}
	public String getTranslateTabLabel()
	{
		return "Afflouhau Mods";
	}
}

