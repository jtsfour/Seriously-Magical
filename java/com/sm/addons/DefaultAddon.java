package com.sm.addons;

import com.sm.api.Addon;
import com.sm.api.NodeActions;

public class DefaultAddon extends Addon {
	
	private final String MODID = "seriouslymagical";
	private final String VERSION = "1.0.0.0";
	private final String NAME = "Default Addon";
	private final String AUTHOR = "Jtsfour";
	private final DefaultNodes ACTSOBJ;
	
	private boolean loaded = false;
	
	public DefaultAddon(){
		super();
		ACTSOBJ = new DefaultNodes(MODID);
		loaded = register(this);
	}

	@Override
	public String getModid() {
		return MODID;
	}

	@Override
	public NodeActions getNodeActsObj() {
		return ACTSOBJ;
	}

	@Override
	public String getCompatibleSMVersion() {
		return VERSION;
	}

	@Override
	public String getAddonName() {
		return NAME;
	}

	@Override
	public String getAddonAuthor() {
		return AUTHOR;
	}

	@Override
	public void init() {
		System.out.println("Registering Ench Nodes");
		regNode(100, "Test Node", "test_method", 1,this).setCanBeLinked(true);
		
		System.out.println("Ench Nodes Successfully Registered");
	}

}
