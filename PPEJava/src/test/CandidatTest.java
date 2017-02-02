package test;

import static org.junit.Assert.*;
import java.util.Set;

import org.junit.Test;

import inscriptions.*;
public class CandidatTest {
	
	
	Inscriptions i = Inscriptions.getInscriptions();
	Personne c = i.createPersonne ("nomtest", "prenomtest", "testemail");
	Set<Candidat>c1 = i.getCandidats();

	@Test
	public void testCandidat() {
		
	}

	@Test
	public void testGetNom() {
		assertEquals("nomtest", c.getNom());
	}

	@Test
	public void testSetNom() {
		c.setNom("test1");
		assertEquals("test1", c.getNom());
	}

	@Test
	public void testGetCompetitions() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		Personne cc = i.createPersonne ("nomtest", "prenomtest", "testemail");
		
		Set<Candidat>c2 = i.getCandidats();
		c.add(c2);
		cc.delete();
		assertFalse(c2.contains(i));
	}


}
