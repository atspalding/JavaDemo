package adventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Room> roomList= new ArrayList<Room>();
		Player mainPlayer= new Player("Player1",23);
		//////// north, east, south , west , room number, info
		Room room1= new Room(2,1,1,1,1,"Starting room","room1");
		Room room2= new Room(4,5,1,3,2,"Mid room", "room2");
		Room room3= new Room(3,3,2,3,3,"Ending  room", "room3");
		Room room4= new Room(4,4,2,4,4,"Extra Room"," room4");
		
		Room room5= new Room(5,5,2,6,5,"room 5", "room5");
		Room room6= new Room(7,5,6,3,6,"room 6", "room6");
		Room room7= new Room(7,7,7,1,7,"room 7"," room7");
		
	    Items item1=new Items("item1","this is item 1",1);
	    Items item2=new Items("item2","this is item 2",1);
		room1.addItem(item1);
		room2.addItem(item2);
		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		roomList.add(room4);
		
		roomList.add(room5);
		roomList.add(room6);
		roomList.add(room7);
		
		//Room currentRoom=room1;
		Room currentRoom=roomList.get(0);
		Boolean gameEnd=false;
		//Movement move= new Movement(roomList, currentRoom);
		Movement move= new Movement(currentRoom);
		Scanner reader = new Scanner(System.in);
		System.out.println("Start of game press q to quit anytime ");
		while(gameEnd.equals(false)){
			if(room1.RoomInventorySize()==2) {
				System.out.println("this is the end of the game you have won");
				System.exit(0);
			}
			System.out.println(currentRoom.getInfo());
			System.out.println("the room number is "+currentRoom.getRoomNumber());
			
			System.out.println("The north exit leads to "+roomList.get(currentRoom.getNorth()-1).getRoomName()+" the east exit leads to "+roomList.get(currentRoom.getEast()-1).getRoomName()+" the south exit leads to "+roomList.get(currentRoom.getSouth()-1).getRoomName()+" the west exit leads to "+roomList.get(currentRoom.getWest()-1).getRoomName());
			
			//System.out.println("The north exit leads to room  "+currentRoom.getNorth()+" the east exit leads to room "+currentRoom.getEast()+" the south exit leads to room "+currentRoom.getSouth()+" the west exit leads to room "+currentRoom.getWest());
			System.out.println("Input a new command ");
			String n = reader.next();
			if(n.toLowerCase().equals("q")) {
				 gameEnd=true;
				 System.out.println("goodbye ");
				
			}
			else if(n.toLowerCase().equals("r")) {
				System.out.println("the room number is "+currentRoom.getRoomNumber());
			}
			else if (n.toLowerCase().equals("info")) {
				
				System.out.println(currentRoom.getInfo());
			}
			else if (n.toLowerCase().equals("m")) {
				System.out.println("do you want to move, n, e, s, w");
				String x = reader.next();
				currentRoom=roomList.get(move.moveRoom(currentRoom, x)-1);
				
			}
			else if (n.toLowerCase().equals("ri")) {
				// System.out.println("the items in the room are");
				System.out.println(currentRoom.RoomItem());
			}
			else if (n.toLowerCase().equals("pi")) {
				
				//System.out.println("the players inventory is");
				System.out.println(mainPlayer.lookInventory());
			}
			else if (n.toLowerCase().equals("ti")){
				mainPlayer.addInventory(currentRoom.takeItem());
			}
			else if (n.toLowerCase().equals("pd")) {
				
				currentRoom.addItem(mainPlayer.dropItems());
			}
			else if (n.toLowerCase().equals("re")) {
				
				//System.out.println("The north exit leads to room  "+currentRoom.getNorth()+" the east exit leads to room "+currentRoom.getEast()+" the south exit leads to room "+currentRoom.getSouth()+" the west exit leads to room "+currentRoom.getWest());
				//System.out.println("The north exit leads to room  "+roomList.get(currentRoom.getNorth()-1).getInfo()+" the east exit leads to room "+roomList.get(currentRoom.getEast()-1).getInfo()+" the south exit leads to room "+roomList.get(currentRoom.getSouth()-1).getInfo()+" the west exit leads to room "+roomList.get(currentRoom.getWest()-1).getInfo());
				System.out.println("The north exit leads to "+roomList.get(currentRoom.getNorth()-1).getRoomName()+" the east exit leads to "+roomList.get(currentRoom.getEast()-1).getRoomName()+" the south exit leads to "+roomList.get(currentRoom.getSouth()-1).getRoomName()+" the west exit leads to "+roomList.get(currentRoom.getWest()-1).getRoomName());
			}
			else {
				
			}
			
	}
		reader.close();

}
	
}
