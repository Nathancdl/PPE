package Presentation;

import inscriptions.*;
import utilitaires.ligneDeCommande.Menu;
import utilitaires.ligneDeCommande.Option;
import utilitaires.ligneDeCommande.Action;
import java.util.Scanner;
import java.util.Set;



public class MenuCompetition {
	
	
	public static Menu getMenu(String name, Inscriptions inscriptions)
	{
		Menu userMenu = new Menu(name,"3");
		userMenu.ajoute(getOptionAdd());
		userMenu.ajoute(getOptionShow());
		userMenu.ajoute(getOptionEdit());
		userMenu.ajouteRevenir("4");
		userMenu.ajouteQuitter("5");
		return userMenu;
	}
	
	private static Option getOptionAdd()
	{
		return new Option("Add competition","1",getActionAdd());
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
				System.out.println(taist);}
		};
	}

			
				
				
			
		
	
	
	private static Option getOptionShow()
	{
		return new Option("Show competition","2",getActionShow());
	}
	
	private static Action getActionShow()
	{
		return new Action()
		{
			public void optionSelectionnee()
			{					
				Inscriptions i = Inscriptions.getInscriptions();
				Set<Candidat> setCandidatTest = i.getCandidats();
				System.out.println(setCandidatTest);
				
			}
		};
	}
	
	private static Option getOptionEdit()
	{
		return new Option("Edit Competition","3",getActionEdit());
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