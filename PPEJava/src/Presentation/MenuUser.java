package Presentation;

import inscriptions.*;
import utilitaires.ligneDeCommande.Menu;
import utilitaires.ligneDeCommande.Option;
import utilitaires.ligneDeCommande.Action;
import java.util.Scanner;
import java.util.Set;


public class MenuUser {
	
	
	
	public static Menu getMenu(String name, Inscriptions inscriptions)
	{
		Menu userMenu = new Menu(name,"1");
		userMenu.ajoute(getOptionAdd());
		userMenu.ajoute(getOptionShow());
		userMenu.ajoute(getOptionEdit());
		userMenu.ajouteRevenir("4");
		userMenu.ajouteQuitter("5");
		return userMenu;
	}
	
	private static Option getOptionAdd()
	{
		return new Option("Add personne","1",getActionAdd());
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
		return new Option("Show Personne","2",getActionShow());
	}
	
	private static Action getActionShow()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{					
				Inscriptions inscriptions = Inscriptions.getInscriptions();
				Set<Candidat> setCandidatTest = inscriptions.getCandidats();
				System.out.println(setCandidatTest);
				
			}
		};
	}
	
	private static Option getOptionEdit()
	{
		return new Option("Edit Personne","3",getActionEdit());
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