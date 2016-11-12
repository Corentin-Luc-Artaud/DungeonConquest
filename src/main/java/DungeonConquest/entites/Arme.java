package DungeonConquest.entites;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;
import DungeonConquest.entites.utilitaire.TypeArme;

public class Arme extends Equipement{
	
	private TypeArme typeArme;

	public Arme(String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete, TypeArme typeArme) {
		super(identifiant, niveauRequis, materiaux, rarete);
		this.typeArme = typeArme;
	}
	
	public int degatsMin () {
		int coefficientMatRarete = getMateriaux().getCoefficientMat() * getRarete().getCoefficientRarete();
		return (getNiveauRequis() * (100*coefficientMatRarete + 10*typeArme.getBonusArme()
		       - getNiveauRequis()) - 100/coefficientMatRarete);
	}
	
	public int degatsMax () {
		int coefficientMatRarete = getMateriaux().getCoefficientMat() * getRarete().getCoefficientRarete();
		return (getNiveauRequis() * (100*coefficientMatRarete + 10*typeArme.getBonusArme()
			   + getNiveauRequis()) + 10*coefficientMatRarete);
	}

}
