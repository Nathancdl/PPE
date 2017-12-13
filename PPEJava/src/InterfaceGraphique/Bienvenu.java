package InterfaceGraphique;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import java.awt.Font;

public class Bienvenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Bienvenu() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblBienvenuSurNotre = new JLabel("Bienvenu sur le gestionnaire de compétition");
		lblBienvenuSurNotre.setFont(new Font("Arial", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.NORTH, lblBienvenuSurNotre, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblBienvenuSurNotre, 65, SpringLayout.WEST, this);
		add(lblBienvenuSurNotre);
		
		JLabel lblNewLabel = new JLabel("R\u00E9alis\u00E9 par Nathan");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, this);
		add(lblNewLabel);
		
		JLabel lblCetteApplicationPermet = new JLabel(" L\u2019application en question permet de g\u00E9rer un ensemble de comp\u00E9titions, de");
		springLayout.putConstraint(SpringLayout.NORTH, lblCetteApplicationPermet, 67, SpringLayout.SOUTH, lblBienvenuSurNotre);
		springLayout.putConstraint(SpringLayout.WEST, lblCetteApplicationPermet, 83, SpringLayout.WEST, this);
		add(lblCetteApplicationPermet);
		
		JLabel lblPersonnesEtDaffecter = new JLabel("personnes, et d\u2019affecter des personnes \u00E0 des comp\u00E9titions. Il est possible ");
		springLayout.putConstraint(SpringLayout.EAST, lblPersonnesEtDaffecter, 0, SpringLayout.EAST, lblCetteApplicationPermet);
		add(lblPersonnesEtDaffecter);
		
		JLabel lblQueCertainesComptitions = new JLabel("que certaines comp\u00E9titions soient r\u00E9serv\u00E9es \u00E0 des \u00E9quipes et qu\u2019il soit");
		springLayout.putConstraint(SpringLayout.NORTH, lblQueCertainesComptitions, 134, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblPersonnesEtDaffecter, -6, SpringLayout.NORTH, lblQueCertainesComptitions);
		springLayout.putConstraint(SpringLayout.WEST, lblQueCertainesComptitions, 0, SpringLayout.WEST, lblCetteApplicationPermet);
		add(lblQueCertainesComptitions);
		
		JLabel lblImpossibleUne = new JLabel("impossible \u00E0 une personne seule de s\u2019inscrire. dans le cas, tous les membres ");
		springLayout.putConstraint(SpringLayout.WEST, lblImpossibleUne, 0, SpringLayout.WEST, lblCetteApplicationPermet);
		add(lblImpossibleUne);
		
		JLabel lblDeLquipeDoivent = new JLabel("de l\u2019\u00E9quipe doivent \u00EAtre enregistr\u00E9s. Cette application ne sera pas accessible");
		springLayout.putConstraint(SpringLayout.NORTH, lblDeLquipeDoivent, 174, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblImpossibleUne, -6, SpringLayout.NORTH, lblDeLquipeDoivent);
		springLayout.putConstraint(SpringLayout.WEST, lblDeLquipeDoivent, 0, SpringLayout.WEST, lblCetteApplicationPermet);
		add(lblDeLquipeDoivent);
		
		JLabel lblAuGrandPublic = new JLabel("au grand public, seuls des employ\u00E9s des ligues pourront y acc\u00E9der pour saisir les inscrits.");
		springLayout.putConstraint(SpringLayout.NORTH, lblAuGrandPublic, 6, SpringLayout.SOUTH, lblDeLquipeDoivent);
		springLayout.putConstraint(SpringLayout.WEST, lblAuGrandPublic, 82, SpringLayout.WEST, this);
		add(lblAuGrandPublic);

	}

}
