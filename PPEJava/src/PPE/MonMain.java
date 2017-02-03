package PPE;
import java.util.Scanner;
import database.*;
import inscriptions.*;
import Presentation.*;
public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connect connect = new Connect();
		MainMenu mainMenu = new MainMenu(Inscriptions.getInscriptions());
		
		
		
	}

}
