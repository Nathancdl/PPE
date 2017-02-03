package Presentation;

import inscriptions.*;
import utilitaires.ligneDeCommande.Menu;
import utilitaires.ligneDeCommande.Option;
import utilitaires.ligneDeCommande.Action;

import java.util.Scanner;


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
		return new Option("Ajouter une compet","ac",getActionAdd());
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
		return new Option("Afficher une compet","fc",getActionShow());
	}
	
	private static Action getActionShow()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				System.out.println("afficher personnes");
				//MainMenu.inscriptions.afficherUser();
			}
		};
	}
	
	private static Option getOptionEdit()
	{
		return new Option("Editer une compet","ec",getActionEdit());
	}
	
	private static Action getActionEdit()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				System.out.println("editer personne");
				//MainMenu.inscriptions.editerUser();
			}
		};
	}
}