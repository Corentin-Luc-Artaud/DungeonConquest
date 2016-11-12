package DungeonConquest.entites.statiques;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Bottes extends Armure {

	public Bottes(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete) {
		super(identifiant, niveauRequis, materiaux, rarete);
	}

	@Override
	public int defence () {
		return ((super.defence() * 15)/100);
	}
}
