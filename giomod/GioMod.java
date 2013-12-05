package giomod;

import giomod.biomes.BiomeGiosMountians;
import giomod.blocks.machines.BlockCoinPress;
import giomod.blocks.machines.BlockMoneyPrinter;
import giomod.blocks.ores.BlockCopperOre;
import giomod.blocks.ores.BlockNickelOre;
import giomod.blocks.ores.BlockRubyOreGio;
import giomod.blocks.ores.BlockSapphireOreGio;
import giomod.gui.tabGioTab;
import giomod.handlers.GenerationHandler;
import giomod.handlers.GuiHandler;
import giomod.items.ModItem;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "giomod", name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class GioMod
{
	
	@Instance("giomod")
	public static GioMod instance;
	public static GuiHandler GuiHandler = new GuiHandler();
	
	public static Block RubyOreGio;
	public static Block SapphireOre;
	public static Block NickelOre;
	public static Block CopperOre;
	
	//add later
	public static Block MoneyPrinter;
	public static Block CoinPress;
	
	public static BiomeGenBase GiosMountians;
	
	public static CreativeTabs GioTab = (new tabGioTab(CreativeTabs.getNextID()));

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		NetworkRegistry.instance().registerGuiHandler(this, GuiHandler);
	}

	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{		
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.gioTab", "Afflouhau Mods");
		
		ModItem.registerItems();

		GiosMountians = (new BiomeGiosMountians(30).setBiomeName("Mountains").setMinMaxHeight(0.2F, 0.8F));
		
		RubyOreGio = (new BlockRubyOreGio(1000,"RubyOre").setUnlocalizedName("Ruby Ore").setHardness(4.0F));
		SapphireOre = (new BlockSapphireOreGio(1001,"SapphireOre").setUnlocalizedName("Sapphire Ore").setHardness(4.0F));
		CopperOre = (new BlockCopperOre(1002,"CopperOre").setUnlocalizedName("Copper Ore").setHardness(2.0F));
		NickelOre = (new BlockNickelOre(1003,"NickelOre").setUnlocalizedName("Nickel Ore").setHardness(2.0F));
		
		CoinPress = (new BlockCoinPress(1004,"CoinPress").setUnlocalizedName("Coin Press").setHardness(2.0F));
		MoneyPrinter = (new BlockMoneyPrinter(1005,"MoneyPrinter").setUnlocalizedName("Money Printer").setHardness(2.0F));
		
		GameRegistry.addSmelting(GioMod.CopperOre.blockID, new ItemStack (ModItem.ingots[2]), 0.4f);
		GameRegistry.addSmelting(GioMod.NickelOre.blockID, new ItemStack(ModItem.ingots[3]), 0.4f);
				
		LanguageRegistry.addName(RubyOreGio, "Ruby Ore");
		LanguageRegistry.addName(SapphireOre, "Sapphire Ore");
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(NickelOre, "Nickel Ore");
		
		LanguageRegistry.addName(CoinPress, "Coin Press");
		LanguageRegistry.addName(MoneyPrinter, "Money Printer");
		
		GameRegistry.registerBlock(RubyOreGio, "rubyOre");
		GameRegistry.registerBlock(SapphireOre, "sapphireOre");
		GameRegistry.registerBlock(CopperOre, "copperOre");
		GameRegistry.registerBlock(NickelOre, "nickelOre");
		
		GameRegistry.registerBlock(CoinPress, "coinPress");
		GameRegistry.registerBlock(MoneyPrinter, "moneyPrinter");
		
		GameRegistry.addRecipe(new ItemStack(ModItem.cartridges[0], 1), new Object []
				{
				"RRR", "R0R", "RRR", 'R', Item.redstone
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.CoinPress, 1), new Object []
				{
				"PPP", "N0N", "PPP", 'P', Block.pistonBase, 'N', ModItem.ingots[3]
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.MoneyPrinter, 1), new Object []
				{
				"C0B", "NNN", "III", 'C', ModItem.cartridges[1], 'B', ModItem.cartridges[0], 'N', ModItem.ingots[3], 'I', ModItem.ingots[2]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.emeraldArmorHead, 1), new Object []
				{
				"EEE", "E0E", "000", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.emeraldArmorBody, 1), new Object []
				{
				"E0E", "EEE", "EEE", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.emeraldArmorLeggings, 1), new Object []
				{
				"EEE", "E0E", "E0E", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.emeraldArmorBoots, 1), new Object []
				{
				"E0E", "E0E", "000", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyArmorHead, 1), new Object []
				{
				"RRR", "R0R", "000", 'R', ModItem.ingots[0]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyArmorBody, 1), new Object []
				{
				"R0R", "RRR", "RRR", 'R', ModItem.ingots[0]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyArmorLeggings, 1), new Object []
				{
				"RRR", "R0R", "R0R", 'R', ModItem.ingots[0]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyArmorBoots, 1), new Object []
				{
				"R0R", "R0R", "000", 'R', ModItem.ingots[0]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireArmorHead, 1), new Object []
				{
				"RRR", "R0R", "000", 'R', ModItem.ingots[1]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireArmorBody, 1), new Object []
				{
				"R0R", "RRR", "RRR", 'R', ModItem.ingots[1]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireArmorLeggings, 1), new Object []
				{
				"RRR", "R0R", "R0R", 'R', ModItem.ingots[1]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireArmorBoots, 1), new Object []
				{
				"R0R", "R0R", "000", 'R', ModItem.ingots[1]
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.EmeraldAxe, 1), new Object []
				{
				"EE0", "ES0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.EmeraldHoe, 1), new Object []
				{
				"EE0", "0S0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.EmeraldPickaxe, 1), new Object []
				{
				"EEE", "0S0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.EmeraldShovel, 1), new Object []
				{
				"0E0", "0S0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.EmeraldSword, 1), new Object []
				{
				"0E0", "0E0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyAxe, 1), new Object []
				{
				"EE0", "ES0", "0S0", 'E', ModItem.ingots[0], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyHoe, 1), new Object []
				{
				"EE0", "0S0", "0S0", 'E', ModItem.ingots[0], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyPickaxe, 1), new Object []
				{
				"EEE", "0S0", "0S0", 'E', ModItem.ingots[0], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubyShovel, 1), new Object []
				{
				"0E0", "0S0", "0S0", 'E', ModItem.ingots[0], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.RubySword, 1), new Object []
				{
				"0E0", "0E0", "0S0", 'E', ModItem.ingots[0], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireAxe, 1), new Object []
				{
				"EE0", "ES0", "0S0", 'E', ModItem.ingots[1], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireHoe, 1), new Object []
				{
				"EE0", "0S0", "0S0", 'E', ModItem.ingots[1], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphirePickaxe, 1), new Object []
				{
				"EEE", "0S0", "0S0", 'E', ModItem.ingots[1], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireShovel, 1), new Object []
				{
				"0E0", "0S0", "0S0", 'E', ModItem.ingots[1], 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(ModItem.SapphireSword, 1), new Object []
				{
				"0E0", "0E0", "0S0", 'E', ModItem.ingots[1], 'S', Item.stick
				});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItem.cartridges[0], 1), new Object []
				{
				ModItem.cartridges[0], new ItemStack(Item.dyePowder, 0, 0)
				});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItem.cartridges[1], 1), new Object []
				{
				ModItem.cartridges[0], new ItemStack(Item.dyePowder, 6, 6), new ItemStack(Item.dyePowder, 11, 11), new ItemStack(Item.dyePowder, 14, 14)
				});
		
		new GenerationHandler();
	}
	
	public GioMod ()
	{
		
	}
}