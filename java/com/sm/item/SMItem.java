package com.sm.item;

import com.sm.core.SM;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SMItem extends Item {
	private String NAME = "";
	public SMItem(String name){
		super();
		NAME=name;
		setUnlocalizedName(SM.MODID+"_"+NAME);
		GameRegistry.registerItem(this, NAME);
	}
	
	public String getName(){
		return NAME;
	}
	
	
	
}


