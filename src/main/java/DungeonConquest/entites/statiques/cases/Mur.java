package DungeonConquest.entites.statiques.cases;

public class Mur extends Case{

	public Mur(String identifient) {
		super(identifient);
	}

	@Override
	public boolean peutContenirEntites() {
		return false;
	}

}
