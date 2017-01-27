package test;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import inscriptions.*;

public class PersonneTest {
	
	Inscriptions i = Inscriptions.getInscriptions();
	Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail");
	

	@Test
	public void testDelete() {
		Equipe e = i.createEquipe("equipe test");
		e.add(p);
		Set<Equipe> setEquipesTest = p.getEquipes();
		p.delete();
		assertFalse(setEquipesTest.contains(p));
	}

	@Test
	public void testGetPrenom() {
		assertEquals("prenomtest", p.getPrenom());
	}

	@Test
	public void testSetPrenom() {
		p.setPrenom("test1");
		assertEquals("test1", p.getPrenom());
	}

	@Test
	public void testGetMail() {
		assertEquals("ttestemail", p.getMail());
	}

	@Test
	public void testSetMail() {
		p.setMail("testemail");
		assertEquals("testemail", p.getMail());
	}

	@Test
	public void testGetEquipes() {
		Equipe e = i.createEquipe("equipe test");
		e.add(p);
		Set<Equipe> setEquipesTest = p.getEquipes();
		assertTrue(setEquipesTest.contains(e));
	}

}
