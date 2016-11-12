package DungeonConquest.entites;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Armure extends Equipement {
	
	public Armure(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete) {
		super(identifiant, niveauRequis, materiaux, rarete);
	}
	
	public int defence() {
		int coefficientMatRarete = getMateriaux().getCoefficientMat() * getRarete().getCoefficientRarete();
		return (10*getNiveauRequis() * (10*coefficientMatRarete + 1));
	}
	
}
