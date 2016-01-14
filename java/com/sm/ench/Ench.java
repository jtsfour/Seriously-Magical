package com.sm.ench;

import java.util.ArrayList;
import java.util.LinkedList;
import com.sm.main.Instances;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Ench {
	
	private ArrayList<Node> nodes = new ArrayList<Node>();
	private Index INDEX;
	private int[] locs = new int[750];
	
	public Ench(){
		INDEX=Instances.getIndex();
		
	}
	
	public Node getNode(int... loc){
		return  null;
	}
	
	public void setName(String name){
		
	}
	
	public void addNode(int uid, int... loc){
		Node node = new Node(INDEX.getNData(uid),this,loc);
		nodes.add(node);
		boolean b1=true;
		for(int i=0;b1;i++){
			try{
				locs[loc[i]]=nodes.size();
			}catch(ArrayIndexOutOfBoundsException e){
				b1=false;
			}
		}
		
	}
	
	public void removeNode(int... loc){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public int regNode(Node node){
		int id=nextID;
		nextID++;
		if(!node.hasID){
			nodes.add(node);
			if(id==0)return 1;else return id;
		}else{
			return 0;
		}
			
	}
	
	public void addNode(Node node){
		nodes.add(node);
	}

	public Node getNode(int id)throws ArrayIndexOutOfBoundsException{
		Node node=null;
		if(id!=0){
			boolean loop=true;
		 node = null;
		for(int i=0;loop;i++){
			if(nodes.get(i).ID==id){
				loop=false;
				node=nodes.get(i);
			}
		}
		}
		
		return node;
	}
	*/
	
	
	
}
