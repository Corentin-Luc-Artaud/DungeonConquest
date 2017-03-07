package DungeonConquest.entites.statiques.objet.equipement;

import javax.swing.ImageIcon;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Plastron extends Armure {

	private int defence;
	
	public Plastron(String identifiant, ImageIcon image, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, int defenceTotale, int defence) {
		super(identifiant, image, nomObjet, niveauRequis, materiaux, rarete, defenceTotale);
		this.defence = defence;
	}
	
	@Override
	public int defence() {
		return defence;
	}

}
