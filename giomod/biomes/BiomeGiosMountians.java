package giomod.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGiosMountians extends BiomeGenBase
{
    public BiomeGiosMountians(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)Block.dirt.blockID;
        this.fillerBlock = (byte)Block.stone.blockID;
        this.theBiomeDecorator.treesPerChunk =  50;
        this.theBiomeDecorator.flowersPerChunk = 4;
        this.theBiomeDecorator.grassPerChunk = 10;
    }
}


