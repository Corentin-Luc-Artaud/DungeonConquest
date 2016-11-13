package DungeonConquest.entites.statiques.objet.equipement;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Plastron extends Armure {

	private int coefficientDefence;
	
	public Plastron(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, int defenceTotale, int coefficientDefence) {
		super(identifiant, niveauRequis, materiaux, rarete, defenceTotale);
		this.coefficientDefence = coefficientDefence;
	}
	
	@Override
	public int defence() {
		return ((super.defence() * coefficientDefence)/100);
	}

}
