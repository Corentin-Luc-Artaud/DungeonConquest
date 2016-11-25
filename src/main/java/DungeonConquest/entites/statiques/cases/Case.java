package DungeonConquest.entites.statiques.cases;

import DungeonConquest.entites.statiques.EntiteStatique;
import DungeonConquest.entites.utilitaire.Coordonnee;

public abstract class Case extends EntiteStatique {

	private final Coordonnee COORDONNEES;
	
	public Case(String identifient, final Coordonnee COORDONNEES) {
		super(identifient);
		this.COORDONNEES = COORDONNEES;
	}
	
	public Coordonnee getCoordonnees () {
		return COORDONNEES;
	}
	
	public abstract boolean peutContenirEntites ();

}
