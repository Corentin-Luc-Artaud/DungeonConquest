package DungeonConquest.entites.statiques;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Gants extends Armure {

	private int coefficientDefence;
	
	public Gants(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, int defenceTotale, int coefficientDefence) {
		super(identifiant, niveauRequis, materiaux, rarete, defenceTotale);
		this.coefficientDefence = coefficientDefence;
	}
	
	@Override
	public int defence() {
		return ((super.defence() * coefficientDefence)/100);
	}

}
