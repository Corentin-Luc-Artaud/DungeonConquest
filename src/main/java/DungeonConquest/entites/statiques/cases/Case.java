package DungeonConquest.entites.statiques.cases;

import DungeonConquest.entites.statiques.EntiteStatique;

public abstract class Case extends EntiteStatique {
	
	public Case(String identifient) {
		super(identifient);
	}
	
	public abstract boolean peutContenirEntites ();

}
