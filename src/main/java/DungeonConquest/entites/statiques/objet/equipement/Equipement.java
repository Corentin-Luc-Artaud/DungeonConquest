package DungeonConquest.entites.statiques.objet.equipement;

import javax.swing.ImageIcon;

import DungeonConquest.entites.statiques.objet.Objet;
import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class Equipement extends Objet{
	
	private int niveauRequis;
	private Materiaux materiaux;
	private Rarete rarete;
	
	public Equipement (String identifiant, ImageIcon image, String nomObjet, int niveauRequis, Materiaux materiaux, Rarete rarete) {
		super (identifiant, image, nomObjet);
		this.niveauRequis = niveauRequis;
		this.materiaux = materiaux;
		this.rarete = rarete;
	}

	public Materiaux getMateriaux() {
		return materiaux;
	}
	
	public Rarete getRarete () {
		return rarete;
	}
	
	public int getNiveauRequis () {
		return niveauRequis;
	}
	
}
