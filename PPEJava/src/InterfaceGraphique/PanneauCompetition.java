
package InterfaceGraphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import inscriptions.Competition;
import inscriptions.DateInvalide;
import inscriptions.Equipe;
import inscriptions.Inscriptions;
import inscriptions.Personne;

public class PanneauCompetition extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6666279952339121849L;
	
	private Inscriptions inscriptions = Panneau.getInscriptions();
	
	
	Personne selectPersonne;
	Equipe selectEquipe;
	Equipe selectEquipeDispo;
	Competition selectCompetition;
	Competition selectCompetitionDispo;
	
	
//	private JPanel panelAfficherPersonne = new JPanel();
	
	
	
	private JTextField nomField = new JTextField();
	private JTextField prenomField = new JTextField();
	private JTextField mailField = new JTextField();
	
	private JButton boutonAjoute = new JButton("Ajouter");
	private JButton boutonEdite = new JButton("Editer");

	private JButton boutonSupprPersonne = new JButton("Supprimer cette personne");
	
	
	private Dimension tailleEdit = new Dimension(Fenetre.WIDTH * 80 / 100, Fenetre.HEIGHT * 12 / 100 );
	
	public PanneauCompetition() 
	{

		// Instantiation
		JLabel label = new JLabel("Panneau de Compétition");
		 
		this.add(label);
		
		boutonAjoute.setEnabled(false);
		boutonEdite.setEnabled(false);

		//Panneau afficherPersonne
		
		setAfficherPersonne();
		this.add(boutonSupprPersonne);
	}
	private void setAfficherPersonne()
	{
		JPanel panelAfficherPersonne = new JPanel(); 
		panelAfficherPersonne.add(new JLabel("Nom : "));
		nomField.setPreferredSize(new Dimension(130, 20));
		panelAfficherPersonne.add(nomField);
		
		panelAfficherPersonne.add(Box.createHorizontalStrut(40));
		
		panelAfficherPersonne.add(new JLabel("Prénom : "));
		prenomField.setPreferredSize(new Dimension(130, 20));
		panelAfficherPersonne.add(prenomField);
		
		panelAfficherPersonne.add(Box.createHorizontalStrut(10));
		
		panelAfficherPersonne.add(new JLabel("Mail : "));
		mailField.setPreferredSize(new Dimension(130, 20));
		panelAfficherPersonne.add(mailField);
		
		boutonEdite.setPreferredSize(new Dimension(80,20));
		panelAfficherPersonne.add(boutonEdite);
		
		panelAfficherPersonne.setBorder(BorderFactory.createTitledBorder("Informations"));
		panelAfficherPersonne.setPreferredSize(tailleEdit);
		this.add(panelAfficherPersonne);
	}

}
