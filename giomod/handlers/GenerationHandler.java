package giomod.handlers;

import giomod.GioMod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHandler implements IWorldGenerator {

	private WorldGenerator RubyOreGen;
	private WorldGenerator SapphireOreGen;
	private WorldGenerator CopperOreGen;
	private WorldGenerator NickelOreGen;
	
	public GenerationHandler() {
		GameRegistry.registerWorldGenerator(this);
		RubyOreGen = new WorldGenMinable(GioMod.RubyOreGio.blockID, 8);
		SapphireOreGen = new WorldGenMinable(GioMod.SapphireOre.blockID, 8);
		CopperOreGen = new WorldGenMinable(GioMod.CopperOre.blockID, 8);
		NickelOreGen = new WorldGenMinable(GioMod.NickelOre.blockID, 8);
	}
	
	public void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int Iterations, WorldGenerator gen, int lowestY, int highestY){
		for (int i = 0; i < Iterations; i++){
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateStandardOre(random, chunkX, chunkZ, world, 5, RubyOreGen, 0, 32);
		generateStandardOre(random, chunkX, chunkZ, world, 5, SapphireOreGen, 0, 32);
		generateStandardOre(random, chunkX, chunkZ, world, 10, CopperOreGen, 0, 64);
		generateStandardOre(random, chunkX, chunkZ, world, 10, NickelOreGen, 0, 64);
	}

}
