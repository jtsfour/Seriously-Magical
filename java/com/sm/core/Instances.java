package com.sm.core;

import com.sm.ench.Index;


public class Instances {
	private static Instances instance;
	private static SM sminst;
	private static Index ininst;
	private static AddonHandler ahinst;
	
	public Instances(){
		instance=this;
	}
	
	//SETTERS
	public static void setSM(SM sm){
		Instances.sminst=sm;
	}
	
	public static void setIndex(Index in){
		Instances.ininst=in;
	}
	
	public static void setAHandler(AddonHandler ah){
		ahinst=ah;
	}
	
	
	//GETTERS
	public static Instances getInstance(){
		return Instances.instance;
	}
	
	public static SM getSM(){
		try{
			return Instances.sminst;
		}catch(Exception e){
			return null;
		}
	}
	
	
	public static Index getIndex(){
		try{
			return Instances.ininst;
		}catch(Exception e){
			return null;
		}
	}

	public static AddonHandler getAHandler(){
		return ahinst;
	}
}
