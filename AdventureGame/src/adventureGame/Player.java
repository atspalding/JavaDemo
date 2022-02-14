package adventureGame;

import java.util.ArrayList;

public class Player {
	private String name;
	private int age;
	private ArrayList<Items> Inventory;
	private int HP;
	
	
	public Player(String name, int age) {
		this.name=name;
		this.age=age;
		Inventory=new ArrayList<Items>(5);
	}
	public void setName(String input) {
		
		this.name=input;
	}
	
	public String getName() {
		
		return this.name;  
	}
    public void setAge(int input) {
    	
    	this.age=input;
    }
    public int getAge() {
    	
    	return this.age;
    }
    public int getHP() {
    	
    	return this.HP;
    }
    public void setHP(int input) {
    	
    	this.HP=input;
    	
    	
    }
    public void addInventory(Items input) {
    	
    	Inventory.add(input);
    }
    public String lookInventory() {
    	String itemString="";
    	int t=0;
    	while(t < Inventory.size()) {
    		itemString=itemString+Inventory.get(t).getName();
    		itemString=itemString+",";
    		t++;
    		
    	}
    	System.out.println("the players inventory is");
    	
    	return itemString;
    }
    public Items dropItems() {
    	if(this.Inventory.size()>0) {
    		Items tempItem=this.Inventory.get(0);
    		System.out.println("You have droped "+tempItem.getName());
    		this.Inventory.remove(0);
    		return tempItem;
    	}
    	else {
    		
    		return null;
    	}
    	
    }
}
