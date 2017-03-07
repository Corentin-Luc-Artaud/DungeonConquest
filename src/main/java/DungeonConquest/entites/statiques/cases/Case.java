package DungeonConquest.entites.statiques.cases;

import javax.swing.ImageIcon;

import DungeonConquest.entites.statiques.EntiteStatique;

public abstract class Case extends EntiteStatique {
	
	public Case(String identifient, ImageIcon image) {
		super(identifient, image);
	}
	
	public abstract boolean peutContenirEntites ();

}
