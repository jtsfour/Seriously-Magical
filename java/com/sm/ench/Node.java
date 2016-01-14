package com.sm.ench;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Node {
	
	public int ID;
	public int UID;
	public int[] LOC = new int[10];
	private static Ench ENCH;
	public static int[] links = new int[10];
	public static int PARENT = 0;
	public boolean hasParent=false;
	public NData ndata;
	public NodePar datatopass = null;
	public int LEV = 0;
	
	//Type variables
	
	//Constructor for brand new Nodes
	public Node(NData nd,Ench ench,int level,int... loc){
		UID=nd.getUID();
		ENCH=ench;
		LOC=loc;
		ndata=nd;
		LEV=level;
		//ID=ENCH.regNode(this);
		//hasID=true;
		//ENCH.setTreeP(parent,this);
		//ndata=ENCH.getNData(uid);
	}
	//Constructor for reloading nodes from nbt
	/*public Node(int id,int uid,int parent,Ench ench,int[] links0){
		ID=id;
		hasID=true;
		UID=uid;
		PARENT=parent;
		if(parent>0)hasParent=true;
		ENCH=ench;
		links=links0;
		ndata=ENCH.getNData(UID);
	}*/
	/*
	public boolean addLink(int loc,int id){
		boolean b=true;
		try{
			links[loc]=id;
		}catch(Exception e){
			b=false;
		}
		
		return b;
	}
	public boolean removelink(int loc){
		boolean b=false;
		try{
			links[loc]=0;
			b=true;
		}catch(Exception e){
			b=false;
		}
			return b;
		}
	
	public void setParent(int id){
		PARENT=id;
	}
	
	/*
	public Boolean perfAction(NodePar np){
		datatopass=np;
			Object bool = null;
		try {
				Method method = Class.forName(Index.class.getName()).getDeclaredMethod(ndata.getMName(),NodePar.class,NData.class,Node.class);
				if(ndata.isTrigger()){
					bool = method.invoke(ENCH.getIndex(),np,ndata,this);
					if((Boolean)bool){
						//callLinked();
					}
				}else{
					bool = method.invoke(ENCH.getIndex(),np,ndata,this);
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			if(ndata.canLink()){
				if((Boolean)bool){
				//	callLinked();
				}
			}else{
				return (Boolean)bool;
			}
		return null;
	}
	/*
	public void callLinked(){
			for(int i=0;i<10;i++){
			try{
				ENCH.getNode(i).perfAction(datatopass);
			}catch(Exception e){
			}
		}
	}
	*/
	
	
		
	
	
	
}