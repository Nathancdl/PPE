package Presentation;

import java.io.IOException;

import commandLine.*;
import inscriptions.Inscriptions;


public class MainMenu 
{
	private static Menu menuPrincipal;
	private static MenuUser menuPersonne;
	private static MenuTeam menuEquipe;
	private static MenuCompetition menuCompetition;
	private static Inscriptions inscriptions;
	public MainMenu()
	{
		inscriptions = Inscriptions.getInscriptions();
		menuPrincipal=getMenuPrincipal();
		menuPersonne = new MenuUser();
		menuEquipe = new MenuTeam();
		menuCompetition = new MenuCompetition();
	}
	
	public void start()
	{
		menuPrincipal.start();
	}
	
	public static Inscriptions getInscriptions()
	{
		return inscriptions;
	}
	
	//Menu principal
	/**
	 * Retourne le menu principale
	 */

	static Menu getMenuPrincipal()
	{
	        Menu menuPrincipal = new Menu("Menu Principal");
	        menuPrincipal.ajoute(menuPersonne.getMenuPersonne());
	        menuPrincipal.ajoute(menuEquipe.getMenuEquipe());
	        menuPrincipal.ajoute(menuCompetition.getMenuCompetition());
	        menuPrincipal.ajouteQuitter("q");
	        return menuPrincipal;
	}

}