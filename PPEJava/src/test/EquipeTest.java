package test;

import static org.junit.Assert.*;

import org.junit.Test;

import inscriptions.Inscriptions;
import inscriptions.Personne;

public class EquipeTest {
	Inscriptions i = Inscriptions.getInscriptions();
	Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",true);
	
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquipe() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMembres() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPersonne() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemovePersonne() {
		fail("Not yet implemented");
	}

	@Test
	public void testCandidat() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNom() {
		assertEquals("prenomtest", p.getPrenom());
	}

	@Test
	public void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCompetitions() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCompetition() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCompetition() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}
