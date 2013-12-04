package giomod.handlers;

import giomod.GioMod;
import giomod.gui.ContainerCoinPress;
import giomod.gui.ContainerMoneyPrinter;
import giomod.gui.GuiCoinPress;
import giomod.gui.GuiMoneyPrinter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;


public class GuiHandler implements IGuiHandler
{
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
                //TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                switch(id)
                {
                        case 1: return new ContainerMoneyPrinter(player.inventory, world, x, y, z);
                        case 2: return new ContainerCoinPress(player.inventory, world, x, y, z);
                }
                return null;
                }
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
               //TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                switch(id)
                {
                	case 1: return new GuiMoneyPrinter(player.inventory, world, x, y, z);
                	case 2: return new GuiCoinPress(player.inventory, world, x, y, z);
                }
                return null;
        }
}