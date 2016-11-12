package DungeonConquest.entites;

import java.util.List;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Collier extends Accessoire {

	public Collier(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, List<Integer> bonus) {
		super(identifiant, niveauRequis, materiaux, rarete, bonus);
	}

}
