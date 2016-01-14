package com.sm.ench;



public class Node {
	
	private final int UID;
	private int LOC;
	private Ench ENCH;
	private int[] CHILDS = new int[5];
	private int childc = 0;
	private boolean hasChild = false;
	private int PARENT = -1;
	private boolean hasParent = false;
	private final NData NDATA;
	private NodePar npar;
	private int LEV = 0;
	private int TREE = -1;
	private boolean treef = true;
	
	public Node(NData nd,Ench ench,int level,int loc){
		UID=nd.getUID();
		ENCH=ench;
		LOC=loc;
		NDATA=nd;
		LEV=level;
	}
	
	public void setTree(int tree){
		if(treef){
			TREE=tree;
			treef=!treef;
		}	
	}
	
	public void setParent(int loc){
		PARENT=loc;
		hasParent=true;
	}
	
	public void removeParent(){
		PARENT=-1;
		hasParent=false;
	}
	
	public int getParent(){
		return PARENT;
	}
	
	public boolean hasParent(){
		return hasParent;
	}
	
	public int[] getChildNodes(){
		return CHILDS;
	}
	
	public boolean hasChild(){
		return hasChild;
	}
	
	public void addChild(int loc){
		hasChild=true;
		CHILDS[childc]=loc;
		childc++;
	}
	
	public void removeChild(int loc){
		for(int i=0;i<10;i++){
			if(CHILDS[i]==loc){
				CHILDS[i]=-1;
				childc--;
				break;
			}
		}
	}
	
	public int getUID(){
		return UID;
	}
	
	public NData getNData(){
		return NDATA;
	}
	
	public int getTree(){
		return TREE;
	}
	
}