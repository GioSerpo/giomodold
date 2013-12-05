package giomod.items.armor;

import giomod.GioMod;
import giomod.items.ModItem;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class ItemSapphireArmor extends ItemArmor
{
	public ItemSapphireArmor(int par1, EnumArmorMaterial par2, int par3, int par4 )
	{
		super(par1, par2 ,par3, par4);
		this.setCreativeTab(GioMod.GioTab);
	}
	
	public void registerIcons(IconRegister Par1)
	{
		if (this.itemID == ModItem.SapphireArmorHead.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:sapphirearmor_head");
		}
		else if (this.itemID == ModItem.SapphireArmorBody.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:sapphirearmor_body");
		}
		else if (this.itemID == ModItem.SapphireArmorLeggings.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:sapphirearmor_leggins");
		}
		else if (this.itemID == ModItem.SapphireArmorBoots.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:sapphirearmor_boots");
		}
		else
		{
			itemIcon = Par1.registerIcon("giomod:sapphire");
		}
	}
}