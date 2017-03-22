package InterfaceGraphique;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import Presentation.*;
import commandLine.Menu;
import inscriptions.Inscriptions;
import Presentation.MainMenu;


public class AccueilMenu extends JFrame {
	
	
	private JLabel affichage;
	private JPanel pano;
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuFichier = new JMenu("Fichier");
	private JMenu menuEdition = new JMenu("Edition");
	private JMenu menuAide = new JMenu("Aide");
	
	private JMenuItem item1 = new JMenuItem("Ouvrir");
	private JMenuItem item2 = new JMenuItem("Fermer");
	private JMenuItem item3 = new JMenuItem("Lancer");
	private JMenuItem item4 = new JMenuItem("Arrêter");
	private JMenuItem item5 = new JMenuItem("Aide");
	
	
	public AccueilMenu(){
		
		
		
		
		setSize(800,600);
		setTitle("Accueil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pano = new JPanel(new BorderLayout(40,50));
		affichage = new JLabel();
		menuFichier.add(item1);
		
		item2.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e )
			{
				dispose();
				
			}
		});
		
		item3.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e )
			{
				
			}
		});
		
		
		
		menuFichier.add(item2);
		menuEdition.add(item3);
		menuEdition.addSeparator();
		menuEdition.add(item4);
		menuAide.add(item5);
		menuBar.add(menuFichier);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);
		
		
		setJMenuBar(menuBar);
		setVisible(true);
		
		
		
	}
	

}
