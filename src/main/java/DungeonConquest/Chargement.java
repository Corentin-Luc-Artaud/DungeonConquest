package DungeonConquest;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Chargement extends Menu{

	private static final long serialVersionUID = 1L;
	private static ImageIcon icon = new ImageIcon("");
	private DungeonConquestLauncher frame;
	public Chargement(DungeonConquestLauncher frame) {
		super("Charger Partie", "Jouer", "Retour", icon);
		this.frame = frame;
		initCentre();
	}

	@Override
	protected JPanel centre() {
		//TODO faire le menu de chargement de partie
		return new JPanel();
	}
	
	@Override
	protected void doOnAnnuler() {
		frame.changeToMenu();
	}

	@Override
	protected void doOnAccept() {
		// TODO Auto-generated method stub
		
	}
}
