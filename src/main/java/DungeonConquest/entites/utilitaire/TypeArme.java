package DungeonConquest.entites.utilitaire;

public class TypeArme {
	
	private String typeArme;
	private int bonusArme;
	
	public TypeArme (String typeArme, int bonusArme) {
		this.typeArme = typeArme;
		this.bonusArme = bonusArme;
	}
	
	public String getTypeArme () {
		return typeArme;
	}
	
	public int getBonusArme() {
		return bonusArme;
	}
}
