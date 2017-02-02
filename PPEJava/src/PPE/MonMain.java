package PPE;
import java.util.Scanner;
import database.*;
import inscriptions.*;
import Presentation.*;
public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		System.out.println("Nouvel compet :");
		String compet = sc.nextLine();
		Competition taist = inscriptions.createCompetition(compet, null, false);
		
		System.out.println("Nouvel equipe :");
		String equip = sc.nextLine();
		Equipe taiist = inscriptions.createEquipe(equip);
		
		
		System.out.println("user :");
		String nom = sc.nextLine();
		System.out.println("equipe :");
		String equipe = sc.nextLine();
		System.out.println("mdp :");
		String mdp = sc.nextLine();
		
		Personne test = inscriptions.createPersonne(nom, equipe, mdp); 
		taist.add(test);
		taiist.add(test);
		
		System.out.println(test);
		
		
	}

}
