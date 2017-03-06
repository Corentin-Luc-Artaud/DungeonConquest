package DungeonConquest.entites.statiques.cases;

import java.util.List;

import DungeonConquest.entites.dynamiques.EntiteDynamique;
import DungeonConquest.entites.statiques.objet.Objet;
import DungeonConquest.entites.utilitaire.Coordonnee;

public class Sol extends Case{

	private EntiteDynamique entiteDynamique;
	private List<Objet> butin;
	private TypeDeSol typeDeSol;
	
	public Sol(String identifient, Coordonnee COORDONNEES, TypeDeSol typeDeSol) {
		super(identifient, COORDONNEES);
		this.typeDeSol = typeDeSol;
	}
	
	
	/* Getteurs */
	
	public EntiteDynamique getEntiteDynamique () {
		return entiteDynamique;
	}
	
	public List<Objet> getButin () {
		return butin;
	}
	
	public TypeDeSol getTypeDeSol () {
		return typeDeSol;
	}
	
	
	/* Setteurs */
	
	public void setEntiteDynamique (EntiteDynamique entiteDynamique) {
		this.entiteDynamique = entiteDynamique;
	}
	
	//Ajout des objets un par un
	public void addObjetAuButin (Objet objet) {
		butin.add(objet);
	}
	
	public void setTypeDeSol (TypeDeSol typeDeSol) {
		this.typeDeSol = typeDeSol;
	}
	
	@Override
	public boolean peutContenirEntites() {
		return true;
	}
	
	public boolean caseLibre () {
		if (entiteDynamique != null)
			return false;
		return true;
	}

}
