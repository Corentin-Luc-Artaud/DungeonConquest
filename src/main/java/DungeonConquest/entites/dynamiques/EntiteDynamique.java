package DungeonConquest.entites.dynamiques;

import DungeonConquest.entites.Entite;

public abstract class EntiteDynamique extends Entite{

	private int pointsDeVieMaximum;
	private int pointsDeVie;
	
	private int niveau;
	
	private int force;
	private int constitution;
	
	public EntiteDynamique(int force, int constitution) {
		this.force = force;
		this.constitution = constitution;
		niveau = 1;
		pointsDeVieMaximum = calculPointsDeVieMax();
		pointsDeVie = pointsDeVieMaximum;
	}
	
	
	/*Calculs des statistiques*/
	
	public int calculPointsDeVieMax () {
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
	
	public int getPointsDeVieMax () {
		return pointsDeVieMaximum;
	}
	
	public int getNiveau () {
		return niveau;
	}
	
	public int getForce () {
		return force;
	}
	
	public int getConstitution () {
		return constitution;
	}
	
	/*Setteurs*/
	
	protected void setForce(int force) {
		this.force = force;
	}
	
	protected void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	
	protected void setPointsDeVieMaximum(int pointsDeVieMaximum) {
		this.pointsDeVieMaximum = pointsDeVieMaximum;
	}
	
	/*Fonction Abstraite*/
	
	public abstract boolean estEnVie ();
}
