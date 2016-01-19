package com.sm.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.SaveToFile;
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
	//World events
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
	
	//Player events
	@SubscribeEvent()
	public void playerJoin(EntityJoinWorldEvent e){
		if(e.entity instanceof EntityPlayer){
			
		}
	}
	
	@SubscribeEvent()
	public void playerLoad(PlayerEvent.LoadFromFile e){
		
	}
	
	@SubscribeEvent()
	public void playerSave(PlayerEvent.SaveToFile e){
		
	}
	
}
