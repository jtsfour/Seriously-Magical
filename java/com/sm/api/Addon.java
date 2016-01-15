package com.sm.api;

import net.minecraftforge.fml.common.Loader;

public abstract class Addon {
	
	private Object AH;
	private boolean flag=false;
	private String ID;
	
	public Addon(){
		try{
			AH=com.sm.core.Instances.getInstance().getAHandler();
		}catch(Exception e){
			flag=true;
		}
	}
	
	public final boolean register(Addon addon){
		boolean bool=false;
		if(!flag){
			ID=addon.getModid();
			if(Loader.isModLoaded("seriouslymagical")){
				bool=true;
				System.out.println("Found Mod Initializing Addon");
				try{
					com.sm.core.AddonHandler ah = (com.sm.core.AddonHandler)AH;
					ah.registerAddon(addon);
				}catch(Exception e){
					bool=false;
					flag=true;
					System.out.println("FAILED ADDON LOAD---------------------");
					e.printStackTrace();
				}
			}else{
				System.out.println("[ERROR]: SERIOUSLY MAGICAL IS NOT LOADED ADDON NOT REGISTERED!");
				}
		}
			
			return bool;
		}
	
	public com.sm.ench.NData regNode(int id,String name,String methodName,int nodeGroup,Addon addon){
		com.sm.core.AddonHandler ah = (com.sm.core.AddonHandler)AH;
		com.sm.ench.NData nd = ah.regNode(ID,id,name,methodName,nodeGroup,addon);
		return nd;
	}
	
	public abstract String getModid();
	
	public abstract NodeActions getNodeActsObj();
	
	public abstract String getCompatibleSMVersion();
	
	public abstract String getAddonName();
	
	public abstract String getAddonAuthor();
	
	public abstract void init();
	
}
