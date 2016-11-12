package DungeonConquest.entites;

import java.util.List;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Accessoire extends Equipement {
	
	private List<Integer> bonus;

	public Accessoire(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, List<Integer> bonus) {
		super(identifiant, niveauRequis, materiaux, rarete);
		this.bonus = bonus;
	}
	
	public List<Integer> getBonus () {
		return bonus;
	}

}
