package giomod.oredictreg;

import giomod.GioMod;
import giomod.items.ModItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreRegistration

{
	
	public final static String SAPPHIRE = "Sapphire";
	public final static String RUBY = "Ruby";
	public final static String COPPERING = "Copper Ingot";
	public final static String NICKELING = "Nickel Ingot";
	
	public final static String SAPPHIREORE = "Sapphire Ore";
	public final static String RUBYORE = "Ruby Ore";
	public final static String COPPERORE = "Copper Ore";
	public final static String NICKELORE = "Nickel Ore";
	
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
