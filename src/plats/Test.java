package plats;

import decorateur.Oeuf;

public class Test {

	public static void main(String[] args) {
		
		Plat plat = new Macaroni();
		System.out.println(plat.getDescription());
		System.out.println(plat.prix());
		System.out.println("--------------------------");
		
		plat = new Oeuf(plat);
		System.out.println(plat.getDescription());
		System.out.println(plat.prix());
		System.out.println("--------------------------");
		
		plat = new Oeuf(plat);
		System.out.println(plat.getDescription());
		System.out.println(plat.prix());
		System.out.println("--------------------------");

	}

}
