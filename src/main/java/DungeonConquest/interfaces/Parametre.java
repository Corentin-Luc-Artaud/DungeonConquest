package DungeonConquest.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 
 * @author Yacine                                       
 * @brief classe correspondant à la fenetre d'options pour gérer les touches
 */
@SuppressWarnings("serial")
public class Parametre extends Menu{
	private static ImageIcon icon = new ImageIcon("/home/nalfein/Bureau/wallhaven-85538.jpg");
	private DungeonConquestLauncher frame;
	public Parametre(DungeonConquestLauncher frame){
		super("Option du Jeu", "Valider", "Annuler", icon);
		this.frame = frame;
		initCentre();
	}
	protected JPanel centre() {
		//creation du panel principal correspondant a la partie gauche
		JPanel panPrinc = new JPanel();
		panPrinc.setLayout(new GridLayout(1, 2));
		panPrinc.add(panelOuest());
		panPrinc.add(panelEst());
		return panPrinc;
	}
	private JPanel panelOuest() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.setLayout(new BorderLayout());
		
		JPanel label = new JPanel();
		label.setLayout(new GridLayout(8, 1));
		panel.add(label, BorderLayout.WEST);
		
		JPanel boutons = new JPanel();
		boutons.setLayout(new GridLayout(8, 1));
		panel.add(boutons, BorderLayout.EAST);
		
		//remplissage des panels
		creerLabel(label, "  Attaque  ");
		creerBouton(boutons, "Mouse 1");
		
		return panel;
	}
	
	private JPanel panVide() {
		JPanel pan = new JPanel();
		pan.setOpaque(false);
		return pan;
	}
	private void creerLabel(JPanel panel, String label) {
		panel.add(new JLabel(label));
		panel.add(panVide());
	}
	
	
	private void creerBouton(JPanel panel, String touche) {
		panel.add(creerBouton(touche));
		panel.add(panVide());
	}
	/**
	 * fonction de creation des boutons
	 * @param text
	 * @return
	 */
	private JButton creerBouton(String text) {
		JButton bouton = new JButton(text);
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("tu peut modifier les touches");
			}
		});
		return bouton;
	}
	private JPanel panelEst() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(panToucheMouvement(), BorderLayout.SOUTH);
		return panel;
	}
	private JPanel panToucheMouvement() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.setLayout(new GridLayout(1, 2));
		
		//creation des labels
		JPanel panLab = new JPanel();
		panLab.setLayout(new GridLayout(8, 1));
		creerLabel(panLab, "  Avancer  ");
		creerLabel(panLab, "  Reculer  ");
		creerLabel(panLab, "  Droite  ");
		creerLabel(panLab, "  Gauche  ");
		
		JPanel panBou = new JPanel();
		panBou.setLayout(new GridLayout(8, 1));
		creerBouton(panBou, "Z");
		creerBouton(panBou, "S");
		creerBouton(panBou, "D");
		creerBouton(panBou, "Q");
		
		panel.add(panLab);
		panel.add(panBou);
		return panel;
	}
	@Override
	protected void doOnAnnuler() {
		frame.changeToMenu();
	}
	@Override
	protected void doOnAccept() {
		System.out.println("on doit valider les parametre");
	}

}
