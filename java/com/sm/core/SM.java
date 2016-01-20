package com.sm.core;


import com.sm.addons.DefaultAddon;
import com.sm.ench.Index;
import com.sm.event.SMHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;



@Mod(modid = SM.MODID, version = SM.VERSION)
public class SM
{
    public static final String MODID = "seriouslymagical";
    public static final String VERSION = "1.0.0.0";
    public static boolean client = false;
    
    @SidedProxy(clientSide = "com.sm.client.ClientProxy",serverSide = "com.sm.core.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance("SM")
    public static SM instance;
    
    
   SMHandler smhandler = new SMHandler();
   
   public static boolean isServerSide(){
	   return !client;
   }
   
   public static boolean isClientSide(){
	   return client;
   }
   
   
   
   
   
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
    	Instances inst = new Instances();
    	Instances.setSM(this);
    	Index index = new Index();
		AddonHandler ah = new AddonHandler();
    	MinecraftForge.EVENT_BUS.register(smhandler);
    	boolean b1 = false;
    	if(event.getSide() == Side.CLIENT){b1=true;}
    	client=b1;
		proxy.init(b1);
    }
   
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		DefaultAddon defaddon = new DefaultAddon();
		proxy.postInit();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    
    }
  
	
}
