package com.sm.ench;

import java.util.ArrayList;
import java.util.LinkedList;

import com.sm.core.Instances;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Ench {
	
	private Index INDEX;
	private ArrayList<Node[]> trees = new ArrayList<Node[]>();
	private int[] locs = new int[750];
	private int LEVEL = 0;
	
	public Ench(int level){
		INDEX=Instances.getIndex();
		LEVEL=level;
	}
	
	public Node getNode(int tree,int... loc){
		return  null;
	}
	
	public void setName(String name){
		
	}
	
	public int addTree(){
		trees.add(new Node[100]);
		return trees.size()-1;
	}
	
	public void removeTree(int tree){
		trees.remove(tree);
	}
	
	public void addNode(int tree,int loc,Node node)throws ArrayIndexOutOfBoundsException{
		trees.get(tree)[loc]=node;
	}
	
	public void removeNode(int tree,int loc){
		trees.get(tree)[loc]=null;
	}
	
	public Node getNode(int tree,int loc)throws ArrayIndexOutOfBoundsException{
		return trees.get(tree)[loc];
	}
	
	/*public void addNode(int uid,int level, int... loc){
		Node node = new Node(INDEX.getNData(uid),this,level,loc);
		nodes.add(node);
		boolean b1=true;
		for(int i=0;b1;i++){
			try{
				locs[loc[i]]=nodes.size();
			}catch(ArrayIndexOutOfBoundsException e){
				b1=false;
			}
		}
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
