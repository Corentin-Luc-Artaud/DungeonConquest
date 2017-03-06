package DungeonConquest.entites.statiques.objet.equipement;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Armure extends Equipement {
	
	private int defenceTotale;
	
	public Armure(String identifiant, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, int defenceTotale) {
		super(identifiant, nomObjet, niveauRequis, materiaux, rarete);
		this.defenceTotale = defenceTotale;
	}
	
	public int defence () {
		return defenceTotale;
	}
	
}
