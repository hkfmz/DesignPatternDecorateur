package plats;

public abstract class Plat {
	
	protected String description;
	
	public abstract double prix();

	public String getDescription() {
		return description;
	}
	
}
