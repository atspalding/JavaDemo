package adventureGame;

import java.util.ArrayList;

public class GameSetUP {
	
	
	
	
	
public Room setUpGameRoom() {
		
		ArrayList<Room> roomList= new ArrayList<Room>();
		//Player mainPlayer= new Player("Player",23);
		// north, east, south , west , room number, info
		Room room1= new Room(2,1,1,1,1,"Starting room","room1");
		Room room2= new Room(3,2,1,2,2,"Mid room","room2");
		Room room3= new Room(4,3,2,3,3,"Ending  room","room3");
		Room room4= new Room(1,2,3,4,4,"Extra Room","room4");
		Items item1=new Items("item1","this is item 1",1);
		room1.addItem(item1);
		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		roomList.add(room4);
		
		return roomList.get(0);
	}
public Player setUpGamePlayer() {
	
	Player mainPlayer= new Player("Player",23);
	
	return mainPlayer; 
	
}


}
