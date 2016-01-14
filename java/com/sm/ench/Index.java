package com.sm.ench;

import java.lang.reflect.Method;
import java.util.ArrayList;

import com.sm.api.Addon;
import com.sm.main.AddonHandler;
import com.sm.main.Instances;

public class Index {
	
	private ArrayList<String> addonids = new ArrayList<String>();
	private ArrayList<ArrayList<NData>> ndata = new ArrayList<ArrayList<NData>>();
	private ArrayList<Integer> uids = new ArrayList<Integer>();
	
	private int c1=0;
	private int c2=0;
	
	private AddonHandler AH;
	
	public Index(){
		Instances.setIndex(this);
		AH=Instances.getAHandler();
	}
	
	public NData getNData(String modid,int id){
		boolean b1=true;
		int loc = getAddonListId(modid);
		for(int i=0;b1;i++){
			try{
				if(ndata.get(loc).get(i).getID()==id){
				b1=!b1;
				return ndata.get(loc).get(i);
			}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("[ERROR]: Search Query for node "+modid+" "+id+" failed!");
				b1=!b1;
				break;
			}
		}
		return null;
	}
	
	public NData getNData(String modid,String methodname){
		boolean b1=true;
		int loc = getAddonListId(modid);
		for(int i=0;b1;i++){
			try{
				if(ndata.get(loc).get(i).getMName()==methodname){
				b1=!b1;
				return ndata.get(loc).get(i);
			}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("[ERROR]: Search Query for node "+modid+" "+methodname+" failed!");
				b1=!b1;
				break;
			}
		}
		return null;
	}
	
	public NData getNData(int UID){
		boolean b1 = true;
		int i1 = 0;
		int s = ndata.get(0).size();
		for(int i = 0;b1;i++){
			if(i<s){
				if(ndata.get(i1).get(i).getUID()==UID){
					return ndata.get(i1).get(i);
				}
			}else{
				i1++;
				if(i1>ndata.size()){b1=false;break;}
				s=ndata.get(i1).size();
				i = -1;
			}
		}
		System.out.println("[ERROR] Unable to locate node "+UID);
		return null;
	}
	
	public int getAddonListId(String modid){
		boolean b1=false;
		int i0 =0;
		String id = modid;
		for(int i=0;!b1;i++){
			i0=i;
			try{
				if(addonids.get(i)==id){
					b1=true;
					break;
				}else{
					
				}
			}catch(ArrayIndexOutOfBoundsException e){
				break;
			}
		}
		if(b1){
			return i0;
		}else{
			System.out.println("[ERROR] Search query for Addon "+id+" failed stopping this addon");
			AH.reportAddonErr(id);
			return 0;
		}	
	}
	
	public void registerAddon(Addon addon){
		addonids.add(addon.getModid());
		c1++;
	}
	
	public NData registerNode(String modid,int id,String name,String methodName,int nodeGroup,Addon addon){
		NData nd = new NData(id,name,methodName,nodeGroup,addon,genNodeUID(methodName,addon,id));
		ndata.get(getAddonListId(addon.getModid())).add(nd);
		System.out.println("Successfully Registered Node : "+name+" from mod : "+addon.getModid());
		return nd;
	}
	
	
	//DO NOT CHANGE THIS AT ALL !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//IF THIS MATH OPERATION CHANGES THE UID SYSTEM BREAKS!!!!!!!!!!
	public final int genNodeUID(String mname,Addon addon,int id){
		int v1=1;
		int v2=1;
		int v3=1;
		int v4=1;
		int v5=1;
		String modid = addon.getModid();
		for(int i0=0;i0<mname.length();i0++){
			try{
			v1 *= (byte)mname.charAt(i0);
			v1 += (byte)mname.charAt(i0);	
			}catch(Exception e){
				break;
			}
		}
		for(int i1=0;i1<modid.length();i1++){
			try{
				v2 *= (byte)modid.charAt(i1);
				v2 += (byte)modid.charAt(i1);	
				}catch(Exception e){
					break;
				}
		}
		v1 <<= 16;
		v2 <<= 16;
		v3 = v1 & v2;
		v4 = ((id^6) & (id*65));
		v5 = v3 | v4;
		uids.add(v5);
		return v5;
	}
	
	
	
	
	
	
	
	
	
	
	
	// NODE CODE
	/*
	public static boolean test(NodePar np,NData nd,Node node){
		System.out.println("I WORKED!");
		return true;
	}
	
	public static boolean trigger1(NodePar np,NData nd,Node node){
		if(np.eventtype==1){
			node.datatopass=np;
			return true;
		}else{
			return false;
		}
	}
	*/
	
	
	
	
}
