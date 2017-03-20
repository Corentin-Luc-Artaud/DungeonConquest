package DungeonConquest.carte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import DungeonConquest.entites.statiques.cases.Case;
import DungeonConquest.entites.statiques.cases.Mur;
import DungeonConquest.entites.statiques.cases.Sol;
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
	
	public void generer(String filename) {
		File file = new File(filename);
		if(file.exists() && file.canRead()){
			try {
				Scanner in = new Scanner(file);
				for (int i = 0; i < matCase.size(); i++) {
					for (int j = 0; j < matCase.get(i).size(); j++) {
						String str = in.next();
						//////////////////////////////////
						// TODO A améliorer
						if (str.equals("#")) matCase.get(i).set(j, new Mur(str, null));
						else if(str.equals("1")) matCase.get(i).set(j, new Sol(str, null, null));
						//////////////////////////////////
					}
				}
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public void addCase(Case maCase, Coordonnee coordonnee) {
		matCase.get(coordonnee.getY()).set(coordonnee.getX(), maCase);
	}
	
	public Case getCase(Coordonnee coordonnee) {
		return matCase.get(coordonnee.getY()).get(coordonnee.getX());
	}
}
