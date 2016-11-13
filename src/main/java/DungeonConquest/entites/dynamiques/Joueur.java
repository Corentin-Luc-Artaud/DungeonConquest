package DungeonConquest.entites.dynamiques;

import DungeonConquest.entites.utilitaire.Coordonnee;

public class Joueur extends Personnage {

	private int experience;
	
	public Joueur(String identifient, String nomPersonnage, Coordonnee coordonnees, int niveau, int force, int constitution, int experience) {
		super(identifient, nomPersonnage, coordonnees, niveau, force, constitution);
		
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
