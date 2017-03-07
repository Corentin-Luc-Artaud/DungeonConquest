package DungeonConquest.entites.statiques.objet.equipement;

import java.util.List;

import javax.swing.ImageIcon;

import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Accessoire extends Equipement {
	
	private List<Integer> bonus;

	public Accessoire(String identifiant, ImageIcon image, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete, List<Integer> bonus) {
		super(identifiant, image, nomObjet, niveauRequis, materiaux, rarete);
		this.bonus = bonus;
	}
	
	public List<Integer> getBonus () {
		return bonus;
	}

}
