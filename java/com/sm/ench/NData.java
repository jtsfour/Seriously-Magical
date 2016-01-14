package com.sm.ench;

import com.sm.api.Addon;
import com.sm.main.Instances;

public class NData {
	
	private final int ID;
	private int TTYPE;
	private int GROUP;
	private final String NAME;
	private String MNAME;
	private boolean ISTRI=false;
	private boolean CANBL=false;
	private boolean CANSW=false;
	private boolean CANBW=false;
	private boolean CANAMU=false;
	private boolean CANMULTI=false;
	private boolean CANARM=false;
	private boolean CANTOOL=false;
	private boolean CANLINK=false;
	private boolean LINKIDS=false;
	private String ADDONID;
	private String[] LINKNAMES = new String[10];
	private int[] AEVENTS = new int[20];
	
	private final int UID;
	
	
	
	public NData(int id,String name,String methodName,int nodeGroup,Addon addon){
		ID=id;
		NAME=name;
		MNAME=methodName;
		GROUP=nodeGroup;
		UID=Instances.getIndex().genNodeUID(methodName, addon, id);
	}
	
	public int getID(){
		return ID;
	}
	
	public int getGroup(){
		return GROUP;
	}
	
	public int getToolType(){
		return TTYPE;
	}
	
	public String getName(){
		return NAME;
	}
	
	public String getMName(){
		return MNAME;
	}
	
	public boolean isTrigger(){
		return ISTRI;
	}
	
	public boolean canBlock(){
		return CANBL;
	}
	public boolean canSword(){
		return CANSW;
	}
	public boolean canBow(){
		return CANBW;
	}
	public boolean canAmulet(){
		return CANAMU;
	}
	public boolean canMulti(){
		return CANMULTI;
	}
	public boolean canArmor(){
		return CANARM;
	}
	public boolean canTool(){
		return CANTOOL;
	}
	
	public boolean canLink(){
		return CANLINK;
	}
	
	public boolean hasLinkIds(){
		return LINKIDS;
	}
	public String getLinkName(int id){
		if(LINKIDS){
			try{
				return LINKNAMES[id];
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("[ERROR] ATTEMPED TO GET ID OUT OF BOUNDS");
				return null;
			}
			
		}else{
			System.out.println("[ERROR] ATTEMPTED TO GET LINKNAME WITHOUT CHECKING LINKIDS");
			return null;
		}
	}
	
	public boolean isAEvent(int id){
		boolean b1=false;
		try{
			for(int i=0;i>-1;i++){
				if(AEVENTS[i]==id){
					b1=true;
					break;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			b1=false;
		}
		return b1;
	}
	
	public int getUID(){
		return UID;
	}
	
	
	
	
	//SETMETHODS
	
	public NData setTriggers(int... events){
		ISTRI=true;
		AEVENTS=events;
		return this;
	}
	public NData setCanBeOnBlock(boolean b1){
		CANBL=b1;
		return this;
	}
	public NData setCanBeOnSword(boolean b1){
		CANSW=b1;
		return this;
	}
	public NData setCanBeOnBow(boolean b1){
		CANBW=b1;
		return this;
	}
	public NData setCanBeOnAmulet(boolean b1){
		CANAMU=b1;
		return this;
	}
	public NData setCanBeOnMultiBlock(boolean b1){
		CANMULTI=b1;
		return this;
	}	
	public NData setCanBeOnArmor(boolean b1){
		CANARM=b1;
		return this;
	}
	public NData setCanBeOnTool(boolean b1,int tools){
		CANTOOL=b1;
		TTYPE=tools;
		return this;
	}
	public NData setCanBeLinked(boolean b1){
		CANLINK=b1;
		return this;
	}
	public NData setLinkNames(String... names){
		LINKIDS=true;
		LINKNAMES=names;
		return this;
	}
	
	
		
	
}
