package InterfaceGraphique;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import inscriptions.Inscriptions;

public class Panneau extends JPanel
{
	private JLabel titre = new JLabel("Application de gestion de comp�tition");
	private static Inscriptions inscriptions;
	JTabbedPane tab = new JTabbedPane();
	
	
	public Panneau()
	{
		
		this.setLayout(new BorderLayout());
		Font police = new Font("Tahoma", Font.BOLD, 18);
		titre.setFont(police);
		titre.setHorizontalAlignment(JLabel.CENTER);
		tab.addTab("Gestion de comp�tition", new JPanel());
		tab.addTab("Gestion de d'�quipe", new JPanel());
		tab.addTab("Gestion de personne", new JPanel());
		tab.setBackground(Color.WHITE);
		tab.setFont(police);
		this.add(tab,BorderLayout.CENTER);
	}
	
	public void paintComponent(Graphics g){
        g.setFont(new Font("Tahoma", Font.BOLD, 80));
        
    }

	
	public int centerText(Graphics g, Font font, String text)
	{
		return g.getFontMetrics(font).stringWidth(text)/2;
	}
	
	public static Inscriptions getInscriptions()
	{
		inscriptions = Inscriptions.getInscriptions();
		return inscriptions;
	}
}