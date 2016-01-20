package com.sm.item;

import com.sm.core.SM;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SMItems {
	
	public static CreativeTabs SMTAB;
	public SMItems(CreativeTabs tab){
		SMTAB=tab;
	}
	//Items
	public static SMItem scroll;
	public static SMItem emptyscroll;
	public static SMItem stonetablet;
	//amulets
	public static SMItem diamondamulet;
	public static SMItem emeraldamulet;
	public static SMItem lapisamulet;
	//staffs
	public static SMItem BlazeStaff;
	public static SMItem IronStaff;
	public static SMItem StoneStaff;
	public static SMItem WoodenStaff;
	public static SMItem DaimondStaff;
	public static SMItem EmeraldStaff;
	
	public boolean client;
	
	public void init(boolean b1){
		client=b1;
		scroll = new Scroll("scroll");
		emptyscroll = new EmptyScroll("emptyscroll");
		stonetablet = new StoneTablet("stonetablet");
		
		diamondamulet = new DiamondAmulet("diamondamulet");
		emeraldamulet = new EmeraldAmulet("emeraldamulet");
		lapisamulet = new LapisAmulet("lapisamulet");
		
		}
	
	public void postinit(){
		registerItemModel(scroll);
		registerItemModel(emptyscroll);
		registerItemModel(stonetablet);
		registerItemModel(diamondamulet);
		registerItemModel(emeraldamulet);
		registerItemModel(lapisamulet);
		
	}
	
	private void registerItemModel(Item item){
		if(client){Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(SM.MODID+":"+((SMItem)item).getName(), "inventory"));}
	}
	
	}

