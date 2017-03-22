package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre extends JFrame
{
	private Panneau panneau = new Panneau();

	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuFichier = new JMenu("Fichier");
	private JMenu menuEdition = new JMenu("Edition");
	private JMenu menuAide = new JMenu("Aide");
	
	private JMenuItem item1 = new JMenuItem("Ouvrir");
	private JMenuItem item2 = new JMenuItem("Fermer");
	private JMenuItem item3 = new JMenuItem("Lancer");
	private JMenuItem item4 = new JMenuItem("Arrêter");
	private JMenuItem item5 = new JMenuItem("Aide");
	
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	public Fenetre()
	{   
		
	    this.setTitle("Gestionnaire de compétition");
	    this.setSize(WIDTH, HEIGHT);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(panneau);
	    menuFichier.add(item1);
		menuFichier.addSeparator();
	    menuFichier.add(item2);
		menuEdition.add(item3);
		menuEdition.addSeparator();
		menuEdition.add(item4);
		menuAide.add(item5);
		menuBar.add(menuFichier);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);
		
		item1.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e )
			{
				dispose();
				
			}
		});
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
		
		 setJMenuBar(menuBar);
		 this.setVisible(true);
	 }
}