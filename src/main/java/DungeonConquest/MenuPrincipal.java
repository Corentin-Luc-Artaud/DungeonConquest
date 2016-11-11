
import java.awt.GridLayout;
import javax.swing.*;

public class MenuPrincipal extends JPanel {
	private JPanel panneau  = new JPanel();
	public MenuPrincipal(){	
		super();
		panneauBoutton();
		add(panneau);
	}
	
	private void panneauBoutton(){
		panneau.setLayout(new GridLayout(4, 1));
		creerBouton("Nouvelle partie");
		creerBouton("Charger partie");
		creerBouton("Paramètres");
		creerBouton("Quitter");
		panneau.setOpaque(false);
		panneau.setBorder(BorderFactory.createEmptyBorder(250, getWidth()/3, 250, getWidth()/3));
	}
	
	public void creerBouton(String nom){
		JButton bouton = new JButton(nom);
		bouton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panneau.add(bouton);
	}
}
