package DungeonConquest.entites.statiques.objet.equipement;

import java.util.List;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Bague extends Accessoire {

	public Bague(String identifiant, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, List<Integer> bonus) {
		super(identifiant, nomObjet, niveauRequis, materiaux, rarete, bonus);
	}

}
