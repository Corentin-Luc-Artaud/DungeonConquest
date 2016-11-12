package DungeonConquest.entites.utilitaire;

public class Materiaux {

	private String nomMat;
	private int coefficientMat;
	
	public Materiaux (String nomMat, int coefficientMat) {
		this.nomMat = nomMat;
		this.coefficientMat = coefficientMat;
	}
	
	public String getNomMat () {
		return nomMat;
	}
	
	public int getCoefficientMat () {
		return coefficientMat;
	}
}
