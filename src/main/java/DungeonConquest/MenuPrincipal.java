/**
 * 
 */
package DungeonConquest;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 * @author nalfein
 *
 */
@SuppressWarnings("serial")
public class MenuPrincipal extends PanelFond {
	private DungeonConquestLauncher frame;
	private static ImageIcon icon = new ImageIcon("/home/nalfein/Bureau/wallhaven-413497.jpg");

	/**
	 * Constructeur de la classe
	 */
	public MenuPrincipal(DungeonConquestLauncher frame) {
		super(icon);
		this.frame = frame;
		add(panneau());
	}
	
	private JPanel panneau(){
		JPanel panneau = new JPanel();
		panneau.setLayout(new GridLayout(7, 1));
		panneau.add(creerbouton("Nouvelle Partie"));
		panneau.add(panelEspace());
		panneau.add(creerbouton("Charger Partie"));
		panneau.add(panelEspace());
		panneau.add(creerbouton("Options"));
		panneau.add(panelEspace());
		panneau.add(creerbouton("Quitter"));
		panneau.setOpaque(false);
		panneau.setMinimumSize(new Dimension(300, 200));
		panneau.setBorder(BorderFactory.createEmptyBorder(150, 200, 150, 200));
		return panneau;
	}
	
	private JPanel panelEspace(){
		JPanel jpanel = new JPanel();
		jpanel.setOpaque(false);
		return jpanel;
	}
	
	private JButton creerbouton(String nom){
		JButton bouton = new JButton(nom);
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand()=="Quitter"){
					System.exit(0);
				} else if (e.getActionCommand()=="Options"){
					frame.changeToOption();
				} else if (e.getActionCommand()=="Nouvelle Partie"){
					frame.changeToNouvPartie();
				}
				
			}
		});
		return bouton;
	}

}