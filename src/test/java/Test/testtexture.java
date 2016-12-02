package Test;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Test.PanelFond;

public class testtexture extends JFrame {
    static final int taille = 32*32;
	public static void main( String[] args )
    {
		//fenêtre du jeu
        JFrame frame = new JFrame("Dungeon Conquest");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //grille de jeu
        JPanel panneautuille = new JPanel();
        panneautuille.setLayout(new GridLayout(taille/32,taille/32));
      
        
        //fenêtre 
        JPanel interfacejeu = new JPanel(new BorderLayout());
        JPanel panneauhub = new JPanel(new GridLayout(1,3));
        for( int  i = 0; i<3 ; ++i)
        {
        	JButton bouton = new JButton("salut");
        	bouton.setSize(new Dimension(40,25));
        	panneauhub.add(bouton);
        }
        JPanel panneaudroite = new JPanel(new GridLayout(3,1));
        for( int  i = 0; i<3 ; ++i)
        {
        	JButton bouton = new JButton("salut");
        	bouton.setSize(new Dimension(40,80));
        	panneaudroite.add(bouton);
        }
        
        
        
        // vecteur des images
        ImageIcon sol = new ImageIcon("C:/Users/Nathan/Desktop/workspace/DungeonConquest/assets/Tuille/Donjon/pavé1.png");
        ImageIcon mur = new ImageIcon("C:/Users/Nathan/Desktop/workspace/DungeonConquest/assets/Tuille/Donjon/mur1.png");
        ArrayList<ImageIcon> vecteurimage = new ArrayList<ImageIcon>();
        vecteurimage.add(0,sol);
        vecteurimage.add(1,mur);
        
        
        //matrice de correspondance
        ArrayList<Integer> matrice = new ArrayList<Integer>();
        for(int i = 0 ; i< taille; i=i+1)
        {
        	if(i<32 || i%32==0 || (i+1)%32==0 || i>32*32-32)
        		matrice.add(i, 1);
        	else
        		matrice.add(i, 0);
        }
        
        
        //insertation des images dans le grid layout en fonction de la matrice de correspondance des images et celle du plateau
        for(int i = 0 ; i<taille; i++)
        {
        	if(matrice.get(i)==1)
        	{
        		PanelFond tmur = new PanelFond(vecteurimage.get(1));
        		tmur.resizeFond(32,32);
        		panneautuille.add(tmur);
        	}
        	else if(matrice.get(i)==0)
        	{
        		PanelFond tsol = new PanelFond(vecteurimage.get(0));
        		tsol.resizeFond(32,32);
        		panneautuille.add(tsol);        
        	}
        }   
        
        
        //les ajouts sur le fenêtre principale
        
        interfacejeu.add(panneautuille,BorderLayout.CENTER);
        interfacejeu.add(panneauhub, BorderLayout.NORTH);
        interfacejeu.add(panneaudroite, BorderLayout.EAST);

        frame.add(interfacejeu);
        frame.setVisible(true);
        frame.pack();
    }
}
