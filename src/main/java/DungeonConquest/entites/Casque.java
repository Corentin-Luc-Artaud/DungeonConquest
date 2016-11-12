package DungeonConquest.entites;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Casque extends Armure {

	public Casque(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete) {
		super(identifiant, niveauRequis, materiaux, rarete);
	}
	
	@Override
	public int defence () {
		return ((super.defence() * 20)/100);
	}
}
