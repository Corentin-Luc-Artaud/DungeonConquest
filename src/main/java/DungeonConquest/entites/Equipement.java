package DungeonConquest.entites;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Equipement extends Objet{
	
	private int niveauRequis;
	private Materiaux materiaux;
	private Rarete rarete;
	
	public Equipement (String identifiant, int niveauRequis, Materiaux materiaux, Rarete rarete) {
		super (identifiant);
		this.niveauRequis = niveauRequis;
		this.materiaux = materiaux;
		this.rarete = rarete;
	}
	
}
