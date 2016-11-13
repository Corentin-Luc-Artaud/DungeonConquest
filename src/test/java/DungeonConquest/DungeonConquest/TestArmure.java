package DungeonConquest.DungeonConquest;

import DungeonConquest.entites.statiques.Armure;
import DungeonConquest.entites.statiques.Bottes;
import DungeonConquest.entites.statiques.Casque;
import DungeonConquest.entites.statiques.Gants;
import DungeonConquest.entites.statiques.Plastron;
import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;
import junit.framework.TestCase;

public class TestArmure extends TestCase {

	public void testDefenceArmure () {
		Armure armure = new Armure ("a1", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5));
		assertEquals(50200, armure.defence());
	}
	
	public void testDefenceCasque () {
		Casque casque = new Casque ("a1", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5));
		assertEquals(10040, casque.defence());
	}
	
	public void testDefencePlastron () {
		Plastron plastron = new Plastron ("a1", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5));
		assertEquals(25100, plastron.defence());
	}
	
	public void testDefenceBottes () {
		Bottes bottes = new Bottes ("a1", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5));
		assertEquals(7530, bottes.defence());
	}
	
	public void testDefenceGants () {
		Gants gants = new Gants ("a1", 20, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5));
		assertEquals(7530, gants.defence());
	}
}
