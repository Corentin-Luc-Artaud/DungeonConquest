package DungeonConquest.entites.dynamiques;

import DungeonConquest.entites.Entite;
import DungeonConquest.entites.utilitaire.Coordonnee;

public abstract class EntiteDynamique extends Entite{

	private Coordonnee coordonnees;
	
	private int pointsDeVie;
	
	private int niveau;
	
	private int force;
	private int constitution;
	
	public EntiteDynamique(String identifient, Coordonnee coordonnees, int niveau, int force, int constitution) {
		super(identifient);
		this.coordonnees = coordonnees;
		this.force = force;
		this.constitution = constitution;
		this.niveau = niveau;
		pointsDeVie = pointsDeVieMax();
	}
	
	
	/*Calculs des statistiques*/
	
	public int pointsDeVieMax () {
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
	
	public int getNiveau () {
		return niveau;
	}
	
	public int getForce () {
		return force;
	}
	
	public int getConstitution () {
		return constitution;
	}
	
	public Coordonnee getCoordonnees () {
		return coordonnees;
	}
	
	/*Setteurs*/
	
	protected void setPointsDeVie (int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}
	
	protected void setForce(int force) {
		this.force = force;
	}
	
	protected void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	
	protected void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	/*Fonction Abstraite*/
	
	public abstract boolean estEnVie ();
}
