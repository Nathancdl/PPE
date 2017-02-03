package Presentation;

import inscriptions.*;
import utilitaires.ligneDeCommande.Menu;
import utilitaires.ligneDeCommande.Option;
import utilitaires.ligneDeCommande.Action;

import java.util.Scanner;
import java.util.Set;



public class MenuTeam {
	
	
	public static Menu getMenu(String name, Inscriptions inscriptions)
	{
		Menu userMenu = new Menu(name,"2");
		userMenu.ajoute(getOptionAdd());
		userMenu.ajoute(getOptionShow());
		userMenu.ajoute(getOptionEdit());
		userMenu.ajouteRevenir("4");
		userMenu.ajouteQuitter("5");
		return userMenu;
	}
	
	private static Option getOptionAdd()
	{
		return new Option("Add equipe","1",getActionAdd());
	}
	
	private static Action getActionAdd()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				Scanner sc = new Scanner(System.in);
				Inscriptions inscriptions = Inscriptions.getInscriptions();
				System.out.println("user :");
				String nom = sc.nextLine();
				System.out.println("equipe :");
				String equipe = sc.nextLine();
				System.out.println("mdp :");
				String mdp = sc.nextLine();
				
				Personne test = inscriptions.createPersonne(nom, equipe, mdp); 	
				System.out.println(test);}
		};
	}

			
				
				
			
		
	
	
	private static Option getOptionShow()
	{
		return new Option("Show equipe","2",getActionShow());
	}
	
	private static Action getActionShow()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{					
				Inscriptions i = Inscriptions.getInscriptions();
				Set<Equipe> setEquipe = i.getEquipes();
				System.out.println(setEquipe);
				
			}
		};
	}
	
	private static Option getOptionEdit()
	{
		return new Option("Edit equipe","3",getActionEdit());
	}
	
	private static Action getActionEdit()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{
				System.out.println("editer personne");
				
			}
		};
	}
}