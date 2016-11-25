package DungeonConquest.entites.statiques.cases;

import DungeonConquest.entites.utilitaire.Coordonnee;

public class Mur extends Case{

	public Mur(String identifient, Coordonnee COORDONNEES) {
		super(identifient, COORDONNEES);
	}

	@Override
	public boolean peutContenirEntites() {
		return false;
	}

}
