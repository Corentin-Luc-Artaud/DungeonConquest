package DungeonConquest.entites.statiques;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Armure extends Equipement {
	
	private int defenceTotale;
	
	public Armure(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, int defenceTotale) {
		super(identifiant, niveauRequis, materiaux, rarete);
		this.defenceTotale = defenceTotale;
	}
	/*
	public int defence() {
		int coefficientMatRarete = getMateriaux().getCoefficientMat() * getRarete().getCoefficientRarete();
		return (10*getNiveauRequis() * (10*coefficientMatRarete + 1));
	}*/
	
	public int defence () {
		return defenceTotale;
	}
	
}
