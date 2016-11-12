package DungeonConquest.entites.dynamiques;

import java.util.ArrayList;
import java.util.List;

import DungeonConquest.entites.statiques.Accessoire;
import DungeonConquest.entites.statiques.Arme;
import DungeonConquest.entites.statiques.Armure;
import DungeonConquest.entites.statiques.Bague;
import DungeonConquest.entites.statiques.Bottes;
import DungeonConquest.entites.statiques.Casque;
import DungeonConquest.entites.statiques.Collier;
import DungeonConquest.entites.statiques.Gants;
import DungeonConquest.entites.statiques.Plastron;
import DungeonConquest.entites.utilitaire.ConstantesEntite;

public class Personnage extends EntiteDynamique{
	
	private int experience;
	
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
	 *  indice 3 : bonus constitution
	 */
	private List<Integer> bonusActifs;
	
	public Personnage(int force, int constitution) {
		super(force, constitution);
		experience = 0;
		
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
		setConstitution(getConstitution() - accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_CONSTITUTION));
		setPointsDeVieMaximum(calculPointsDeVieMax());
	}
	
	private void ajouterBonus (Accessoire accessoire) {
		for (int i = 0; i < bonusActifs.size(); ++i) {
			bonusActifs.set(i, bonusActifs.get(i) + accessoire.getBonus().get(i));
		}
		setForce(getForce() + accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_FORCE));
		setConstitution(getConstitution() + accessoire.getBonus().get(ConstantesEntite.INDICE_BONUS_CONSTITUTION));
		setPointsDeVieMaximum(calculPointsDeVieMax());
	}
	
	/*Getteur*/
	
	public List<Integer> getBonusActifs() {
		return bonusActifs;
	}
	
	/*Calculs des statistiques*/
	
	@Override
	public int pointsAttaque () {
		return super.pointsAttaque() + bonusActifs.get(ConstantesEntite.INDICE_BONUS_ATTAQUE);
	}
	
	@Override
	public int pointsDefence () {
		return super.pointsDefence() + bonusActifs.get(ConstantesEntite.INDICE_BONUS_DEFENCE);
	}
	
	/*Equiper*/
	
	public void equiperCasque (Casque casque) {
		this.casque = casque;
	}
	
	public void equiperPlastron (Plastron plastron) {
		this.plastron = plastron;
	}
	
	public void equiperBottes (Bottes bottes) {
		this.bottes = bottes;
	}
	
	public void equiperGants (Gants gants) {
		this.gants = gants;
	}
	
	public void equiperCollier (Collier collier) {
		if (this.collier != null)
			supprimerBonus(this.collier);
		
		this.collier = collier;
		
		if (collier != null)
			ajouterBonus(collier);
	}

	public void equiperBague (Bague bague) {
		if (this.bague != null)
			supprimerBonus(this.bague);
		
		this.bague = bague;
		
		if (bague != null)
			ajouterBonus(bague);
	}
	
	public void equiperArme (Arme arme) {
		this.arme = arme;
	}
}
