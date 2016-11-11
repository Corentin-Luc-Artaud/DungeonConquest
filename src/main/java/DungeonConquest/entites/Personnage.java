package DungeonConquest.entites;

public class Personnage extends EntiteDynamique{
	
	private int experience;
	
	private Equipement casque;
	private Equipement plastron;
	private Equipement bottes;
	private Equipement gants;
	
	private Equipement collier;
	private Equipement bague;
	
	private Equipement arme;
	
	public Personnage(int force, int constitution) {
		super(force, constitution);
		experience = 0;
	}
	
	@Override
	public boolean estEnVie() {

		if (getPointsDeVie() > 0)
			return true;
		
		return false;
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
		this.collier = collier;
	}

	public void equiperBague (Bague bague) {
		this.bague = bague;
	}
	
	public void equiperArme (Arme arme) {
		this.arme = arme;
	}
}
