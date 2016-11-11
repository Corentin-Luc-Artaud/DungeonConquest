package entites;

public class Personnage extends EntiteDynamique{

	private double pointsDeVie;
	
	@Override
	public boolean estEnVie() {

		if (pointsDeVie > 0)
			return true;
		
		return false;
	}

}
