package adventureGame;

public class Items {
	
	private String name;
	private String info;
	private int number;
	
	public Items(String name, String info, int number) {
		
		this.name=name;
		this.info=info;
		this.number=number;
	}
	
	public void setName(String input) {
		
		this.name=input;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public String getInfo() {
		
		return this.info;
	}
	public void setInfo(String input) {
		
		this.info=input;
	}
	public int getNumber() {
		
		return this.number;
	}
	public void setNumber(int input) {
		
		this.number=input;
	}

}
