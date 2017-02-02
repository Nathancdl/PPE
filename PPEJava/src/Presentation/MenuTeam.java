package Presentation;

import inscriptions.Inscriptions;
import utilitaires.ligneDeCommande.Menu;

public class MenuTeam {

	public static Menu getMenu(String name)
	{
		return new Menu(name,"Equipes","e");
		
	}
}