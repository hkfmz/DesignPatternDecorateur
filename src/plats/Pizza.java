package plats;

public class Pizza extends Plat{
	
	public Pizza() {
		this.description = "Pizza";
	}
 
	@Override
	public double prix() {
		
		return 70;
	}

}
