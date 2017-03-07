package DungeonConquest.entites.statiques.objet.potion;

import javax.swing.ImageIcon;

import DungeonConquest.entites.dynamiques.Personnage;
import DungeonConquest.entites.statiques.objet.Objet;

public abstract class Potion extends Objet {
	
	private int gradePotion;
	
	public Potion (String identifiant, ImageIcon image, String nomObjet, int gradePotion) {
		super(identifiant, image, nomObjet);
		this.gradePotion = gradePotion;
	}
	
	public int getGradePotion () {
		return gradePotion;
	}
	
	public abstract void appliquerEffet (Personnage personnage);
}
