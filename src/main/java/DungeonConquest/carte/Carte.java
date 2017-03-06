package DungeonConquest.carte;

import java.util.ArrayList;

import DungeonConquest.entites.statiques.cases.Case;
import DungeonConquest.entites.utilitaire.Coordonnee;

public class Carte {

	private static Carte CARTE = new Carte();
	private ArrayList<ArrayList<Case>> matCase;
	
	private Carte () {
		this.matCase = new ArrayList<ArrayList<Case>>(18);
		for(@SuppressWarnings("unused") ArrayList<Case> array : matCase) {
			array = new ArrayList<Case>(24);
		}
	}
	
	public static Carte getInstance() {
		return CARTE;
	}
	
	public void addCase(Case maCase, Coordonnee coordonnee) {
		matCase.get(coordonnee.getY()).set(coordonnee.getX(), maCase);
	}
	
	public Case getCase(Coordonnee coordonnee) {
		return matCase.get(coordonnee.getY()).get(coordonnee.getX());
	}
}
