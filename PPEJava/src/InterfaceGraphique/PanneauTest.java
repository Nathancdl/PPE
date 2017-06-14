package InterfaceGraphique;
import bdd.Connect;
import net.proteanit.sql.DbUtils;
import inscriptions.*;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class PanneauTest extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Connect bdd = new Connect();
	private JTable table;
 	private JPanel panelTest = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public PanneauTest() {
		
		
		SpringLayout springLayout = new SpringLayout();
			setLayout(springLayout);
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 48, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.WEST, scrollPane, 38, SpringLayout.WEST, this);
			add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			JButton btnLoadTable = new JButton("Load user");
			scrollPane.setRowHeaderView(btnLoadTable);
		
			textField = new JTextField();
			add(textField);
			textField.setColumns(10);
	
			textField_1 = new JTextField();
			springLayout.putConstraint(SpringLayout.SOUTH, textField_1, -468, SpringLayout.SOUTH, this);
			springLayout.putConstraint(SpringLayout.EAST, textField_1, -10, SpringLayout.EAST, this);
			springLayout.putConstraint(SpringLayout.NORTH, textField, 26, SpringLayout.SOUTH, textField_1);
			springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
			add(textField_1);
			textField_1.setColumns(10);
		
			textField_2 = new JTextField();
			springLayout.putConstraint(SpringLayout.NORTH, textField_2, 22, SpringLayout.SOUTH, textField);
			springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
			add(textField_2);
			textField_2.setColumns(10);
		
			JLabel lblNewLabel = new JLabel("Nom");
			springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textField_1);
			springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textField_1);
			add(lblNewLabel);
		
			JLabel lblNewLabel_1 = new JLabel("Prenom");
			springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, textField_2);
			springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -6, SpringLayout.WEST, textField_2);
			add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Mail");
			springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 3, SpringLayout.NORTH, textField);
			springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -6, SpringLayout.WEST, textField);
			add(lblNewLabel_2);
		
			JButton btnNewButton = new JButton("Ajouter");
			springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 27, SpringLayout.SOUTH, textField_2);
			springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, textField);
			add(btnNewButton);
		
		

				btnLoadTable.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
							try {
							
									HashMap<String, Integer> listeP = Connect.selectPersonne();
									System.out.println(listeP);
															
							 int row=0;
								 						 for(Entry<String, Integer> entry: listeP.entrySet()){
							      table.setValueAt(entry.getKey(),row,0);
								      table.setValueAt(entry.getValue(),row,1);
								      row++;
								      						 }
								 table.setVisible(true);
							} catch (Exception e) {
							e.printStackTrace();
							} 
					
						}
			});
		
		
		
		
		
		
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost/m2ljava?autoReconnect=true&useSSL=false";
					String login = "root";
					String password = "";
					Connection cn = DriverManager.getConnection(url, login,password);
					Statement st = cn.createStatement();	
					String requete ="Select * From personne where personne.id_personne = id_personne";
					ResultSet result;
					result = st.executeQuery(requete);
					table.setModel(DbUtils.resultSetToTableModel(result));
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
				
			}
		});
		

	}
}
	
	