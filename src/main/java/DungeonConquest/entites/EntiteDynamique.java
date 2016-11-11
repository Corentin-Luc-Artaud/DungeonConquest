package DungeonConquest.entites;

public abstract class EntiteDynamique extends Entite{

	private int pointsDeVie;
	
	private int niveau;
	
	private int force;
	private int constitution;
	
	public EntiteDynamique(int force, int constitution) {
		this.force = force;
		this.constitution = constitution;
		niveau = 1;
		pointsDeVie = calculPointsDeVie();
	}
	
	
	/*Calculs des statistiques*/
	
	private int calculPointsDeVie () {
		return 500*niveau + 100*bonusConstitution();
	}

	public int bonusForce () {
		return (force/2)-5;
	}
	
	public int bonusConstitution () {
		return (constitution/2)-5;
	}
	
	public int pointsAttaque () {
		return 300*niveau + 100*bonusForce();
	}
	
	public int pointsDefence () {
		return 300*niveau + 100*bonusConstitution();
	}
	
	/*Getteurs*/
	
	public int getPointsDeVie () {
		return pointsDeVie;
	}
	
	/*Fonction Abstraite*/
	
	public abstract boolean estEnVie ();
}
