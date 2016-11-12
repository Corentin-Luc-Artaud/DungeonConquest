package DungeonConquest.entites;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Gants extends Armure {

	public Gants(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete) {
		super(identifiant, niveauRequis, materiaux, rarete);
	}
	
	@Override
	public int defence () {
		return ((super.defence() * 15)/100);
	}

}
