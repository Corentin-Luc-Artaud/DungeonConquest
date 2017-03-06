package DungeonConquest.entites.dynamiques;

import DungeonConquest.entites.Entite;
import DungeonConquest.entites.utilitaire.Coordonnee;

public class EntiteDynamique extends Entite{

	private Coordonnee coordonnees;
	
	private int pointsDeVie;
	
	private int niveau;
	
	private int force;
	private int dexterite;
	private int constitution;
	private int intelligence;
	
	public EntiteDynamique(String identifient, Coordonnee coordonnees, int niveau, int force, int dexterite, int constitution, int intelligence) {
		super(identifient);
		this.coordonnees = coordonnees;
		this.force = force;
		this.dexterite = dexterite;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.niveau = niveau;
		pointsDeVie = pointsDeVieMax();
	}
	
	public boolean estEnVie() {

		if (pointsDeVie > 0)
			return true;
		
		return false;
	}
	
	
	/*Calculs des statistiques*/
	
	public int pointsDeVieMax () {
		return 500*niveau + 100*bonusConstitution();
	}

	public int bonusForce () {
		return (force/2)-5;
	}
	
	public int bonusDexterite () {
		return (dexterite/2)-5;
	}
	
	public int bonusConstitution () {
		return (constitution/2)-5;
	}
	
	public int bonusIntelligence () {
		return (intelligence/2)-5;
	}
	
	public int pointsAttaque () {
		return 300*niveau + 100*bonusForce();
	}
	
	public int pointsAttaqueDistance () {
		return 300*niveau + 100*bonusDexterite();
	}
	
	public int pointsAttaqueMagique () {
		return 300*niveau + 100*bonusIntelligence();
	}
	
	public int pointsDefence () {
		return 300*niveau + 100*bonusConstitution();
	}
	
	//TESTER
	public float tauxDeCritique () {
		return (float)(5 + niveau + bonusDexterite())/100;
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
	
	public int getDexterite () {
		return dexterite;
	}
	
	public int getConstitution () {
		return constitution;
	}
	
	public int getIntelligence () {
		return intelligence;
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
	
	protected void setDexterite(int dexterite) {
		this.dexterite = dexterite;
	}
	
	protected void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	
	protected void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	protected void setNiveau(int niveau) {
		this.niveau = niveau;
	}
}
