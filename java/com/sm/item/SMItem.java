package com.sm.item;

import com.sm.core.SM;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SMItem extends Item {
	private final String name = "smitem";
	public SMItem(){
		GameRegistry.registerItem(this, name);
	}
	
	public String getName(){
		return name;
	}
}


