package com.sm.addons;

import com.sm.api.NodeActions;
import com.sm.ench.NData;
import com.sm.ench.Node;
import com.sm.ench.NodePar;

public class DefaultNodes extends NodeActions{
	
	private final String MODID;

	public DefaultNodes(String modid) {
		MODID=modid;
	}

	@Override
	public String getModid() {
		return MODID;
	}

	@Override
	public void init() {
		
	}
	
	//NODE CODE
	
	public static boolean test_method(NodePar np,NData nd,Node node){
		System.out.println("I WORKED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return true;
		
	}

	
	
}
