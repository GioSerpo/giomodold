package giomod.items;

import giomod.GioMod;
import giomod.items.armor.ItemEmeraldArmor;
import giomod.items.armor.ItemRubyArmor;
import giomod.items.armor.ItemSapphireArmor;
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
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItem {
	

	public static final EnumArmorMaterial enumEmeraldArmor = EnumHelper.addArmorMaterial("EMERALDARMOR", 40, new int[] {3,7,6,2}, 14);
	public static final EnumArmorMaterial enumRubyArmor = EnumHelper.addArmorMaterial("RUBYARMOR", 40, new int[] {3,7,6,2}, 14);
	public static final EnumArmorMaterial enumSapphireArmor = EnumHelper.addArmorMaterial("SAPPHIREARMOR", 40, new int[] {3,7,6,2}, 14);
	
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
	
	public static Item RubyGio, Sapphire, CopperIngot, NickelIngot;	
	/**Ruby, Sapphire, Copper, Nickel*/
	public static Item[] ingots = {RubyGio, Sapphire, CopperIngot, NickelIngot};
	public static String[] ingotNames = {"ruby", "sapphire", "ingotCopper", "ingotNickel"};
	public static String[] ingotTextures = {"rubygio", "sapphire", "copperingot", "nickelingot"};
	public static String[] ingotLocNames = {"Ruby", "Sapphire", "Copper Ingot", "Nickel Ingot"};
	
	public static Item BlackInkCartridge, ColorInkCartridge, EmptyInkCartridge;
	/**Black, Color, Empty*/
	public static Item[] cartridges = {BlackInkCartridge, ColorInkCartridge, EmptyInkCartridge};
	public static String[] cartridgeNames = {"cartridgeBlack", "cartridgeColor", "cartridgeEmpty"};
	public static String[] cartridgeTextures = {"blackinkcartridge", "colorinkcartridge", "emptyinkcartridge"};
	public static String[] cartridgeLocNames = {"Black Ink Cartridge", "Color Ink Cartridge", "Empty Ink Cartridge"};
	
	
	public static Item Dollar, Five, Ten, Twenty, Fifty, Hundred;
	/**In order of worth (1, 5, 10, 20, 50, 100)*/
	public static Item[] bills = {Dollar, Five, Ten, Twenty, Fifty, Hundred};
	public static String[] billNames = {"dollar", "five", "ten", "twenty", "fifty", "hundred"};
	public static String[] billTextures = {"onedollar", "fivedollar", "tendollar", "twentydollar", "fiftydollar", "hundreddollar"};
	public static String[] billLocNames = {"One Dollar Bill", "Five Dollar Bill", "Ten Dollar Bill", "Twenty Dollar Bill", "Fifty Dollar Bill", "Hundred Dollar Bill"};
	
	public static Item Penny, Nickel, Dime, Quarter;
	/**In order of worth (Penny, Nickel, Dime, Quarter)*/
	public static Item[] coins = {Penny, Nickel, Dime, Quarter};
	public static String[] coinNames = {"penny", "nickel", "dime", "quarter"}; //texture names are the same
	public static String[] coinLocNames = {"Penny", "Nickel", "Dime", "Quarter"};
	
	public static void registerItems()
	{
		for (int i = 0; i < 6; i++)
		{
			if (i < 4){
				ingots[i] = new ModItemBase(i + 10005, ingotTextures[i], ingotNames[i]);
				coins[i] = new ModItemBase(i + 10018, coinNames[i], coinNames[i]);
			}
			if (i < 3)
				cartridges[i] = new ModItemBase(i + 10009, cartridgeTextures[i], cartridgeNames[i]);

			bills[i] = new ModItemBase(i + 10012, billTextures[i], billNames[i]);
		}

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

		for (int i = 0; i < 6; i++)
		{
			if (i < 3)
				LanguageRegistry.instance().addStringLocalization("item." + cartridgeNames[i] + ".name", cartridgeLocNames[i]);
			if (i < 4){
				LanguageRegistry.instance().addStringLocalization("item." + ingotNames[i] + ".name", ingotLocNames[i]);
				LanguageRegistry.instance().addStringLocalization("item." + coinNames[i] + ".name", coinLocNames[i]);
			}
			LanguageRegistry.instance().addStringLocalization("item." + billNames[i] + ".name", billLocNames[i]);

		}
		
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
		
	}
}
