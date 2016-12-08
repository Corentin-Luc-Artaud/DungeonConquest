package DungeonConquest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Menu extends PanelFond {

	private static final long serialVersionUID = 72960348400323678L;
	JButton accpet, annuler;
	JLabel titre;
	
	public Menu(String nom, String accepter, String annuler, ImageIcon imgIco) {
		super(imgIco);
		titre = new JLabel(nom);
		accpet = new JButton(accepter);
		this.annuler = new JButton(annuler);
		setLayout(new BorderLayout());
		add(sud(), BorderLayout.NORTH);
		add(nord(), BorderLayout.SOUTH);
	}

	private JPanel nord() {
		JPanel panel = new JPanel();
		initBouton(accpet);
		initBouton(annuler);
		panel.add(accpet);
		panel.add(annuler);
		panel.setOpaque(false);
		return panel;
	}

	private void initBouton(JButton bouton) {
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals(accpet)) doOnAccept();
				else doOnAnnuler();
				
			}
		});		
	}

	protected void initCentre() {
		add(centre(), BorderLayout.CENTER);
	}
	
	protected abstract JPanel centre();
	
	protected abstract void doOnAnnuler();

	protected abstract void doOnAccept();

	private JPanel sud() {
		JPanel panel = new JPanel();
		panel.add(titre);
		panel.setOpaque(false);
		return panel;
	}

}
