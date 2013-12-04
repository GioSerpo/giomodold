package giomod.blocks.machines;

import giomod.GioMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class BlockMoneyPrinter extends Block {
	public BlockMoneyPrinter(int par1, String par2) {
		super(par1, Material.iron);
		setCreativeTab(GioMod.GioTab);
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return this.blockID;
	}

	public int quantityDropped(Random par1Random) {
		return 1;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int var6, float var7, float var8, float var9)
	{
	if (!player.isSneaking())
	{
	player.openGui(GioMod.instance, 1, world, x, y, z);
	return true;
	}
	else
	{
	return false;
	}
	}

	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	@SideOnly(Side.CLIENT)
	public static Icon frontIcon;

	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon("giomod:blockmoneyprinter_top");
		bottomIcon = icon.registerIcon("giomod:blockmoneyprinter_bottom");
		sideIcon = icon.registerIcon("giomod:blockmoneyprinter_side");
		frontIcon = icon.registerIcon("giomod:blockmoneyprinter_front");
	}

	public Icon getIcon(int side, int metadata) {
		if (side == 0)
			return bottomIcon;
		if (side == 1)
			return topIcon;
		return (side == 3 && metadata == 0 ? frontIcon : side == 2
				&& metadata == 2 ? frontIcon
				: side == 4 && metadata == 1 ? frontIcon : side == 5
						&& metadata == 3 ? frontIcon : sideIcon);
	}

	public void onBlockPlacedBy(World world, int x, int y, int z,
			EntityLivingBase base, ItemStack stack) {
		int l = MathHelper
				.floor_double((double) (base.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		world.setBlockMetadataWithNotify(x, y, z, l, 2);
	}
}