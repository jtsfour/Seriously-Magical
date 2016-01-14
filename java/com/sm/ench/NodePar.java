package com.sm.ench;

import java.util.ArrayList;



import scala.actors.threadpool.Arrays;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NodePar {
	public World WORLD;
	public EntityPlayer PLAYER;
	public Block BLOCK;
	//public EItem ITEM;
	public ArrayList<EntityLivingBase> entityaff = new ArrayList();
	public ArrayList<Block> blockaff = new ArrayList();
	public double x;
	public double y;
	public double z;
	public int eventtype = 0;
	
	
	
	
	/*public NodePar(World world,int etype, EntityPlayer player, EItem item,EntityLivingBase... ents){
		WORLD = world;
		eventtype = etype;
		PLAYER=player;
		entityaff=(ArrayList<EntityLivingBase>)Arrays.asList(ents);
		ITEM=item;
		x=player.posX;
		y=player.posY;
		z=player.posZ;
	}*/
	
	public NodePar(World world,int etype, Block block, EntityLivingBase... ents){
		WORLD = world;
		eventtype = etype;
		entityaff=(ArrayList<EntityLivingBase>)Arrays.asList(ents);
		BLOCK=block;
		x=(block.getBlockBoundsMaxX()+block.getBlockBoundsMinX())/2;
		y=(block.getBlockBoundsMaxY()+block.getBlockBoundsMinY())/2;
		z=(block.getBlockBoundsMaxZ()+block.getBlockBoundsMinZ())/2;
	}
	
	public NodePar(World world,int etype, Block block){
		WORLD = world;
		eventtype = etype;
		BLOCK=block;
		x=(block.getBlockBoundsMaxX()+block.getBlockBoundsMinX())/2;
		y=(block.getBlockBoundsMaxY()+block.getBlockBoundsMinY())/2;
		z=(block.getBlockBoundsMaxZ()+block.getBlockBoundsMinZ())/2;
	}
	
	/*public NodePar(World world,int etype, EntityPlayer player, EItem item, Block... blocks){
		WORLD = world;
		eventtype = etype;
		PLAYER=player;
		blockaff=(ArrayList<Block>)Arrays.asList(blocks);
		ITEM=item;
		x=(blocks[0].getBlockBoundsMaxX()+blocks[0].getBlockBoundsMinX())/2;
		y=(blocks[0].getBlockBoundsMaxY()+blocks[0].getBlockBoundsMinY())/2;
		z=(blocks[0].getBlockBoundsMaxZ()+blocks[0].getBlockBoundsMinZ())/2;
	}*/
}
