package Presentation;

import inscriptions.*;

import commandLine.Menu;
import commandLine.Option;
import commandLine.Action;
import commandLine.ActionListe;

import java.util.ArrayList;
import java.util.List;
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
		return new Option("Add personne","1",getActionadd());
	}
	
	

	private static Action getActionadd() 
	{
		return new Action ()
		{
			@Override
			public void optionSelectionnee()
			{
				Inscriptions inscriptions = Inscriptions.getInscriptions();
				String nom= EntreesSorties.getString("Nom : "),
                prenom = EntreesSorties.getString("Prénom : "),
                mail = EntreesSorties.getString("Mail : ");
				inscriptions.createPersonne(nom, prenom, mail);
			}
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