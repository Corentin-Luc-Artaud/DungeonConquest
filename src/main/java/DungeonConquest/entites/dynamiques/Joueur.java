package DungeonConquest.entites.dynamiques;

public class Joueur extends Personnage {

	private int experience;
	
	public Joueur(String identifient, int niveau, int force, int constitution) {
		super(identifient, niveau, force, constitution);
		
		experience = 0;
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
