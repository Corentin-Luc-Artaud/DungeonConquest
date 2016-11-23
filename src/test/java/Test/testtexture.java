package Test;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DungeonConquest.PanelFond;

public class testtexture extends JFrame {
	public static void main( String[] args )
    {
		//fenêtre du jeu
        JFrame frame = new JFrame("Dungeon Conquest");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //grille de jeu
        JPanel panneaudejeu = new JPanel();
        panneaudejeu.setLayout(new GridLayout(32,32));
        

        // vecteur des images
        ImageIcon sol = new ImageIcon("C:/Users/Nathan/Desktop/workspace/DungeonConquest/assets/Tuille/Donjon/pavé1.png");
        ImageIcon mur = new ImageIcon("C:/Users/Nathan/Desktop/workspace/DungeonConquest/assets/Tuille/Donjon/mur1.png");
        ArrayList<ImageIcon> vecteurimage = new ArrayList<ImageIcon>();
        vecteurimage.add(0,sol);
        vecteurimage.add(1,mur);
        
        
        //matrice de correspondance
        ArrayList<Integer> matrice = new ArrayList<Integer>();
        for(int i = 0 ; i<32*32; i=i+1)
        {
        	if(i<32 || i%32==0 || (i+1)%32==0 || i>32*32-32)
        		matrice.add(i, 1);
        	else
        		matrice.add(i, 0);
        }
        
        
        
        for(int i = 0 ; i<32*32; i++)
        {
        	if(matrice.get(i)==1)
        	{	
        		JLabel lab = new JLabel("1");
        		panneaudejeu.add(new PanelFond(vecteurimage.get(1)));
        	}
        	else if(matrice.get(i)==0)
        	{
        		JLabel lab = new JLabel("0");

    			panneaudejeu.add(new PanelFond(vecteurimage.get(0)));
        	}
        }   
        
        frame.add(panneaudejeu);
        frame.setVisible(true);
        frame.pack();
    }
}
