package DungeonConquest.entites.statiques.objet;

import javax.swing.ImageIcon;

import DungeonConquest.entites.statiques.EntiteStatique;

public class Objet extends EntiteStatique {
	
	private String nomObjet;
	
	public Objet (String identifiant, ImageIcon image, String nomObjet) {
		super(identifiant, image);
		this.nomObjet = nomObjet;
	}
	
	public String getNomObjet () {
		return nomObjet;
	}
}
