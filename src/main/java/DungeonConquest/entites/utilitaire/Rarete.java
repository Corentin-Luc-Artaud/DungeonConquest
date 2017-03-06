package DungeonConquest.entites.utilitaire;

public class Rarete {

	private String typeRarete;
	private int coefficientRarete;
	
	public Rarete (String typeRarete, int coefficientRarete) {
		this.typeRarete = typeRarete;
		this.coefficientRarete = coefficientRarete;
	}
	
	public String getTypeRarete () {
		return typeRarete;
	}
	
	public int getCoefficientRarete() {
		return coefficientRarete;
	}
}
