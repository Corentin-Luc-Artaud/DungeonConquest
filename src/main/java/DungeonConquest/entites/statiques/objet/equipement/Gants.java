package DungeonConquest.entites.statiques.objet.equipement;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Gants extends Armure {

	private int defence;
	
	public Gants(String identifiant, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, int defenceTotale, int defence) {
		super(identifiant, nomObjet, niveauRequis, materiaux, rarete, defenceTotale);
		this.defence = defence;
	}
	
	@Override
	public int defence() {
		return defence;
	}

}
