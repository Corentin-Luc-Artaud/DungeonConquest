package DungeonConquest;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class DungeonConquestLauncher extends JFrame{
	private PanelFond menuP = new MenuPrincipal(this);
	private PanelFond option = new Parametre(this);
	private PanelFond nouv = new NouvellePartie(this);
	private EnJeu enJeu = new EnJeu();
	
	public DungeonConquestLauncher(){
		
			super("Dungeon Conquest");
			setMinimumSize(new Dimension(800, 600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(menuP);
			addComponentListener(new ComponentAdapter() {
	        	public void componentResized(ComponentEvent e){
	        		menuP.resizeFond(getWidth(), getHeight());
	        		option.resizeFond(getWidth(), getHeight());
	        		nouv.resizeFond(getWidth(), getHeight());
	        	}
			});
			pack();
			setVisible(true);
		}
		
		public void changeToMenu(){
			setContentPane(menuP);
			validate();
		}
		
		public void changeToNouvPartie(){
			setContentPane(nouv);
			validate();
		}
		
		public void changeToOption(){
			setContentPane(option);
			validate();
		}

		public void changeToEnJeu() {
			enJeu.refresh(getHeight()-32, getWidth());
			setContentPane(enJeu);
			validate();
		}
}