package com.sm.main;


import com.sm.addons.DefaultAddon;
import com.sm.ench.Index;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = SM.MODID, version = SM.VERSION)
public class SM
{
    public static final String MODID = "seriouslymagical";
    public static final String VERSION = "1.0.0.0";
    
    @SidedProxy(clientSide = "com.sm.main.ClientProxy",serverSide = "com.sm.main.ServerProxy")
    public static IProxy proxy;
    
    @Mod.Instance("SM")
    public static SM instance;
    
    
    //EnchEventHandler enhandler = new EnchEventHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
    	Instances inst = new Instances();
    	Instances.setSM(this);
    	Index index = new Index();
		Initializer initer = new Initializer(index);
		AddonHandler ah = new AddonHandler();
		//EItemHandler eih = new EItemHandler();
		//EnchObjHandler eoh = new EnchObjHandler();
		//EnchPU epu = new EnchPU();
    	//MinecraftForge.EVENT_BUS.register(enhandler);
    	//FMLCommonHandler.instance().bus().register(enhandler);
		
    }
   
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		DefaultAddon defaddon = new DefaultAddon();
    
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    
    }

  
	
}
