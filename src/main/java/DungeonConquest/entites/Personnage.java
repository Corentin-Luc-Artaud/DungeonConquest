package DungeonConquest.entites;

import java.util.ArrayList;
import java.util.List;

public class Personnage extends EntiteDynamique{
	
	private int experience;
	
	private Armure casque;
	private Armure plastron;
	private Armure bottes;
	private Armure gants;
	
	private Accessoire collier;
	private Accessoire bague;
	
	private Arme arme;
	
	private List<Integer> bonusActifs;
	
	public Personnage(int force, int constitution) {
		super(force, constitution);
		experience = 0;
		
		bonusActifs = new ArrayList<Integer> ();
		for(byte i = 0; i < 4; ++i) {
			bonusActifs.add(i, 0);
		}
	}
	
	@Override
	public boolean estEnVie() {

		if (getPointsDeVie() > 0)
			return true;
		
		return false;
	}
	
	private void supprimerBonus (Accessoire accessoire) {
		for (int i = 0; i < bonusActifs.size(); ++i) {
			bonusActifs.set(i, bonusActifs.get(i) - accessoire.getBonus().get(i));
		}
	}
	
	private void ajouterBonus (Accessoire accessoire) {
		for (int i = 0; i < bonusActifs.size(); ++i) {
			bonusActifs.set(i, bonusActifs.get(i) + accessoire.getBonus().get(i));
		}
	}
	
	/*Getteur*/
	
	public List<Integer> getBonusActifs() {
		return bonusActifs;
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
