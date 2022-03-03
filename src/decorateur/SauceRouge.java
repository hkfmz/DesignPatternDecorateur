package decorateur;
import plats.Plat;

public class SauceRouge extends AbstractDecorateur{

	public SauceRouge(Plat plat) {
		super(plat);
		this.description = plat.getDescription() + " + sauce rouge";
	}
	
	@Override
	public double prix() {
	   return 12 + plat.prix();
	}

}
