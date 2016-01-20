package com.sm.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.sm.block.BlocksInit;
import com.sm.item.SMItems;
import com.sm.item.Recipes;

public abstract class CommonProxy {
	private boolean client;
	public CommonProxy(){
		
	}

	public static final CreativeTabs smtab = new CreativeTabs("smtab"){
			public Item getTabIconItem() {
			
				return SMItems.scroll;
			}
	   	
	   };
	   
	   private static BlocksInit block;
	   private static SMItems item;
	   private static Recipes recipe;
	   
	public void init(boolean b1){
		client=b1;
		block = new BlocksInit(smtab);
		item = new SMItems(smtab);
		recipe = new Recipes();
		block.init(b1);
		item.init(b1);
		recipe.init();
	}
	
	public void postInit(){
		item.postinit();
	}
	
	
	
}
