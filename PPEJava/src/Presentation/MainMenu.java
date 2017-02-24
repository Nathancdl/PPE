package Presentation;

import inscriptions.*;
import commandLine.*;

public class MainMenu {	
	
	
	static Inscriptions inscriptions;
	
	public static Menu getMenuUsers()
	{
		return MenuUser.getMenu("Personnes", inscriptions);
	}
	
	public static Menu getMenuTeams()
	{
		return MenuTeam.getMenu("Equipes", inscriptions);
	}
	
	public static Menu getMenuCompetitions()
	{
		return MenuCompetition.getMenu("Competitions", inscriptions);
	}
	
	public static Menu getMainMenu()
	{
		Menu menu = new Menu("Menu Principal");
		menu.ajoute(getMenuUsers());
		menu.ajoute(getMenuTeams());
		menu.ajoute(getMenuCompetitions());
		menu.ajouteQuitter("4");
		return menu;
	}
	
	public MainMenu(Inscriptions inscriptions) {
		MainMenu.inscriptions = inscriptions;
		Menu menu = getMainMenu();
		menu.start();
	}
}