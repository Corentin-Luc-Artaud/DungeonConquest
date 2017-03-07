package DungeonConquest.entites.statiques.objet.equipement;

import javax.swing.ImageIcon;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Arme extends Equipement{
	
	private int degatsMin;
	private int degatsMax;

	public Arme(String identifiant, ImageIcon image, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, int degatsMin, int degatsMax) {
		super(identifiant, image, nomObjet, niveauRequis, materiaux, rarete);
		this.degatsMin = degatsMin;
		this.degatsMax = degatsMax;
	}
	
	/* Getteurs */
	public int getDegatsMin () {
		return degatsMin;
	}
	
	public int getDegatsMax () {
		return degatsMax;
	}

}
