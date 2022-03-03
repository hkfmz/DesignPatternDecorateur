package decorateur;

import plats.Plat;

public class Oeuf extends AbstractDecorateur{

	public Oeuf(Plat plat) {
		super(plat);
		this.description = plat.getDescription() + " + oeuf ";
	}

	@Override
	public double prix() {
		return 8 + plat.prix();
	}

}