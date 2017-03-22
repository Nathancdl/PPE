package InterfaceGraphique;

import javax.swing.*;
import java.awt.*;

public class Accueil {
	
	public Accueil(){
		fenetre = new JFrame("NTM");
		fenetre.setBounds(300, 300, 410, 150);
		
		pano = new JPanel();
		pano.setLayout(new GridLayout(1,1));
		fenetre.add(pano);
		fenetre.setVisible( true );
	}
	
	public static void main(String[] args)
	{
		new AfficheUser();
		new AccueilMenu();
	}
	
	JFrame fenetre;
	
	JPanel pano;

}
