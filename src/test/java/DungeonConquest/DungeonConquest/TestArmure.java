package DungeonConquest.DungeonConquest;

import javax.swing.ImageIcon;

import DungeonConquest.entites.statiques.objet.equipement.Bottes;
import DungeonConquest.entites.statiques.objet.equipement.Casque;
import DungeonConquest.entites.statiques.objet.equipement.Gants;
import DungeonConquest.entites.statiques.objet.equipement.Plastron;
import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;
import junit.framework.TestCase;

public class TestArmure extends TestCase {
	
	public void testDefenceCasque () {
		Casque casque = new Casque ("a1", new ImageIcon(), "Casque", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 20);
		assertEquals(200, casque.defence());
	}
	
	public void testDefencePlastron () {
		Plastron plastron = new Plastron ("a1", new ImageIcon(), "Plastron", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 50);
		assertEquals(500, plastron.defence());
	}
	
	public void testDefenceBottes () {
		Bottes bottes = new Bottes ("a1", new ImageIcon(), "Bottes", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 15);
		assertEquals(150, bottes.defence());
	}
	
	public void testDefenceGants () {
		Gants gants = new Gants ("a1", new ImageIcon(), "Gants", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 15);
		assertEquals(150, gants.defence());
	}
}
