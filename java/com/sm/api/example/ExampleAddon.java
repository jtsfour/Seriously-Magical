package com.sm.api.example;

import com.sm.api.Addon;
import com.sm.api.NodeActions;


public class ExampleAddon extends Addon {
	
	private ExampleNodeActs ACTSOBJ;
	
	
	//NOTE i did not import anything but the api here to show how you can make sm optionally be installed 
	public ExampleAddon(){
		super();
		ACTSOBJ = new ExampleNodeActs();
		boolean didLoad = register(this);//This method registers the addon to the main mod call whenever however you like
	}

	@Override
	public String getModid() {
		//has to be used with your actual modid and needs to be consistant between versions or it will break saves
		return "examplemodid";
	}

	@Override
	public String getCompatibleSMVersion() {
		//write the version of sm you coded the addon in
		//if the second or first digit is different than the installed mod it will not load for safety against crashes/bugs
		return "1.0.0.0";
	}

	@Override
	public String getAddonName() {
		//This is the viewable addon name
		return "Example Addon";
	}

	@Override
	public String getAddonAuthor() {
		//this is the viewable author name
		return "jtsfour";
	}

	@Override
	public NodeActions getNodeActsObj() {
		//this is very important will also cancel registering if wrong format is used
		return ACTSOBJ;
	}

	@Override
	public void init() {
		//this is the initializer you need to register your ench nodes here this will only be called if this addon is successfully registered
		/*par1 has to be unique from all of your nodes does not interfere with other addons ids so dont worry about that*/
		/*par2 the viewable node name*/
		/*par3 VERY IMPORTANT this is the name of the method you will create for this node in NodeActs will explain more there*/
		/*par4 the group your node goes in*/
		//par 5 The addon object this node originates from
		regNode(1000, "ExampleNode", "examplenode_method", 1,this).setCanBeOnSword(true).setCanBeOnTool(true,1);//there are many options you can allow/disallow here;
		regNode(1001,"Node 1","node_1_method",1,this);
	}

}
//NOTE THIS SHOULD BE IN A SEPERATE FILE! this is for simplicity only
/*public*/class ExampleNodeActs extends NodeActions{

	@Override
	public String getModid() {
		//has to be used with your actual modid and needs to be consistant between versions or it will break saves
		return "examplemodid";
	}

	@Override
	public void init() {
		//this is called only when it successfully registers the addon
	}
	
	
	//NODE CODE\/\/\/\/\/
	//there needs to be a method for each node here
	
	
						 //if this is different than what you specified in your regNode() call it will not work
	public static boolean examplenode_method(com.sm.ench.NodePar np,com.sm.ench.NData nd,com.sm.ench.Node node){
		//NodePar is a object loaded with variables about where this is what you are attacking etc. so you can manipulate it
		//NData is constant information about the node type it really isn't used here except for advanced nodes
		//Node is the actual node object also mostly used for advanced nodes
		
		
		
		//IMPORTANT every node method must be formatted with these exact specifications
		return true;//the return function is interesting this can be used if you are specifying conditional GO-TO in the enchant processing system
		//if you are just using a simple plain effect node always return this as true
	}
	
	public static boolean node_1_method(com.sm.ench.NodePar np,com.sm.ench.NData nd,com.sm.ench.Node node){
		return true;
	}
	
	
	
}
