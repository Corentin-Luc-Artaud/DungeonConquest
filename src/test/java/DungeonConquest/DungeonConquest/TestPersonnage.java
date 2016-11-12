package DungeonConquest.DungeonConquest;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import DungeonConquest.entites.Bague;
import DungeonConquest.entites.Personnage;
import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class TestPersonnage extends TestCase {
	public void testBonusForce() {
		Personnage personnage = new Personnage (12, 14);
		assertEquals(1, personnage.bonusForce());
	}
	
	public void testBonusConstitution() {
		Personnage personnage = new Personnage (12, 14);
		assertEquals(2, personnage.bonusConstitution());
	}
	
	public void testPointsAttaque() {
		Personnage personnage = new Personnage (12, 14);
		assertEquals(400, personnage.pointsAttaque());
	}
	
	public void testPointsDefence() {
		Personnage personnage = new Personnage (12, 14);
		assertEquals(500, personnage.pointsDefence());
	}
	
	public void testCalculPointsDeVie() {
		Personnage personnage = new Personnage (12, 14);
		assertEquals(700, personnage.getPointsDeVie());
	}
	
	public void testAjouterBonus() {
		Personnage personnage = new Personnage (12, 14);
		List<Integer> bonus = new ArrayList<Integer>();
		for (byte i = 0; i < 4; ++i) {
			bonus.add(i, 0);
		}
		bonus.set(0, 50);
		bonus.set(2, 100);
		Bague bague = new Bague ("b001", 1, new Materiaux("Or", 4), new Rarete ("Rare", 2), bonus);
		personnage.equiperBague(bague);
		assertEquals(bonus, personnage.getBonusActifs());
	}
	
	public void testSupprimerBonus() {
		Personnage personnage = new Personnage (12, 14);
		List<Integer> bonus = new ArrayList<Integer>();
		for (byte i = 0; i < 4; ++i) {
			bonus.add(i, 0);
		}
		bonus.set(0, 50);
		bonus.set(2, 100);
		Bague bague = new Bague ("b001", 1, new Materiaux("Or", 4), new Rarete ("Rare", 2), bonus);
		personnage.equiperBague(bague);
		personnage.equiperBague(null);
		bonus.set(0, 0);
		bonus.set(2, 0);
		assertEquals(bonus, personnage.getBonusActifs());
	}
}
