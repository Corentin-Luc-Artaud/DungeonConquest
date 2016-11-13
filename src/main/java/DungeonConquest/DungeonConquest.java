package DungeonConquest;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DungeonConquest extends JFrame{
	private MenuPrincipal menuP = new MenuPrincipal(this);
	private Parametre option = new Parametre(this);
	private NouvellePartie nouv = new NouvellePartie(this);
	private static JPanel panel;
	
	public DungeonConquest(){
		
			super("Dungeon Conquest");
			setMinimumSize(new Dimension(800, 600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel = nouv;
			add(panel);
			addComponentListener(new ComponentAdapter() {
	        	public void componentResized(ComponentEvent e){
	        		menuP.resizeMenu(getWidth(), getHeight());
	        	}
			});
			pack();
			setVisible(true);
		}
		
		public void changeToMenu(){
			panel.removeAll();
			panel = menuP;
			panel.revalidate();
		}
		
		public void changeToNouvPartie(){
			panel.removeAll();
			panel = nouv;
			panel.revalidate();
		}
		
		public void changeToOption(){
			panel.removeAll();
			panel = option;
			panel.revalidate();
		}
}