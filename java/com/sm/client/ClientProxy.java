package com.sm.client;

import com.sm.core.CommonProxy;

public class ClientProxy extends CommonProxy {
	
	private boolean client;
	public ClientProxy(){
		
	}
	@Override
	public void init(boolean b1){
		super.init(b1);
		client=b1;
		
	}
	
	public void postInit(){
		super.postInit();
	}
}
