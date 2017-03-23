package InterfaceGraphique;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AfficheUser extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8275514385433118635L;
	private String mot;
	private JButton affiche, efface;
	private JLabel affichage;
	private JPanel pano;
	
	public AfficheUser(){
		
		setTitle("Boutons");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pano = new JPanel(new BorderLayout(40,50));
		affiche = new JButton("affiché");
		efface = new JButton("Supprime");
		affiche.addActionListener(this);
		efface.addActionListener(this);
		
		affichage = new JLabel();
		pano.add(efface, BorderLayout.EAST);
		pano.add(affiche, BorderLayout.WEST);
		
		add(pano);
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == affiche )
		{
			pano.remove(affichage);
			mot = "Bonjour";
			affichage = new JLabel(mot);
			 
			pano.add(affichage, BorderLayout.CENTER);
			pano.repaint();
			pano.validate();
			
			
			
		}
		else if( e.getSource() == efface )
		{
			pano.remove(affichage);
			pano.repaint();
			mot = "";
			pano.validate();
		}
			
	}

	

}
