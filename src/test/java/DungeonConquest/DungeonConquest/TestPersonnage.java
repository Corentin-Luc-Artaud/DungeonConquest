package DungeonConquest.DungeonConquest;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import DungeonConquest.entites.dynamiques.Personnage;
import DungeonConquest.entites.statiques.objet.equipement.Bague;
import DungeonConquest.entites.statiques.objet.equipement.Bottes;
import DungeonConquest.entites.statiques.objet.equipement.Casque;
import DungeonConquest.entites.statiques.objet.equipement.Gants;
import DungeonConquest.entites.statiques.objet.equipement.Plastron;
import DungeonConquest.entites.utilitaire.ConstantesEntite;
import DungeonConquest.entites.utilitaire.Coordonnee;
import DungeonConquest.entites.utilitaire.Materiaux;
import DungeonConquest.entites.utilitaire.Rarete;

public class TestPersonnage extends TestCase {
	
	public void testBonusForce() {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		assertEquals(1, personnage.bonusForce());
	}
	
	public void testBonusConstitution() {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		assertEquals(2, personnage.bonusConstitution());
	}
	
	public void testPointsAttaque() {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		assertEquals(400, personnage.pointsAttaque());
	}
	
	public void testPointsDefence() {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		assertEquals(500, personnage.pointsDefence());
	}
	
	public void testCalculPointsDeVie() {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		assertEquals(700, personnage.getPointsDeVie());
	}
	
	public void testAjouterSupprimerBague() {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		List<Integer> bonus = new ArrayList<Integer>();
		for (byte i = 0; i < 4; ++i) {
			bonus.add(i, 0);
		}
		
		assertEquals(400, personnage.pointsAttaque());
		assertEquals(500, personnage.pointsDefence());
		assertEquals(700, personnage.pointsDeVieMax());
		assertEquals(12, personnage.getForce());
		assertEquals(14, personnage.getConstitution());
		
		bonus.set(ConstantesEntite.INDICE_BONUS_ATTAQUE, 200);
		bonus.set(ConstantesEntite.INDICE_BONUS_DEFENCE, 200);
		bonus.set(ConstantesEntite.INDICE_BONUS_FORCE, 4);
		bonus.set(ConstantesEntite.INDICE_BONUS_CONSTITUTION, 2);
		
		Bague bague = new Bague ("b1", "Bague", 1, new Materiaux("OR", 4), new Rarete ("RARE", 2), bonus);
		personnage.equiperBague(bague);
		
		assertEquals(bonus, personnage.getBonusActifs());
		assertEquals(800, personnage.pointsAttaque());
		assertEquals(800, personnage.pointsDefence());
		assertEquals(800, personnage.pointsDeVieMax());
		assertEquals(16, personnage.getForce());
		assertEquals(16, personnage.getConstitution());
		
		personnage.equiperBague(null);
		
		bonus.set(ConstantesEntite.INDICE_BONUS_ATTAQUE, 0);
		bonus.set(ConstantesEntite.INDICE_BONUS_DEFENCE, 0);
		bonus.set(ConstantesEntite.INDICE_BONUS_FORCE, 0);
		bonus.set(ConstantesEntite.INDICE_BONUS_CONSTITUTION, 0);
		
		assertEquals(bonus, personnage.getBonusActifs());
		assertEquals(400, personnage.pointsAttaque());
		assertEquals(500, personnage.pointsDefence());
		assertEquals(700, personnage.pointsDeVieMax());
		assertEquals(12, personnage.getForce());
		assertEquals(14, personnage.getConstitution());
	}
	
	public void TestAjouterSupprimerArmure () {
		Personnage personnage = new Personnage ("001", "Bidule", new Coordonnee(0,0), 1, 12, 14);
		Casque casque = new Casque ("a1", "Casque", 1, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 20);
		Plastron plastron = new Plastron ("a1", "Plastron", 2, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 50);
		Bottes bottes = new Bottes ("a1", "Bottes", 1, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 15);
		Gants gants = new Gants ("a1", "Gants", 1, new Materiaux("DIAMANT", 5), new Rarete("DIVIN", 5), 1000, 15);
		
		assertEquals(500, personnage.pointsDefence());
		
		personnage.equiperCasque(casque);
		personnage.equiperPlastron(plastron);
		personnage.equiperBottes(bottes);
		personnage.equiperGants(gants);
		
		assertEquals(1500, personnage.pointsDefence());
		
		personnage.equiperCasque(null);
		personnage.equiperPlastron(null);
		personnage.equiperBottes(null);
		personnage.equiperGants(null);
		
		assertEquals(500, personnage.pointsDefence());
	}
}
