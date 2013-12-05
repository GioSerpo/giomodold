package giomod.items.armor;

import giomod.GioMod;
import giomod.items.ModItem;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemEmeraldArmor extends ItemArmor
{
	public ItemEmeraldArmor(int par1, EnumArmorMaterial par2, int par3, int par4 )
	{
		super(par1, par2 ,par3, par4);
		this.setCreativeTab(GioMod.GioTab);
	}
	
	public void registerIcons(IconRegister Par1)
	{
		if (this.itemID == ModItem.emeraldArmorHead.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:emeraldarmor_head");
		}
		else if (this.itemID == ModItem.emeraldArmorBody.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:emeraldarmor_body");
		}
		else if (this.itemID == ModItem.emeraldArmorLeggings.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:emeraldarmor_leggins");
		}
		else if (this.itemID == ModItem.emeraldArmorBoots.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:emeraldarmor_boots");
		}
		else
		{
			itemIcon = Par1.registerIcon("giomod:dime");
		}
	}
}


