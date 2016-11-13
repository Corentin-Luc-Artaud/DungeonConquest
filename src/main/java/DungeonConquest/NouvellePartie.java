package DungeonConquest;
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
 * @author nalfein et Nathan
 */

@SuppressWarnings("serial")
public class NouvellePartie extends PanelFond{ 
	private static ImageIcon icon = new ImageIcon("");
	private DungeonConquestLauncher frame;
	private static int force = 18;
	//private static int dext  = 18;
	private static int cons  = 18;
	//private static int intel = 18;
	//private static int sag   = 18;
	//private static int cha   = 18;
	@SuppressWarnings("unused")
	private static int ptsStats = 0;

	public NouvellePartie(DungeonConquestLauncher frame) {
		super(icon);
		this.frame = frame;
		setLayout(new BorderLayout());
		add(panelNord(), BorderLayout.NORTH);
		add(panelCentre(), BorderLayout.CENTER);
		add(panelSud(), BorderLayout.SOUTH);
	}
	
	private JPanel panelNord() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Nouveau Personnage"));
		return panel;
	}
	
	
	
	private JPanel panelCentre() {
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
		panel2.setLayout(new GridLayout(3, 2));
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel2.add(new JLabel("Sexe : "));
		panel2.add(new JRadioButton("Homme"));
		panel2.add(new JLabel("Race : "));
		panel2.add(new JLabel("Humain"));
		panel2.add(new JLabel("Classe : "));
		panel2.add(new JLabel("Guerrier"));
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
		JLabel[] caract = {new JLabel("FOR"), /*new JLabel("DEX"),*/ new JLabel("CON"),/* new JLabel("INT"), new JLabel("SAG"), new JLabel("CHA")*/};
		JLabel[] valueCaract = {new JLabel("   " + String.valueOf(force)),
								//new JLabel("   " + String.valueOf(dext)),
								new JLabel("   " + String.valueOf(cons)),
								//new JLabel("   " + String.valueOf(intel)),
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
					cons = trirageStats();
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
	
	

	private JButton creerBouton(String text) {
		JButton bouton = new JButton(text);
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand()=="Retour"){
					frame.changeToMenu();
				}
				
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
		panel.add(new JTextField(20));
		return panel;
	}
	
	private JPanel panelCentreSudEstDescription() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JLabel("Description : "), BorderLayout.NORTH);
		panel.add(new JTextArea(), BorderLayout.CENTER);
		return panel;
	}

	private JPanel panelSud() {
		JPanel panel = new JPanel();
		panel.add(creerBouton("Jouer"));
		panel.add(creerBouton("Retour"));
		return panel;
	}

}
