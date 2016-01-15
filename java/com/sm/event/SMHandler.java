package com.sm.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class SMHandler {
	private boolean server=false;//Some events will only be processed on the server side e.g. HitEntity for enchantments
	
	public SMHandler(){
				/*if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER){
					server=true;
				}*/
				server=true;
	}
	
	@SubscribeEvent
	public void load(WorldEvent.Load e){
		if(server){
			
		}
	}
	
	@SubscribeEvent
	public void save(WorldEvent.Save e){
		if(server){
			
		}
	}
	
	@SubscribeEvent
	public void unload(WorldEvent.Unload e){
		if(server){
			
		}
	}
}
