package giomod.items.armor;

import giomod.GioMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class ItemRubyArmor extends ItemArmor
{
	public ItemRubyArmor(int par1, EnumArmorMaterial par2, int par3, int par4 )
	{
		super(par1, par2 ,par3, par4);
		this.setCreativeTab(GioMod.GioTab);
	}
	
	public void registerIcons(IconRegister Par1)
	{
		if (this.itemID == GioMod.RubyArmorHead.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:rubyarmor_head");
		}
		else if (this.itemID == GioMod.RubyArmorBody.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:rubyarmor_body");
		}
		else if (this.itemID == GioMod.RubyArmorLeggings.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:rubyarmor_leggins");
		}
		else if (this.itemID == GioMod.RubyArmorBoots.itemID)
		{
			itemIcon = Par1.registerIcon("giomod:rubyarmor_boots");
		}
		else
		{
			itemIcon = Par1.registerIcon("giomod:rubygio");
		}
	}
}
