package adventureGame;

import java.util.ArrayList;

public class Room {
	
	private int North;
	private int East;
	private int South;
	private int West;
	private int RoomNumber;
	private String Info;
	private String roomName;
	private ArrayList<Items>ItemList;
	
	public Room(int North,int East, int South, int West, int RoomNumber,String Info, String name) {
		this.North=North;
		this.East=East;
		this.South=South;
		this.West=West;
		this.RoomNumber=RoomNumber;
		this.Info=Info;
		ItemList=new ArrayList<Items>(5);
		this.roomName=name;
	}
	
	
	public void setNorth(int input) {
		
		this.North=input;
	}
	
	public int getNorth() {
		
		return this.North;
	}
	
	public void setEast(int input) {
		this.East=input;
	}
	public int getEast() {
		
		return this.East;
	}
	public void setSouth(int input) {
		this.South=input;
	}
	public int getSouth() {
		return this.South;
	}
	public void setWest(int input) {
		this.West=input;
	}
	public int getWest() {
		
	return this.West; 
	}
	public void setRoomNumber(int input) {
		this.RoomNumber=input;
	}
	public int getRoomNumber() {
		return this.RoomNumber;
		
	}
	public void setInfo(String input) {
		this.Info=input;
	}
	public String getInfo() {
		return this.Info;
	}
	public void addItem(Items input) {
		this.ItemList.add(input);
	}
	public Items takeItem() {
		if(this.ItemList.size()>0) {
			Items takenItem=this.ItemList.get(0);
			System.out.println("you have taken "+this.ItemList.get(0).getName());
			this.ItemList.remove(0);
			return takenItem;
			
		}
		System.out.println("no item to take");
		 
		return null;
		
	}
	public String RoomItem() {
		
		
		String itemString="";
    	int t=0;
    	while(t < ItemList.size()) {
    		itemString=itemString+ItemList.get(t).getName();
    		itemString=itemString+",";
    		t++;
    	}
    
    	System.out.println("the items in the room are");
    	return itemString;
		
		
	}
	public int RoomInventorySize() {
		
		return this.ItemList.size();
	}
	
	public void setRoomName(String input) {
		
		this.roomName=input;
	}
	public String getRoomName() {
		
		return this.roomName;
	}
	

}
