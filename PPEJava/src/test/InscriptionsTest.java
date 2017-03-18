package test;
import java.time.LocalDate;
import static org.junit.Assert.*;
import java.util.Set;

import org.junit.Test;

import inscriptions.*;
public class InscriptionsTest {

	Inscriptions i = Inscriptions.getInscriptions();
	Competition cEquipe = i.createCompetition("CompetEquipeTest",LocalDate.now().plusDays(10), true, true);
	Competition c = i.createCompetition("CompetSoloTest",LocalDate.now().plusDays(10), false, true);
	Equipe equipeTest = i.createEquipe("EquipeTest",true);
	Personne personneTest = i.createPersonne("TEST", "test", "tTEST@gmail.com",true);
	
	@Test
	public void testGetCompetitions() {
		Set<Competition> setCompetitionTest = i.getCompetitions();
		assertFalse(setCompetitionTest.isEmpty());
		
	}

	@Test
	public void testGetCandidats() {
		Set<Candidat> setCandidatTest = i.getCandidats();
		assertFalse(setCandidatTest.isEmpty());
	}

	@Test
	public void testCreateCompetition() {
		Competition competitionTest2 = i.createCompetition("Test",LocalDate.now().plusDays(10), false, false);
		Set <Competition> setCompetitionTest = i.getCompetitions();
		assertTrue(setCompetitionTest.contains(competitionTest2));
	}

	@Test
	public void testCreatePersonne() {
		Personne personneTest2 = i.createPersonne("", "", "",false);
		Set<Candidat>setPersonneTest2 = i.getCandidats();
		assertTrue(setPersonneTest2.contains(personneTest2));
	}

	@Test
	public void testCreateEquipe() {
		Equipe equipeTest2 = i.createEquipe("",false);
		Set<Candidat>setEquipeTest2 = i.getCandidats();
		assertTrue(setEquipeTest2.contains(equipeTest2));
	}

	@Test
	public void testRemoveCompetition() {
		Set<Competition> setCompetitionTest = i.getCompetitions();
		c.delete();
		assertFalse(setCompetitionTest.contains(c));
		
	}

	@Test
	public void testRemoveCandidat() {
		Set<Candidat>setCandidatTest = i.getCandidats();
		personneTest.delete();
		assertFalse(setCandidatTest.contains(personneTest));
	}

	@Test
	public void testGetInscriptions() {
		Inscriptions i = Inscriptions.getInscriptions();
		assertEquals(i, Inscriptions.getInscriptions());
	}

	
	/**
	 *@Test
	 *public void testSauvegarder() {
	 *	fail("Not yet implemented");
	 *}
	 *
	 */
	



}
