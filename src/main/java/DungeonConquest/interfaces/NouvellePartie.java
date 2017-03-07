package DungeonConquest.interfaces;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * @author Yacine et Nathan
 */

@SuppressWarnings("serial")
public class NouvellePartie extends Menu{ 
	private static ImageIcon icon = new ImageIcon("");
	private DungeonConquestLauncher frame;
	private JTextField fieldNom = new JTextField(20);
	private static int force = 3;
	private static int dext  = 3;
	private static int cons  = 3;
	private static int intel = 3;
	//private static int sag   = 18;
	//private static int cha   = 18;

	public NouvellePartie(DungeonConquestLauncher frame) {
		super("Nouveau Personnage", "Jouer", "Retour", icon);
		this.frame = frame;
		initCentre();
	}
	@Override
	protected JPanel centre() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(panelCentreNordEst());
		panel.add(panelCentreNordOuset());
		panel.add(panelCentreSudOuest());
		panel.add(panelCentreSudEst());
		return panel;
	}
	
	private JPanel panelVide() {
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		return panel;
	}

	private JPanel panelCentreNordEst() {
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 1));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		final JRadioButton[] boutSexe = {new JRadioButton("Homme"), new JRadioButton("Femme")};
		for (JRadioButton bout : boutSexe){
		bout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand()=="Homme"){
					boutSexe[1].setSelected(false);
					boutSexe[0].setSelected(true);
				} else {
					boutSexe[1].setSelected(true);
					boutSexe[0].setSelected(false);
				}
				
			}
		});
		}
		JPanel panSexe = new JPanel();
		
		JLabel labSexe = new JLabel("Sexe : ");
		labSexe.setOpaque(true);
		panSexe.add(labSexe);
		panSexe.add(boutSexe[0]);
		panSexe.add(boutSexe[1]);
		
		panel2.add(panSexe);
		panel2.setOpaque(false);
		panel.add(panel2);
		return panel;
	}
	
	private JPanel panelCentreNordOuset() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 3));
		panel.add(panelVide());
		
		panel.add(new PanelFond(new ImageIcon("/home/nalfein/Bureau/wallhaven-257537.jpg")));
		panel.add(panelVide());
		panel.add(panelVide());
		panel.add(panelVide());
		panel.add(panelVide());
		return panel;
	}

	private JPanel panelCentreSudOuest() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(panelCentreSudOuestNord());
		panel.add(panelCentreSudOuestSud(panel));
		return panel;
	}
	
	private JPanel panelCentreSudOuestNord () {
		JPanel panel = new JPanel();
		JLabel[] caract = {new JLabel("FOR"), new JLabel("DEX"), new JLabel("CON"), new JLabel("INT"),/* new JLabel("SAG"), new JLabel("CHA")*/};
		JLabel[] valueCaract = {new JLabel("   " + String.valueOf(force)),
								new JLabel("   " + String.valueOf(dext)),
								new JLabel("   " + String.valueOf(cons)),
								new JLabel("   " + String.valueOf(intel)),
								//new JLabel("   " + String.valueOf(sag)),
								//new JLabel("   " + String.valueOf(cha))
								};
		panel.setLayout(new GridLayout(valueCaract.length, 3));
		
		for (int i = 0; i < valueCaract.length; i++) {
			panel.add(panelVide());
			panel.add(caract[i]);
			panel.add(valueCaract[i]);
		}
		return panel;
	}
	
	public JPanel panelCentreSudOuestSud (JPanel panelAffichage) {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton[] tirerStats = {creerBouton("Tirer", panelAffichage), new JButton("Stocker"), new JButton("Rappeler")};
		
		tirerStats[0].setPreferredSize(tirerStats[2].getPreferredSize());
		tirerStats[1].setPreferredSize(tirerStats[2].getPreferredSize());
		
		panel.add(tirerStats[0]);
		panel.add(tirerStats[1]);
		panel.add(tirerStats[2]);
		return panel;
	}

	private JButton creerBouton(String text, final JPanel panel) {
		JButton bouton = new JButton(text);
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand()=="Tirer"){
					force = trirageStats();
					dext = trirageStats();
					cons = trirageStats();
					intel = trirageStats();
					//cha = trirageStats();
					panel.removeAll();
					panel.add(panelCentreSudOuestNord());
					panel.add(panelCentreSudOuestSud(panel));
					panel.revalidate();
				}
				
			}

			private int trirageStats() {
				Random random = new Random();
				int stat, min, temp;
				 temp = 1 + random.nextInt() % 5;
				 if (temp < 0) temp += 6;
				 min = stat = temp;
				for (int i = 0; i < 3 ; ++i){
					temp = 1 + random.nextInt() % 5;
					if (temp < 0) temp += 6;
					if (temp < min) min = temp;
					stat += temp;
				}
				stat -= min;
				return stat;
			}
		});
		return bouton;
	}

	private Component panelCentreSudEst() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.setLayout(new BorderLayout());
		panel.add(panelCentreSudEstNom(), BorderLayout.NORTH);
		panel.add(panelCentreSudEstDescription(), BorderLayout.CENTER);
		return panel;
	}

	private JPanel panelCentreSudEstNom() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(new JLabel("Nom : "));
		panel.add(fieldNom);
		return panel;
	}
	
	private JPanel panelCentreSudEstDescription() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JLabel("Description : "), BorderLayout.NORTH);
		panel.add(new JTextArea(), BorderLayout.CENTER);
		return panel;
	}

	@Override
	protected void doOnAnnuler() {
		frame.changeToMenu();
	}

	@Override
	protected void doOnAccept() {
		System.out.println("je suis la");
		frame.changeToEnJeu();
		//Constructeur en Attente donc inutile a l'heure actuel
		//new Personnage("PJ001", fieldNom.getText(), new Coordonnee(), 1, force, dext, cons, intel, 0);
	}

	

}
