package com.sm.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.sm.api.*;
import com.sm.ench.Index;
import com.sm.ench.NData;
import com.sm.ench.Node;
import com.sm.ench.NodePar;

public class AddonHandler {
	
	private Instances INST;
	private Index INDEX;
	public String VER = "0.0.0.0";
	private static ArrayList<String> ids = new ArrayList<String>();
	private static ArrayList<Addon> addons  = new ArrayList<Addon>();
	//private static int c1 = 0;
	//private static int c2 = 0;
	
	public AddonHandler(){
		INST=Instances.getInstance();
		INST.setAHandler(this);
		VER=SM.VERSION;
		INDEX=Instances.getIndex();
	}
	
	public void registerAddon(Addon addon){
		boolean vercheck = true;
		for(int i=0;i<3;i++){
			if(VER.charAt(i) != addon.getCompatibleSMVersion().charAt(i)){
				vercheck=false;
			}
		}
		if(!vercheck){
		System.out.println("[ERROR] Addon "+ addon.getAddonName() + " failed to load due to incompatible version error");
		}else{
			INDEX.registerAddon(addon);
			ids.add(addon.getModid());
			addons.add(addon);
			try {
				Method method = Class.forName(addon.getClass().getName()).getDeclaredMethod("init");
				Method method2 = Class.forName(addon.getNodeActsObj().getClass().getName()).getDeclaredMethod("init");
				try {
					method.invoke(addon);
					method2.invoke(addon.getNodeActsObj());
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}
			} catch (NoSuchMethodException e) {
			} catch (SecurityException e) {
			} catch (ClassNotFoundException e) {
			}
			
		}
	}
	
	public NData regNode(String modid,int id,String name,String methodName,int nodeGroup,Addon addon){
		boolean err = false;
		try {
			Method method = Class.forName(addon.getNodeActsObj().getClass().getName()).getDeclaredMethod(methodName,NodePar.class,NData.class,Node.class);
		} catch (NoSuchMethodException e) {
		err=true;
		} catch (SecurityException e) {
		err=true;
		} catch (ClassNotFoundException e) {
		err=true;
		}
		if(err){
			System.out.println("[ERROR]: Addon "+addon.getAddonName()+" Tried to register Node "+name+" with invalid methodname node not registered");
			return null;
		}else{
			return INDEX.registerNode(modid,id,name,methodName,nodeGroup,addon);
		}
	}
	
	public void reportAddonErr(String id){
		
	}
	
	public static AddonHandler getInstance(){
		return Instances.getAHandler();
	}
	
	public boolean isLoaded(String id){
		boolean b1 = true;
		for(int i =0;b1;i++){
			try{
				if(this.ids.get(i)==id){
					return true;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				b1=false;
			}
		}
		return false;
	}
	
}