package Presentation;

import inscriptions.*;
import commandLine.Menu;
import commandLine.Option;
import commandLine.Action;
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
		return new Action ()
		{
			@Override
			public void optionSelectionnee()
			{
				Inscriptions inscriptions = Inscriptions.getInscriptions();
				String nom= EntreesSorties.getString("Nom : ");
                inscriptions.createCompetition(nom, null, false);
			}
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
				Set<Competition> setCompetition = i.getCompetitions();
				System.out.println(setCompetition);
				
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
				System.out.println("editer compet");
				
			}
		};
	}
}