package DungeonConquest.entites.statiques;

public class Objet extends EntiteStatique {
	
	private String identifiant;
	
	public Objet (String identifiant) {
		this.identifiant = identifiant;
	}
	
	public String getIdentifiant () {
		return identifiant;
	}
}
