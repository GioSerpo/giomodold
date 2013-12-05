package giomod.oredictreg;

import giomod.GioMod;
import giomod.items.ModItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreRegistration

{
	
	public final static String SAPPHIRE = "gemSapphire";
	public final static String RUBY = "gemRuby";
	public final static String COPPERING = "ingotCopper";
	public final static String NICKELING = "ingotNickel";
	
	public final static String SAPPHIREORE = "oreSapphire";
	public final static String RUBYORE = "oreRuby";
	public final static String COPPERORE = "oreCopper";
	public final static String NICKELORE = "oreNickel";
	
	public static void ingotRegistration()
	{
	OreDictionary.registerOre(SAPPHIRE, new ItemStack (ModItem.ingots[0]));
	OreDictionary.registerOre(RUBY, new ItemStack (ModItem.ingots[1]));
	OreDictionary.registerOre(COPPERING, new ItemStack (ModItem.ingots[2]));
	OreDictionary.registerOre(NICKELING, new ItemStack (ModItem.ingots[3]));
	}
	
	public static void oreRegistration()
	{
	OreDictionary.registerOre(SAPPHIREORE, new ItemStack (GioMod.SapphireOre));
	OreDictionary.registerOre(RUBYORE, new ItemStack (GioMod.RubyOreGio));
	OreDictionary.registerOre(COPPERORE, new ItemStack (GioMod.CopperOre));
	OreDictionary.registerOre(NICKELORE, new ItemStack (GioMod.NickelOre));
	}
}
