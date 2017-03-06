package DungeonConquest.entites.statiques.objet.potion;

import DungeonConquest.entites.dynamiques.Personnage;

public class PotionSoin extends Potion {

	public PotionSoin(String identifiant, String nomObjet, int gradePotion) {
		super(identifiant, nomObjet, gradePotion);
	}

	private float calculerRatio () {
		return getGradePotion()/10;
	}
	
	@Override
	public void appliquerEffet(Personnage personnage) {
		personnage.addPointsDeVie((int)(personnage.pointsDeVieMax()*calculerRatio()));
	}

}
