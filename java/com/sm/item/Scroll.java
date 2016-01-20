package com.sm.item;

import com.sm.core.SM;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Scroll extends Item {
	
	private final String name = "scroll";
	public Scroll(){
		GameRegistry.registerItem((Item)this, name);
		//setUnlocalizedName(SM.MODID + "_" + name);
		setUnlocalizedName("seriouslymagical_" + name);
	}
	
	public String getName(){
		return name;
	}
	
}


