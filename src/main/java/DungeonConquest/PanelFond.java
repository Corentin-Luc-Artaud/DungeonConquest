package DungeonConquest;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFond extends JPanel { 
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 194618664797185376L;
	
	private Image imgOri;
    private Image img;
    
    /**
     * PanelFond()
     * @param imgIco
     */
    public PanelFond (ImageIcon imgIco) {
    	super ();
    	img = imgIco.getImage();
    	imgOri = img;
    } //PanelFond()
    
    /**
     * resizeFond()
     * @param width
     * @param height
     */
    public void resizeFond (int width, int height) {
    	
    	BufferedImage buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    	Graphics2D g = buf.createGraphics();
    	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR); 
        g.drawImage(imgOri, 0, 0, width, height, null); 
        g.dispose();
        img = buf;
    } //resizeFond()

    /**
     * paintComponent()
     * Surcharge de la fonction paintComponent() pour afficher l'image
     */
    public void paintComponent(Graphics g) { 
            g.drawImage(img,0,0,null);
    }  //paintComponent()
}