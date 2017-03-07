package DungeonConquest.entites.dynamiques;

import javax.swing.ImageIcon;

import DungeonConquest.entites.utilitaire.Coordonnee;

public class Joueur extends Personnage {

	private int experience;
	
	public Joueur(String identifient, ImageIcon image, String nomPersonnage, Coordonnee coordonnees, int niveau, int force, int dexterite, int constitution, int intelligence, int experience) {
		super(identifient, image, nomPersonnage, coordonnees, niveau, force, dexterite, constitution, intelligence);
		
		this.experience = experience;
	}
	
	private int experienceRequise () {
		return 100 * getNiveau() * getNiveau();
	}
	
	private void monterDeNiveau () {
		setNiveau(getNiveau()+1);
		setPointsDeVie(pointsDeVieMax());
	}
	
	public void ajouterExperience (int experience) {
		if (getNiveau() < 20) {
			this.experience += experience;
			while (this.experience >= experienceRequise()) {
				this.experience -= experienceRequise();
				monterDeNiveau();
			}
		}
	}

}
