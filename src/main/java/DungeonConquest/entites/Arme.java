package DungeonConquest.entites;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Arme extends Equipement{
	
	private String typeArme;

	public Arme(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, String typeArme) {
		super(identifiant, niveauRequis, materiaux, rarete);
		this.typeArme = typeArme;
	}
	
	public int degatsMin () {
		return
	}
	
	public int degatsMax () {
		return
	}

}
