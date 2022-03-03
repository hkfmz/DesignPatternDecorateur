package decorateur;

import plats.Plat;

public abstract class AbstractDecorateur extends Plat{
	protected Plat plat;
	
	public AbstractDecorateur(Plat plat) {
		super();
		this.plat = plat;
	}

}
