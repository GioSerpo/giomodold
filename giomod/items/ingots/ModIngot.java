package giomod.items.ingots;

import giomod.GioMod;
import giomod.items.ModItemBase;
import net.minecraft.client.renderer.texture.IconRegister;

public class ModIngot extends ModItemBase{

	private String textureName;
	
	public ModIngot(int id, String textureName, String unlocName)
	{
		super(id);
		setCreativeTab(GioMod.GioTab);
		this.textureName = textureName;
		setUnlocalizedName(unlocName);
	}
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:" + textureName);
	}
	
}
