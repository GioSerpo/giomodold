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
import giomod.items.ItemBlackInkCartridge;
import giomod.items.ItemColorInkCartridge;
import giomod.items.ItemEmptyInkCartridge;
import giomod.items.ItemGioTabIcon;
import giomod.items.armor.ItemEmeraldArmor;
import giomod.items.armor.ItemRubyArmor;
import giomod.items.armor.ItemSapphireArmor;
import giomod.items.coins.ItemDime;
import giomod.items.coins.ItemNickel;
import giomod.items.coins.ItemPenny;
import giomod.items.coins.ItemQuarter;
import giomod.items.ingots.ItemCopperIngot;
import giomod.items.ingots.ItemNickelIngot;
import giomod.items.ingots.ItemRubyGio;
import giomod.items.ingots.ItemSapphire;
import giomod.items.money.ItemDollar;
import giomod.items.money.ItemFifty;
import giomod.items.money.ItemFive;
import giomod.items.money.ItemHundred;
import giomod.items.money.ItemTen;
import giomod.items.money.ItemTwenty;
import giomod.items.tools.ItemEmeraldAxe;
import giomod.items.tools.ItemEmeraldHoe;
import giomod.items.tools.ItemEmeraldPickaxe;
import giomod.items.tools.ItemEmeraldShovel;
import giomod.items.tools.ItemEmeraldSword;
import giomod.items.tools.ItemRubyAxe;
import giomod.items.tools.ItemRubyHoe;
import giomod.items.tools.ItemRubyPickaxe;
import giomod.items.tools.ItemRubyShovel;
import giomod.items.tools.ItemRubySword;
import giomod.items.tools.ItemSapphireAxe;
import giomod.items.tools.ItemSapphireHoe;
import giomod.items.tools.ItemSapphirePickaxe;
import giomod.items.tools.ItemSapphireShovel;
import giomod.items.tools.ItemSapphireSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import giomod.handlers.GuiHandler;

