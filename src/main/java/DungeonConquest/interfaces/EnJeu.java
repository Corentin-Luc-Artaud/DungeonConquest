package DungeonConquest.interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EnJeu extends JPanel {
	private JPanel map;
	public EnJeu(){
		super();
		setLayout(new BorderLayout());
		map = new JPanel();
		refresh(568, 800);
		add(map, BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.add(new JButton("test"));
		add(panel, BorderLayout.SOUTH);
	}
	
	public void refresh(int hauteur, int largeur){
		map.removeAll();
		int nbLine = hauteur/32;
		int blackLine = nbLine -10;
		int nbColone = largeur/32;
		int blackColone = nbColone - 16;
		map.setLayout(new GridLayout(nbLine+1, nbColone));
		for (int i=0; i<=nbLine; ++i){
			for (int j=0; j<=nbColone; ++j){
				if((i<blackLine/2) || (i>(blackLine/2)+10))map.add(creerBouton(new ImageIcon("./assets/Tuille/Donjon/CaseNoire.png")));
				else if((j<blackColone/2) || (j>(blackColone/2)+16))map.add(creerBouton(new ImageIcon("./assets/Tuille/Donjon/CaseNoire.png")));
				else map.add(creerBouton(new ImageIcon("CaseRouge.png")));
			}
		}
	}
	
	private Component creerBouton(ImageIcon icon) {
		JButton button = new JButton(icon);
		button.setPreferredSize(
				new Dimension(icon.getIconHeight(), icon.getIconWidth()));
		button.setEnabled(false);
		button.setDisabledIcon(icon);
		return button;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		frame.setContentPane(new EnJeu());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
