package Presentation;

import inscriptions.*;
import utilitaires.ligneDeCommande.Menu;
import utilitaires.ligneDeCommande.Option;
import utilitaires.ligneDeCommande.Action;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

import database.Connect;

public class MenuCompetition {
	
	
	public static Menu getMenu(String name, Inscriptions inscriptions)
	{
		Menu competMenu = new Menu(name,"p");
		competMenu.ajoute(getOptionAdd());
		competMenu.ajoute(getOptionShow());
		competMenu.ajoute(getOptionEdit());
		competMenu.ajouteRevenir("r");
		competMenu.ajouteQuitter("q");
		return competMenu;
	}
	
	private static Option getOptionAdd()
	{
		return new Option("Ajouter une personne","a",getActionAdd());
	}
	
	private static Action getActionAdd()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				Scanner sc = new Scanner(System.in);
				Inscriptions inscriptions = Inscriptions.getInscriptions();
				System.out.println("Nouvel compet :");
				String compet = sc.nextLine();
				Competition taist = inscriptions.createCompetition(compet, null, false);
				}
		};
	}

			
				
				
			
		
	
	
	private static Option getOptionShow()
	{
		return new Option("Afficher une Personne","f",getActionShow());
	}
	
	private static Action getActionShow()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				System.out.println("point d'arrivée : afficher personnes");
				//MainMenu.inscriptions.afficherUser();
			}
		};
	}
	
	private static Option getOptionEdit()
	{
		return new Option("Editer une Personne","e",getActionEdit());
	}
	
	private static Action getActionEdit()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				System.out.println("point d'arrivée : editer personne");
				//MainMenu.inscriptions.editerUser();
			}
		};
	}
}