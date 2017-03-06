package DungeonConquest.carte;

import java.util.HashSet;
import java.util.Set;

import DungeonConquest.entites.statiques.cases.Case;
import DungeonConquest.entites.utilitaire.Coordonnee;

public class Carte {

	private static Carte CARTE = new Carte();
	private Set<Case> listeCases;
	
	private Carte () {
		this.listeCases = new HashSet<Case>();
	}
	
	public static Carte getInstance() {
		return CARTE;
	}
	
	public void addCase(Case maCase) {
		listeCases.add(maCase);
	}
	
	public Case getCase(Coordonnee coordonnee) {
		for(Case maCase : listeCases) {
			if(maCase.getCoordonnees() == coordonnee) return maCase;
		}
		return null;
	}
}
