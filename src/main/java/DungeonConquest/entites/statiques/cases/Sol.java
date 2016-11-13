package DungeonConquest.entites.statiques.cases;

import java.util.List;

import DungeonConquest.entites.dynamiques.EntiteDynamique;
import DungeonConquest.entites.statiques.objet.Objet;
import DungeonConquest.entites.utilitaire.Coordonnee;

public class Sol extends Case{

	private EntiteDynamique entiteDynamique;
	private List<Objet> butin;
	private TypeDeSol typeDeSol;
	
	public Sol(String identifient, Coordonnee COORDONNEES) {
		super(identifient, COORDONNEES);
	}
	
	public EntiteDynamique getEntiteDynamique () {
		return entiteDynamique;
	}
	
	public List<Objet> getButin () {
		return butin;
	}
	
	public TypeDeSol getTypeDeSol () {
		return typeDeSol;
	}
	
	public void setEntiteDynamique (EntiteDynamique entiteDynamique) {
		this.entiteDynamique = entiteDynamique;
	}
	
	public void setButin (List<Objet> butin) {
		this.butin = butin;
	}
	
	public void setTypeDeSol (TypeDeSol typeDeSol) {
		this.typeDeSol = typeDeSol;
	}

	@Override
	public boolean PeutContenirEntites() {
		return true;
	}

}