@Mod(modid = "giomod", name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class GioMod {
	
	@Instance("giomod")
	public static GioMod instance;
	public static GuiHandler GuiHandler = new GuiHandler();
	public static CreativeTabs GioTab;
	public static Item GioTabIcon;
	
	public static final EnumArmorMaterial enumEmeraldArmor = EnumHelper.addArmorMaterial("EMERALDARMOR", 40, new int[] {3,7,6,2}, 14);
	public static final EnumArmorMaterial enumRubyArmor = EnumHelper.addArmorMaterial("RUBYARMOR", 40, new int[] {3,7,6,2}, 14);
	public static final EnumArmorMaterial enumSapphireArmor = EnumHelper.addArmorMaterial("SAPPHIREARMOR", 40, new int[] {3,7,6,2}, 14);
	
	public static Block RubyOreGio;
	public static Block SapphireOre;
	public static Block NickelOre;
	public static Block CopperOre;
	
	//add later
	public static Block MoneyPrinter;
	public static Block CoinPress;
	
	public static Item emeraldArmorHead;
	public static Item emeraldArmorBody;
	public static Item emeraldArmorLeggings;
	public static Item emeraldArmorBoots;
	
	public static Item EmeraldAxe;
	public static Item EmeraldHoe;
	public static Item EmeraldPickaxe;
	public static Item EmeraldShovel;
	public static Item EmeraldSword;
	
	public static Item RubyArmorHead;
	public static Item RubyArmorBody;
	public static Item RubyArmorLeggings;
	public static Item RubyArmorBoots;
	
	public static Item RubyAxe;
	public static Item RubyHoe;
	public static Item RubyPickaxe;
	public static Item RubyShovel;
	public static Item RubySword;
	
	public static Item SapphireArmorHead;
	public static Item SapphireArmorBody;
	public static Item SapphireArmorLeggings;
	public static Item SapphireArmorBoots;
	
	public static Item SapphireAxe;
	public static Item SapphireHoe;
	public static Item SapphirePickaxe;
	public static Item SapphireShovel;
	public static Item SapphireSword;
	
	public static Item RubyGio;
	public static Item Sapphire;
	public static Item CopperIngot;
	public static Item NickelIngot;
	
	public static Item BlackInkCartridge;
	public static Item ColorInkCartridge;
	public static Item EmptyInkCartridge;
	
	public static Item Dollar;
	public static Item Five;
	public static Item Ten;
	public static Item Twenty;
	public static Item Fifty;
	public static Item Hundred;
	
	public static Item Penny;
	public static Item Nickel;
	public static Item Dime;
	public static Item Quarter;
	
	public static BiomeGenBase GiosMountians;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		NetworkRegistry.instance().registerGuiHandler(this, GuiHandler);
	}

	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	
		GioTab = (new tabGioTab(CreativeTabs.getNextID(), "tabGioTab"));
		GioTabIcon = (new ItemGioTabIcon(3000).setUnlocalizedName("Afflouhau Mods"));
		
		GiosMountians = (new BiomeGiosMountians(30).setBiomeName("Mountains").setMinMaxHeight(0.2F, 0.8F));
		
		RubyOreGio = (new BlockRubyOreGio(1000,"RubyOre").setUnlocalizedName("Ruby Ore").setHardness(4.0F));
		SapphireOre = (new BlockSapphireOreGio(1001,"SapphireOre").setUnlocalizedName("Sapphire Ore").setHardness(4.0F));
		CopperOre = (new BlockCopperOre(1002,"CopperOre").setUnlocalizedName("Copper Ore").setHardness(2.0F));
		NickelOre = (new BlockNickelOre(1003,"NickelOre").setUnlocalizedName("Nickel Ore").setHardness(2.0F));
		
		CoinPress = (new BlockCoinPress(1004,"CoinPress").setUnlocalizedName("Coin Press").setHardness(2.0F));
		MoneyPrinter = (new BlockMoneyPrinter(1005,"MoneyPrinter").setUnlocalizedName("Money Printer").setHardness(2.0F));
		
		RubyGio = (new ItemRubyGio(1006).setUnlocalizedName("Ruby"));
		Sapphire = (new ItemSapphire(1007).setUnlocalizedName("Sapphire"));
	    CopperIngot = (new ItemCopperIngot(1008).setUnlocalizedName("Copper Ingot"));
		NickelIngot = (new ItemNickelIngot(1009).setUnlocalizedName("Nickel Ingot"));
		
		BlackInkCartridge = (new ItemBlackInkCartridge(1010).setUnlocalizedName("Black Ink Cartridge"));
		ColorInkCartridge = (new ItemColorInkCartridge(1011).setUnlocalizedName("Color Ink Cartridge"));
		EmptyInkCartridge = (new ItemEmptyInkCartridge(1012).setUnlocalizedName("Empty Ink Cartridge"));
		
		Dollar = (new ItemDollar(1013).setUnlocalizedName("One Dollar Bill"));
		Five = (new ItemFive(1014).setUnlocalizedName("Five Dollar Bill"));
		Ten = (new ItemTen(1015).setUnlocalizedName("Ten Dollar Bill"));
		Twenty = (new ItemTwenty(1016).setUnlocalizedName("Twenty Dollar Bill"));
		Fifty = (new ItemFifty(1017).setUnlocalizedName("Fifty Dollar Bill"));
		Hundred = (new ItemHundred(1018).setUnlocalizedName("Hundred Dollar Bill"));
		
		Penny = (new ItemPenny(1019).setUnlocalizedName("Penny"));
		Nickel = (new ItemNickel(1020).setUnlocalizedName("Nickel"));
		Dime = (new ItemDime(1021).setUnlocalizedName("Dime"));
		Quarter = (new ItemQuarter(1022).setUnlocalizedName("Quarter"));
		
		emeraldArmorHead = (new ItemEmeraldArmor(1023, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("emeraldarmor"), 0).setUnlocalizedName("Emerald Helmet"));
		emeraldArmorBody = (new ItemEmeraldArmor(1024, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("emeraldarmor"), 1).setUnlocalizedName("Emerald Chestplate"));
		emeraldArmorLeggings = (new ItemEmeraldArmor(1025, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("emeraldarmor"), 2).setUnlocalizedName("Emerald Leggings"));
		emeraldArmorBoots = (new ItemEmeraldArmor(1026, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("emeraldarmor"), 3).setUnlocalizedName("Emerald Boots"));
		
		RubyArmorHead = (new ItemRubyArmor(1027, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("rubyarmor"), 0).setUnlocalizedName("Ruby Helmet"));
		RubyArmorBody = (new ItemRubyArmor(1028, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("rubyarmor"), 1).setUnlocalizedName("Ruby Chestplate"));
		RubyArmorLeggings = (new ItemRubyArmor(1029, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("rubyarmor"), 2).setUnlocalizedName("Ruby Leggings"));
		RubyArmorBoots = (new ItemRubyArmor(1030, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("rubyarmor"), 3).setUnlocalizedName("Ruby Boots"));
		
		SapphireArmorHead = (new ItemSapphireArmor(1031, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("sapphirearmor"), 0).setUnlocalizedName("Sapphire Helmet"));
		SapphireArmorBody = (new ItemSapphireArmor(1032, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("sapphirearmor"), 1).setUnlocalizedName("Sapphire Chestplate"));
		SapphireArmorLeggings = (new ItemSapphireArmor(1033, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("sapphirearmor"), 2).setUnlocalizedName("Sapphire Leggings"));
		SapphireArmorBoots = (new ItemSapphireArmor(1034, enumEmeraldArmor, RenderingRegistry.addNewArmourRendererPrefix("sapphirearmor"), 3).setUnlocalizedName("Sapphire Boots"));
		
		EmeraldAxe = (new ItemEmeraldAxe(1035, EnumToolMaterial.IRON).setUnlocalizedName("Emerald Axe").setCreativeTab(GioMod.GioTab));
		EmeraldHoe = (new ItemEmeraldHoe(1036, EnumToolMaterial.IRON).setUnlocalizedName("Emerald Hoe").setCreativeTab(GioMod.GioTab));
		EmeraldPickaxe = (new ItemEmeraldPickaxe(1037, EnumToolMaterial.IRON).setUnlocalizedName("Emerald Pickaxe").setCreativeTab(GioMod.GioTab));
		EmeraldShovel = (new ItemEmeraldShovel(1038, EnumToolMaterial.IRON).setUnlocalizedName("Emerald Shovel").setCreativeTab(GioMod.GioTab));
		EmeraldSword = (new ItemEmeraldSword(1039, EnumToolMaterial.IRON).setUnlocalizedName("Emerald Sword").setCreativeTab(GioMod.GioTab));
		
		RubyAxe = (new ItemRubyAxe(1040, EnumToolMaterial.IRON).setUnlocalizedName("Ruby Axe").setCreativeTab(GioMod.GioTab));
		RubyHoe = (new ItemRubyHoe(1041, EnumToolMaterial.IRON).setUnlocalizedName("Ruby Hoe").setCreativeTab(GioMod.GioTab));
		RubyPickaxe = (new ItemRubyPickaxe(1042, EnumToolMaterial.IRON).setUnlocalizedName("Ruby Pickaxe").setCreativeTab(GioMod.GioTab));
		RubyShovel = (new ItemRubyShovel(1043, EnumToolMaterial.IRON).setUnlocalizedName("Ruby Shovel").setCreativeTab(GioMod.GioTab));
		RubySword = (new ItemRubySword(1044, EnumToolMaterial.IRON).setUnlocalizedName("Ruby Sword").setCreativeTab(GioMod.GioTab));
		
		SapphireAxe = (new ItemSapphireAxe(1045, EnumToolMaterial.IRON).setUnlocalizedName("Sapphire Axe").setCreativeTab(GioMod.GioTab));
		SapphireHoe = (new ItemSapphireHoe(1046, EnumToolMaterial.IRON).setUnlocalizedName("Sapphire Hoe").setCreativeTab(GioMod.GioTab));
		SapphirePickaxe = (new ItemSapphirePickaxe(1047, EnumToolMaterial.IRON).setUnlocalizedName("Spphire Pickaxe").setCreativeTab(GioMod.GioTab));
		SapphireShovel = (new ItemSapphireShovel(1048, EnumToolMaterial.IRON).setUnlocalizedName("Sapphire Shovel").setCreativeTab(GioMod.GioTab));
		SapphireSword = (new ItemSapphireSword(1049, EnumToolMaterial.IRON).setUnlocalizedName("Sapphire Sword").setCreativeTab(GioMod.GioTab));
		
		GameRegistry.registerBlock(RubyOreGio);
		GameRegistry.registerBlock(SapphireOre);
		GameRegistry.registerBlock(CopperOre);
		GameRegistry.registerBlock(NickelOre);
		
		GameRegistry.registerBlock(CoinPress);
		GameRegistry.registerBlock(MoneyPrinter);
		
		GameRegistry.addSmelting(GioMod.CopperOre.blockID, new ItemStack (GioMod.CopperIngot), 0.4f);
		GameRegistry.addSmelting(GioMod.NickelOre.blockID, new ItemStack(GioMod.NickelIngot), 0.4f);
		
		LanguageRegistry.addName(GioTabIcon, "Afflouhau Mods");
		
		LanguageRegistry.addName(RubyOreGio, "Ruby Ore");
		LanguageRegistry.addName(SapphireOre, "Sapphire Ore");
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(NickelOre, "Nickel Ore");
		
		LanguageRegistry.addName(RubyGio, "Ruby");
		LanguageRegistry.addName(Sapphire, "Sapphire");
		LanguageRegistry.addName(CopperIngot, "Copper Ingot");
		LanguageRegistry.addName(NickelIngot, "Nickel Ingot");
		
		LanguageRegistry.addName(BlackInkCartridge, "Black Ink Cartridge");
		LanguageRegistry.addName(ColorInkCartridge, "Color Ink Cartridge");
		LanguageRegistry.addName(EmptyInkCartridge, "Empty Ink Cartridge");
		
		LanguageRegistry.addName(Dollar, "One Dollar Bill");
		LanguageRegistry.addName(Five, "Five Dollar Bill");
		LanguageRegistry.addName(Ten, "Ten Dollar Bill");
		LanguageRegistry.addName(Twenty, "Twenty Dollar Bill");
		LanguageRegistry.addName(Fifty, "Fifty Dollar Bill");
		LanguageRegistry.addName(Hundred, "Hundred Dollar Bill");
		
		LanguageRegistry.addName(Penny, "Penny");
		LanguageRegistry.addName(Nickel, "Nickel");
		LanguageRegistry.addName(Dime, "Dime");
		LanguageRegistry.addName(Quarter, "Quarter");
		
		LanguageRegistry.addName(emeraldArmorHead, "Emerald Helmet");
		LanguageRegistry.addName(emeraldArmorBody, "Emelrad Chestplate");
		LanguageRegistry.addName(emeraldArmorLeggings, "Emerald Leggings");
		LanguageRegistry.addName(emeraldArmorBoots, "Emerald Boots");
	
		LanguageRegistry.addName(RubyArmorHead, "Ruby Helmet");
		LanguageRegistry.addName(RubyArmorBody, "Ruby Chestplate");
		LanguageRegistry.addName(RubyArmorLeggings, "Ruby Leggings");
		LanguageRegistry.addName(RubyArmorBoots, "Ruby Boots");
		
		LanguageRegistry.addName(SapphireArmorHead, "Sapphire Helmet");
		LanguageRegistry.addName(SapphireArmorBody, "Sapphire Chestplate");
		LanguageRegistry.addName(SapphireArmorLeggings, "Sapphire Leggings");
		LanguageRegistry.addName(SapphireArmorBoots, "Sapphire Boots");
		
		LanguageRegistry.addName(EmeraldAxe, "Emerald Axe");
		LanguageRegistry.addName(EmeraldHoe, "Emelrad Hoe");
		LanguageRegistry.addName(EmeraldPickaxe, "Emerald Pickaxe");
		LanguageRegistry.addName(EmeraldShovel, "Emerald Shovel");
		LanguageRegistry.addName(EmeraldSword, "Emerald Sword");
		
		LanguageRegistry.addName(RubyAxe, "Ruby Axe");
		LanguageRegistry.addName(RubyHoe, "Ruby Hoe");
		LanguageRegistry.addName(RubyPickaxe, "Ruby Pickaxe");
		LanguageRegistry.addName(RubyShovel, "Ruby Shovel");
		LanguageRegistry.addName(RubySword, "Ruby Sword");
		
		LanguageRegistry.addName(SapphireAxe, "Sapphire Axe");
		LanguageRegistry.addName(SapphireHoe, "Sapphire Hoe");
		LanguageRegistry.addName(SapphirePickaxe, "Sapphire Pickaxe");
		LanguageRegistry.addName(SapphireShovel, "Sapphire Shovel");
		LanguageRegistry.addName(SapphireSword, "Sapphire Sword");
		
		LanguageRegistry.addName(CoinPress, "Coin Press");
		LanguageRegistry.addName(MoneyPrinter, "Money Printer");
		
		GameRegistry.addRecipe(new ItemStack(GioMod.EmptyInkCartridge, 1), new Object []
				{
				"RRR", "R0R", "RRR", 'R', Item.redstone
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.CoinPress, 1), new Object []
				{
				"PPP", "N0N", "PPP", 'P', Block.pistonBase, 'N', GioMod.NickelIngot
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.MoneyPrinter, 1), new Object []
				{
				"C0B", "NNN", "III", 'C', GioMod.ColorInkCartridge, 'B', GioMod.BlackInkCartridge, 'N', GioMod.NickelIngot, 'I', GioMod.CopperIngot
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.emeraldArmorHead, 1), new Object []
				{
				"EEE", "E0E", "000", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.emeraldArmorBody, 1), new Object []
				{
				"E0E", "EEE", "EEE", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.emeraldArmorLeggings, 1), new Object []
				{
				"EEE", "E0E", "E0E", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.emeraldArmorBoots, 1), new Object []
				{
				"E0E", "E0E", "000", 'E', Item.emerald
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyArmorHead, 1), new Object []
				{
				"RRR", "R0R", "000", 'R', GioMod.RubyGio
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyArmorBody, 1), new Object []
				{
				"R0R", "RRR", "RRR", 'R', GioMod.RubyGio
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyArmorLeggings, 1), new Object []
				{
				"RRR", "R0R", "R0R", 'R', GioMod.RubyGio
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyArmorBoots, 1), new Object []
				{
				"R0R", "R0R", "000", 'R', GioMod.RubyGio
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireArmorHead, 1), new Object []
				{
				"RRR", "R0R", "000", 'R', GioMod.Sapphire
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireArmorBody, 1), new Object []
				{
				"R0R", "RRR", "RRR", 'R', GioMod.Sapphire
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireArmorLeggings, 1), new Object []
				{
				"RRR", "R0R", "R0R", 'R', GioMod.Sapphire
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireArmorBoots, 1), new Object []
				{
				"R0R", "R0R", "000", 'R', GioMod.Sapphire
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.EmeraldAxe, 1), new Object []
				{
				"EE0", "ES0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.EmeraldHoe, 1), new Object []
				{
				"EE0", "0S0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.EmeraldPickaxe, 1), new Object []
				{
				"EEE", "0S0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.EmeraldShovel, 1), new Object []
				{
				"0E0", "0S0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.EmeraldSword, 1), new Object []
				{
				"0E0", "0E0", "0S0", 'E', Item.emerald, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyAxe, 1), new Object []
				{
				"EE0", "ES0", "0S0", 'E', GioMod.RubyGio, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyHoe, 1), new Object []
				{
				"EE0", "0S0", "0S0", 'E', GioMod.RubyGio, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyPickaxe, 1), new Object []
				{
				"EEE", "0S0", "0S0", 'E', GioMod.RubyGio, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubyShovel, 1), new Object []
				{
				"0E0", "0S0", "0S0", 'E', GioMod.RubyGio, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.RubySword, 1), new Object []
				{
				"0E0", "0E0", "0S0", 'E', GioMod.RubyGio, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireAxe, 1), new Object []
				{
				"EE0", "ES0", "0S0", 'E', GioMod.Sapphire, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireHoe, 1), new Object []
				{
				"EE0", "0S0", "0S0", 'E', GioMod.Sapphire, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphirePickaxe, 1), new Object []
				{
				"EEE", "0S0", "0S0", 'E', GioMod.Sapphire, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireShovel, 1), new Object []
				{
				"0E0", "0S0", "0S0", 'E', GioMod.Sapphire, 'S', Item.stick
				});
		
		GameRegistry.addRecipe(new ItemStack(GioMod.SapphireSword, 1), new Object []
				{
				"0E0", "0E0", "0S0", 'E', GioMod.Sapphire, 'S', Item.stick
				});
		
		GameRegistry.addShapelessRecipe(new ItemStack(GioMod.BlackInkCartridge, 1), new Object []
				{
				GioMod.EmptyInkCartridge, new ItemStack(Item.dyePowder, 0, 0)
				});
		
		GameRegistry.addShapelessRecipe(new ItemStack(GioMod.ColorInkCartridge, 1), new Object []
				{
				GioMod.EmptyInkCartridge, new ItemStack(Item.dyePowder, 6, 6), new ItemStack(Item.dyePowder, 11, 11), new ItemStack(Item.dyePowder, 14, 14)
				});
		
		new GenerationHandler();
	}
	
	public GioMod ()
	{
		
	}
}