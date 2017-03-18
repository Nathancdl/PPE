package test;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import inscriptions.*;

public class PersonneTest {
	

	

	@Test
	public void testDelete() {
		Inscriptions i = Inscriptions.getInscriptions();
		Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",false);
		Equipe e = i.createEquipe("equipe test",false);
		e.add(p,false);
		Set<Equipe> setEquipesTest = p.getEquipes();
		p.delete();
		assertFalse(setEquipesTest.contains(p));
	}

	@Test
	public void testGetPrenom() {
		Inscriptions i = Inscriptions.getInscriptions();
		Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",false);
		assertEquals("prenomtest", p.getPrenom());
	}

	@Test
	public void testSetPrenom() {
		Inscriptions i = Inscriptions.getInscriptions();
		Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",false);
		p.setPrenom("test1");
		assertEquals("test1", p.getPrenom());
	}

	@Test
	public void testGetMail() {
		Inscriptions i = Inscriptions.getInscriptions();
		Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",false);
		assertEquals("testemail", p.getMail());
	}

	@Test
	public void testSetMail() {
		Inscriptions i = Inscriptions.getInscriptions();
		Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",false);
		p.setMail("mail");
		assertEquals("mail", p.getMail());
	}

	@Test
	public void testGetEquipes() {
		Inscriptions i = Inscriptions.getInscriptions();
		Personne p = i.createPersonne ("nomtest", "prenomtest", "testemail",false);
		Equipe e = i.createEquipe("equipe test",false);
		e.add(p,false);
		Set<Equipe> setEquipesTest = p.getEquipes();
		assertTrue(setEquipesTest.contains(e));
	}

}
