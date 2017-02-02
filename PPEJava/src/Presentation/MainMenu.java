package Presentation;

import java.util.Scanner;

import inscriptions.Inscriptions;
import utilitaires.ligneDeCommande.Menu;

public class MainMenu {	
	
	
	static Inscriptions inscriptions;
	
	public static Menu getMenuUsers()
	{
		return MenuUser.getMenu("Personnes", inscriptions);
	}
	
	public static Menu getMenuTeams()
	{
		return MenuTeam.getMenu("Equipes");
	}
	
	public static Menu getMenuCompetitions()
	{
		return MenuCompetition.getMenu("Competitions");
	}
	
	public static Menu getMainMenu()
	{
		Menu menu = new Menu("Menu Principal");
		menu.ajoute(getMenuUsers());
		menu.ajoute(getMenuTeams());
		menu.ajoute(getMenuCompetitions());
		menu.ajouteQuitter("q");
		return menu;
	}
	
	public MainMenu(Inscriptions inscriptions) {
		MainMenu.inscriptions = inscriptions;
		Menu menu = getMainMenu();
		menu.start();
	}
}