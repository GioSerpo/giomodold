package giomod.items;

import net.minecraft.item.Item;
import giomod.GioMod;

public class ModItemBase extends Item {
	
	public ModItemBase(int id)
	{
		super(id);
		setCreativeTab(GioMod.GioTab);
	}

}
