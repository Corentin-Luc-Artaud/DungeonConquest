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
public class MenuPrincipal extends PanelFond {
	private String NEW = "Nouvelle Partie";
	private String LOAD = "Charger Partie";
	private String OPTIONS = "Options";
	private String QUIT = "Quitter";
	private JPanel panneau = new JPanel();
	private static ImageIcon icon = new ImageIcon("/home/nalfein/Bureau/wallhaven-413497.jpg");
	
	/**
	 * @param imgIco
	 */
	public MenuPrincipal() {
		super(icon);
		panneau();
		add(panneau);
	}
	
	public void resizeMenu(){
		resizeFond(getWidth(), getHeight());
	}
	
	private void panneau(){
		panneau.setLayout(new GridLayout(7, 1));
		creerbouton(NEW);
		panneau.add(panelEspace());
		creerbouton("Charger Partie");
		panneau.add(panelEspace());
		creerbouton(OPTIONS);
		panneau.add(panelEspace());
		creerbouton(QUIT);
		panneau.setOpaque(false);
		panneau.setMinimumSize(new Dimension(300, 200));
		panneau.setBorder(BorderFactory.createEmptyBorder(150, 200, 150, 200));
	}
	
	private JPanel panelEspace(){
		JPanel jpanel = new JPanel();
		jpanel.setOpaque(false);
		return jpanel;
	}
	
	private void creerbouton(String nom){
		JButton bouton = new JButton(nom);
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand()=="Quitter"){
					System.exit(0);
				} else if (e.getActionCommand()=="Options");
				
			}
		});
		panneau.add(bouton);
	}

}