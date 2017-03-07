package DungeonConquest.entites.statiques.cases;

import javax.swing.ImageIcon;

public class Mur extends Case{

	public Mur(String identifient, ImageIcon image) {
		super(identifient, image);
	}

	@Override
	public boolean peutContenirEntites() {
		return false;
	}

}
