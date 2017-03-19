package test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import inscriptions.*;
public class CompetitionTest {

	

	@Test
	public void testGetNom() {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("Tournoi de billes",LocalDate.now().plusDays(10), true, false);
		assertEquals("Tournoi de billes", c.getNom());
	}

	@Test
	public void testSetNom() {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("bouloux",LocalDate.now().plusDays(10), true, false);
		c.setNom("tournoi du tournoi");
		assertEquals("tournoi du tournoi", c.getNom());
	}

	@Test
	public void testInscriptionsOuvertes() {
		
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("tourno",LocalDate.now().plusDays(10), true, false);
		assertEquals(true,c.inscriptionsOuvertes());
	}

	@Test
	public void testGetDateCloture() {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("tournoi de bang",LocalDate.now().plusDays(10), true, false);
		assertEquals(LocalDate.now().plusDays(10),c.getDateCloture());
	}

	@Test
	public void testEstEnEquipe() {
		
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("tournoi de bong",LocalDate.now().plusDays(10), true, false);
		assertEquals(true,c.estEnEquipe());
		
	}

	@Test
	public void testSetDateCloture() throws DateInvalide {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("tournoi de foule",LocalDate.now(), true, false);
		c.setDateCloture(LocalDate.now().plusDays(10));
		assertEquals(LocalDate.now().plusDays(10),c.getDateCloture());
	}
	

	@Test
	public void testGetCandidats() throws DateInvalide {
				Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("tournoi de foule",LocalDate.now().plusDays(10), false, false);
		Personne a = i.createPersonne("ha", "oh", "eh",true);
		Personne b = i.createPersonne("ha", "oh", "eh",true);
		c.add(a);
		c.add(b);
		assertTrue(c.getCandidats().contains(a));
		assertTrue(c.getCandidats().contains(b));
		}

	@Test
	public void testAddPersonne() throws DateInvalide {
		
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("test",LocalDate.now().plusDays(10), false, false);
		Personne p = i.createPersonne("test", "prenom", "mail",true);
		c.add(p);
		assertTrue(c.getCandidats().contains(p));
	}

	@Test
	public void testAddEquipe() throws DateInvalide {
		
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("test",LocalDate.now().plusDays(10),true, false);
		
		Personne p = i.createPersonne("test", "prenom", "mail",true);
		Personne pp = i.createPersonne("test", "prenom", "mail",true);
		Personne ppp = i.createPersonne("test", "prenom", "mail",true);
		Equipe e = i.createEquipe("testTeam",true);
		Equipe e2 = i.createEquipe("testTeam",true);

		e.add(p,true);
		e.add(pp,true);
		e2.add(ppp,true);
		
		c.add(e);
		c.add(e2);
		int sizeBefore = i.getCandidats().size();
		Equipe eee = i.createEquipe("trouuuu",true);
		Personne Personne = i.createPersonne("test", "test", "mail",true);
		eee.add(Personne,true);
		c.add(eee);
		assertTrue(i.getCandidats().contains(eee));
		int sizeAfter = i.getCandidats().size();
		assertEquals(sizeBefore+1,sizeAfter);

	}

	@Test
	public void testRemove() throws DateInvalide {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("test", LocalDate.now().plusDays(10),false,false);
		Personne P = i.createPersonne("nom", "prenom", "mail",true);
		Personne P2 = i.createPersonne("nom", "prenom", "mail",true);
		c.add(P);
		c.add(P2);
		int sizeBefore = c.getCandidats().size();
		c.remove(P);
		int sizeAfter = c.getCandidats().size();
		assertEquals(sizeBefore-1,sizeAfter);
	}

	@Test
	public void testDelete() {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("Compet", LocalDate.now().plusDays(10), false,false);
		int size = i.getCompetitions().size();
		c.delete();
		assertEquals(size-1,i.getCompetitions().size());
	}

	@Test
	public void testCompareTo() {
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("Compet", LocalDate.now().plusDays(10), false, false);
		Competition compet2 = i.createCompetition("Compet", LocalDate.now().plusDays(10), false, false);

		assertEquals(0,c.compareTo(compet2));
	}

	@Test
	public void testToString() {
		
		Inscriptions i = Inscriptions.getInscriptions();
		Competition c = i.createCompetition("compet", LocalDate.now().plusDays(10), false, false);
		assertNotNull(c.toString());
	}}