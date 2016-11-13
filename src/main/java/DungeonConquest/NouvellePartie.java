package DungeonConquest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * @author nalfein et Nathan
 */
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class NouvellePartie extends JPanel{

	private DungeonConquest frame;

	public NouvellePartie(DungeonConquest frame) {
		super();
		this.frame = frame;
		setLayout(new BorderLayout());
		add(panelNord(), BorderLayout.NORTH);
		add(panelCentre(), BorderLayout.CENTER);
		add(panelSud(), BorderLayout.SOUTH);
	}

	private JPanel panelCentre() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(panelHautGauche());
		
		
		panel.add(new JLabel("test"));
		
		
		JPanel panelCom = new JPanel();
		panelCom.setLayout(new GridLayout(2, 1));
		panelCom.add(panelOuestSud());
		panelCom.add(panelSudOuest());
		panel.add(panelCom);
		
		
		return panel;
	}

	private JPanel panelHautGauche() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 2));
		panel2.setBorder(BorderFactory.createEmptyBorder());
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

	private JPanel panelNord() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Nouveau Personnage"));
		return panel;
	}

	private JPanel panelSud() {
		JPanel panel = new JPanel();
		panel.add(creerBouton("Jouer"));
		panel.add(creerBouton("Retour"));
		return panel;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	private int force = 18;
	private int dext  = 18;
	private int cons  = 18;
	private int intel = 18;
	private int sag   = 18;
	private int cha   = 18;
	//private int ptsStats = 10;
	
	private JPanel panelOuestSud () {
		JPanel panel = new JPanel();
		JLabel[] caract = {new JLabel("FOR"), new JLabel("DEX"), new JLabel("CON"), new JLabel("INT"), new JLabel("SAG"), new JLabel("CHA")};
		JLabel[] valueCaract = {new JLabel("   " + String.valueOf(force)),
								new JLabel("   " + String.valueOf(dext)),
								new JLabel("   " + String.valueOf(cons)),
								new JLabel("   " + String.valueOf(intel)),
								new JLabel("   " + String.valueOf(sag)),
								new JLabel("   " + String.valueOf(cha))};
		JButton[] plus = new JButton[6];
		JButton[] moins = new JButton[6];
		
		panel.setLayout(new GridLayout(6, 4));
		
		for (int i = 0; i < 6; i++) {
			plus[i] = new JButton("+");
			moins[i] = new JButton("-");
			panel.add(caract[i]);
			panel.add(valueCaract[i]);
			panel.add(plus[i]);
			panel.add(moins[i]);
		}
		return panel;
	}
	
	public JPanel panelSudOuest () {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton[] tirerStats = {new JButton("Tirer"), new JButton("Stocker"), new JButton("Rappeler")};
		
		tirerStats[0].setPreferredSize(tirerStats[2].getPreferredSize());
		tirerStats[1].setPreferredSize(tirerStats[2].getPreferredSize());
		
		panel.add(tirerStats[0]);
		panel.add(tirerStats[1]);
		panel.add(tirerStats[2]);
		return panel;
	}

}
