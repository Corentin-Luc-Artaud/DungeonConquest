package DungeonConquest.entites.statiques.objet;

import DungeonConquest.entites.statiques.EntiteStatique;

public class Objet extends EntiteStatique {
	
	private String nomObjet;
	
	public Objet (String identifiant, String nomObjet) {
		super(identifiant);
		this.nomObjet = nomObjet;
	}
	
	public String getNomObjet () {
		return nomObjet;
	}
}
