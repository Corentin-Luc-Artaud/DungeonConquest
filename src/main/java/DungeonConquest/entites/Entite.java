package DungeonConquest.entites;

import javax.swing.ImageIcon;

public abstract class Entite {
	
	private String identifient;
	private ImageIcon image;
	
	public Entite (String identifient, ImageIcon image) {
		this.identifient = identifient;
	}
	
	public String getIdentifient () {
		return identifient;
	}
}
