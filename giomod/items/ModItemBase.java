<<<<<<< HEAD
package giomod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import giomod.GioMod;

public class ModItemBase extends Item {
	
	private String textureName;
	
	public ModItemBase(int id, String textureName, String unlocName)
	{
		super(id);
		setCreativeTab(GioMod.GioTab);
		setUnlocalizedName(unlocName);
		this.textureName = textureName;
	}
	
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:" + textureName);
	}

}
=======
package giomod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import giomod.GioMod;

public class ModItemBase extends Item {
	
	private String textureName;
	
	public ModItemBase(int id, String textureName, String unlocName)
	{
		super(id);
		setCreativeTab(GioMod.GioTab);
		setUnlocalizedName(unlocName);
		this.textureName = textureName;
	}
	
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:" + textureName);
	}

}
>>>>>>> 1e4a46207a31f1402db5e46d4a919f14c3d2c27d
