package adventureGame;

import java.util.ArrayList;

public class Movement {
	
	// private ArrayList<Room>Rooms;
	 private String Direction;
	 private Room currentRoom;
	 
	 
	 
	// public Movement(ArrayList<Room> Room, Room currentRoomInput) {
		 
	//	 this.Rooms=Room;
	//	 this.currentRoom=currentRoomInput;
	// }
 public Movement(Room currentRoomInput) {
		 
		// this.Rooms=Room;
		 this.currentRoom=currentRoomInput;
	 }


	 public int moveRoom(Room input, String direction) {
		 int i=0;
		 this.currentRoom=input;
		 this.Direction=direction;
		 if(Direction.equals("n")) {
			 
			 i=currentRoom.getNorth();
		 }
		 else if(Direction.equals("e")) {
			 i=currentRoom.getEast();
		 }
		 else if(Direction.equals("s")) {
			 i=currentRoom.getSouth();
			 
		 }
		 else if (Direction.equals("w")) {
			 i=currentRoom.getWest();
		 }
		 
		 return i;
		 
	 }
}
