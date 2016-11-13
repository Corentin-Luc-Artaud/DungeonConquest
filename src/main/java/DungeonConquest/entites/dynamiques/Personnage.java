package DungeonConquest.entites.dynamiques;

import java.util.ArrayList;
import java.util.List;

import DungeonConquest.entites.statiques.objet.equipement.Accessoire;
import DungeonConquest.entites.statiques.objet.equipement.Arme;
import DungeonConquest.entites.statiques.objet.equipement.Armure;
import DungeonConquest.entites.statiques.objet.equipement.Bague;
import DungeonConquest.entites.statiques.objet.equipement.Bottes;
import DungeonConquest.entites.statiques.objet.equipement.Casque;
import DungeonConquest.entites.statiques.objet.equipement.Collier;
import DungeonConquest.entites.statiques.objet.equipement.Gants;
import DungeonConquest.entites.statiques.objet.equipement.Plastron;
import DungeonConquest.entites.utilitaire.ConstantesEntite;
import DungeonConquest.entites.utilitaire.Coordonnee;

public class Personnage extends EntiteDynamique{
	
	private String nomPersonnage;
	
	private Armure casque;
	private Armure plastron;
	private Armure bottes;
	private Armure gants;
	
	private Accessoire collier;
	private Accessoire bague;
	
	private Arme arme;
	
	/**
	 *  indice 0 : bonus attaque
	 *  indice 1 : bonus defence
	 *  indice 2 : bonus force
	 *  indice 3 : bonus dexterite
	 *  indice 4 : bonus constitution
	 *  indice 5 : bonus intelligence
	 */
	private List<Integer> bonusActifs;
	
	public Personnage(String identifient, String nomPersonnage, Coordonnee coordonnees, int niveau, int force, int dexterite, int constitution, int intelligence) {
		super(identifient, coordonnees, niveau, force, dexterite, constitution, intelligence);
		
		this.nomPersonnage = nomPersonnage;
		
		bonusActifs = new ArrayList<Integer> ();
		for(byte i = 0; i < ConstantesEntite.NOMBRE_BONUS; ++i) {
			bonusActifs.add(i, 0);
		}
	}
	
	@Override
	public boolean estEnVie() {

		if (getPointsDeVie() > 0)
			return true;
		
		return false;
	}
	
	/*Gestion Bonus*/
	
	private void supprimerBonus (Accessoire accessoire) {
		for (int i = 0; i < bonusActifs.size(); ++i) {
			bonusActifs.set(i, bonusActifs.get(i) - accessoire.getBonus().get(i));
		}
		setForce(getForce() - accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_FORCE));
		setDexterite(getDexterite() - accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_DEXTERITE));
		setConstitution(getConstitution() - accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_CONSTITUTION));
		setIntelligence(getIntelligence() - accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_INTELLIGENCE));
	}
	
	private void ajouterBonus (Accessoire accessoire) {
		for (int i = 0; i < bonusActifs.size(); ++i) {
			bonusActifs.set(i, bonusActifs.get(i) + accessoire.getBonus().get(i));
		}
		setForce(getForce() + accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_FORCE));
		setDexterite(getDexterite() + accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_DEXTERITE));
		setConstitution(getConstitution() + accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_CONSTITUTION));
		setIntelligence(getIntelligence() + accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_INTELLIGENCE));
	}
	
	/*Getteur*/
	
	public List<Integer> getBonusActifs() {
		return bonusActifs;
	}
	
	public Arme getArme() {
		return arme;
	}
	
	public String getNomPersonnage () {
		return nomPersonnage;
	}
	
	/*Calculs des statistiques*/
	
	@Override
	public int pointsAttaque () {
		return super.pointsAttaque() + bonusActifs.get(ConstantesEntite.INDICE_BONUS_ATTAQUE);
	}
	
	@Override
	public int pointsAttaqueDistance () {
		return super.pointsAttaqueDistance() + bonusActifs.get(ConstantesEntite.INDICE_BONUS_ATTAQUE_DISTANCE);
	}
	
	@Override
	public int pointsAttaqueMagique () {
		return super.pointsAttaqueMagique() + bonusActifs.get(ConstantesEntite.INDICE_BONUS_ATTAQUE_MAGIQUE);
	}
	
	@Override
	public int pointsDefence () {
		int defence = super.pointsDefence() + bonusActifs.get(ConstantesEntite.INDICE_BONUS_DEFENCE);
		if (casque != null)
			defence += casque.defence();
		if (plastron != null)
			defence += plastron.defence();
		if (bottes != null)
			defence += bottes.defence();
		if (gants != null)
			defence += gants.defence();
		return defence;
	}
	
	/*Equiper*/
	
	public void equiperCasque (Casque casque) {
		if (casque == null || getNiveau() <= casque.getNiveauRequis())
			this.casque = casque;
	}
	
	public void equiperPlastron (Plastron plastron) {
		if (plastron == null || getNiveau() <= plastron.getNiveauRequis())
			this.plastron = plastron;
	}
	
	public void equiperBottes (Bottes bottes) {
		if (bottes == null || getNiveau() <= bottes.getNiveauRequis())
			this.bottes = bottes;
	}
	
	public void equiperGants (Gants gants) {
		if (gants == null || getNiveau() <= gants.getNiveauRequis())
			this.gants = gants;
	}
	
	public void equiperCollier (Collier collier) {
		if (collier == null || getNiveau() <= collier.getNiveauRequis()) {
			if (this.collier != null)
				supprimerBonus(this.collier);
			
			this.collier = collier;
			
			if (collier != null)
				ajouterBonus(collier);
		}
	}

	public void equiperBague (Bague bague) {
		if (bague == null || getNiveau() <= bague.getNiveauRequis()) {
			if (this.bague != null)
				supprimerBonus(this.bague);
			
			this.bague = bague;
			
			if (bague != null)
				ajouterBonus(bague);
		}
	}
	
	public void equiperArme (Arme arme) {
		if (arme == null || getNiveau() <= arme.getNiveauRequis())
			this.arme = arme;
	}
}
