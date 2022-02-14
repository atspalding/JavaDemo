package adventureGame;
//https://stackoverflow.com/questions/5287538/how-can-i-get-the-user-input-in-java
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
			
			Bicycle myBike = new Bicycle(1,2,3);
			Boolean end=false;
			while (end!=true) {
				System.out.println("welcome to bike info");
				Scanner reader = new Scanner(System.in);  // Reading from System.in
				System.out.println("Enter q to quit ");
				String n = reader.next();
				if(n.equals("q")) {
					 end=true;
					 System.out.println("goodbye ");
					reader.close();
					
				}
				else if(n.equals("id")) {
					System.out.println("the bike id is");
					System.out.println(myBike.getID());
					
				}
				else if(n.equals("gg")) {
					System.out.println("the bike gear  is");
					System.out.println(myBike.getGear());
				}
				else if (n.equals("sg")) {
					
					System.out.println("change the bike gear to ");
					int i=0;
				    i=reader.nextInt();
				    myBike.setGear(i);
					System.out.println(myBike.getGear());
					
					
				}
				else {
					
				}
				
				
				
			}
			
	}

}
