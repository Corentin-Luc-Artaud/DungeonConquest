package DungeonConquest.entites;

public abstract class Entite {
	
	private String identifient;
	
	public Entite (String identifient) {
		this.identifient = identifient;
	}
	
	public String getIdentifient () {
		return identifient;
	}
}
