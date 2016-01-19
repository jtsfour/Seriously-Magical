package com.sm.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.sm.block.BlocksInit;
import com.sm.item.ItemsInit;
import com.sm.item.Recipes;

public abstract class CommonProxy {

	public static final CreativeTabs smtab = new CreativeTabs("Seriously Magical"){
			public Item getTabIconItem() {
			
				return Items.blaze_rod;
			}
	   	
	   };
	   
	public void init(){
		
		BlocksInit block = new BlocksInit(smtab);
		ItemsInit item = new ItemsInit(smtab);
		Recipes recipe = new Recipes();
		block.init();
		item.init();
		recipe.init();
	}
	
	
	
}
