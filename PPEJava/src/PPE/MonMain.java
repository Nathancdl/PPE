package PPE;
import java.util.Scanner;
import presist.*;
import inscriptions.*;
import Presentation.*;
public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connect connect = new Connect();
		System.out.println(connect);
		MainMenu mainMenu = new MainMenu(Inscriptions.getInscriptions());
		
		
		
	}

}
