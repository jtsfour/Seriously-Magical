package com.sm.item;

import com.sm.core.SM;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsInit {
	
	private final CreativeTabs SMTAB;
	public ItemsInit(CreativeTabs tab){
		SMTAB=tab;
	}
	//Items
	public static Item scroll;
	public static Item EmptyScroll;
	public static Item StoneTablet;
	//amulets
	public static Item DaimondAmulet;
	public static Item EmeraldAmulet;
	public static Item LapisAmulet;
	//staffs
	public static Item BlazeStaff;
	public static Item IronStaff;
	public static Item StoneStaff;
	public static Item WoodenStaff;
	public static Item DaimondStaff;
	public static Item EmeraldStaff;
	
	public boolean client;
	
	public void init(boolean b1){
		client=b1;
		scroll = new Scroll().setCreativeTab(SMTAB);
		
		
		}
	
	public void postinit(){
		if(client){//client side only initialization
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	    	renderItem.getItemModelMesher().register(scroll, 0, new ModelResourceLocation("seriouslymagical:scroll" /*+ ((Scroll)scroll).getName()*/, "inventory"));
			}
	}
	
	}

