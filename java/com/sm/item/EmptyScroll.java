package com.sm.item;

import com.sm.core.SM;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EmptyScroll extends SMItem {
	public EmptyScroll(String name){
		super(name);
		this.setCreativeTab(SMItems.SMTAB);
	}

}
