package Presentation;

import inscriptions.Inscriptions;
import utilitaires.ligneDeCommande.Menu;

public class MenuCompetition {

	public static Menu getMenu(String name, Inscriptions inscriptions)
	{
		return new Menu(name,"Competitions","c");
		
	}
}