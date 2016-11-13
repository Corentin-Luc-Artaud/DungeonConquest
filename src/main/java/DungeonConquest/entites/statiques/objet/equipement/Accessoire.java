package DungeonConquest.entites.statiques.objet.equipement;

import java.util.List;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Accessoire extends Equipement {
	
	/**
	 *  indice 0 : bonus attaque
	 *  indice 1 : bonus defence
	 *  indice 2 : bonus force
	 *  indice 3 : bonus constitution
	 */
	private List<Integer> bonus;

	public Accessoire(String identifiant, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, List<Integer> bonus) {
		super(identifiant, nomObjet, niveauRequis, materiaux, rarete);
		this.bonus = bonus;
	}
	
	public List<Integer> getBonus () {
		return bonus;
	}

}
