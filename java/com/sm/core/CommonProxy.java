package com.sm.core;

import com.sm.blocks.BlocksInit;
import com.sm.items.ItemsInit;
import com.sm.items.Recipes;

public abstract class CommonProxy {

	
	public void init(){
		BlocksInit block = new BlocksInit();
		ItemsInit item = new ItemsInit();
		Recipes recipe = new Recipes();
		block.init();
		item.init();
		recipe.init();
	}
	
	
	
}
