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
	private JTextField mEmail = mMail();
	private JTextField mPrenom = mPrenom();
	private JTextField mNom = mNom();
	private JLabel labEmail 	= lEmail();
	private JLabel labPrenom 	= lPrenom();
	private JLabel labNom		= lNom();
	private final Inscriptions inscriptions;
	private Map<Integer, Personne> mapPersonnes;
	
	public PanneauTest(Inscriptions inscriptions) {
		
		this.inscriptions = inscriptions;
	//	SpringLayout springLayout = new SpringLayout();
		//	setLayout(springLayout);
		//JScrollPane scrollPane = new JScrollPane();
		//springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 48, SpringLayout.NORTH, this);
		//	springLayout.putConstraint(SpringLayout.WEST, scrollPane, 38, SpringLayout.WEST, this);
		//	add(scrollPane);
		//	
		//	table = new JTable();
		//	scrollPane.setViewportView(table);
		//	JButton btnLoadTable = new JButton("Load user");
		//	scrollPane.setRowHeaderView(btnLoadTable);
		
		//	textField = new JTextField();
		//	add(textField);
		//	textField.setColumns(10);
		
		//	textField_1 = new JTextField();
		//	springLayout.putConstraint(SpringLayout.SOUTH, textField_1, -468, SpringLayout.SOUTH, this);
		//	springLayout.putConstraint(SpringLayout.EAST, textField_1, -10, SpringLayout.EAST, this);
		//	springLayout.putConstraint(SpringLayout.NORTH, textField, 26, SpringLayout.SOUTH, textField_1);
		//	springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		//	add(textField_1);
		//	textField_1.setColumns(10);
		
		//	textField_2 = new JTextField();
		//	springLayout.putConstraint(SpringLayout.NORTH, textField_2, 22, SpringLayout.SOUTH, textField);
		//	springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		//	add(textField_2);
		//	textField_2.setColumns(10);
		
		//	JLabel lblNewLabel = new JLabel("Nom");
		//	springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textField_1);
		//	springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textField_1);
		//	add(lblNewLabel);
		
		//	JLabel lblNewLabel_1 = new JLabel("Prenom");
		//	springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, textField_2);
		//	springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -6, SpringLayout.WEST, textField_2);
		//	add(lblNewLabel_1);
		//	
		//	JLabel lblNewLabel_2 = new JLabel("Mail");
		//	springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 3, SpringLayout.NORTH, textField);
		//	springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -6, SpringLayout.WEST, textField);
		//	add(lblNewLabel_2);
		
		//	JButton btnNewButton = new JButton("Ajouter");
		//	springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 27, SpringLayout.SOUTH, textField_2);
		//	springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, textField);
		//	add(btnNewButton);
		
		

		//		btnLoadTable.addActionListener(new ActionListener() {
		//					public void actionPerformed(ActionEvent arg0) {
		//						
		//					try {
		//					
		//							HashMap<String, Integer> listeP = Connect.selectPersonne();
		//							System.out.println(listeP);
		//							//							
		//						 int row=0;
								 //							 for(Entry<String, Integer> entry: listeP.entrySet()){
		//						      table.setValueAt(entry.getKey(),row,0);
		//						      table.setValueAt(entry.getValue(),row,1);
		//						      row++;
								      //						 }
		//						 table.setVisible(true);
		//					} catch (Exception e) {
		//						e.printStackTrace();
		//					} 
	//					
		//				}
		//		});
		
		
		
		
		
		
//		btnLoadTable.addActionListener(new ActionListener() {
	//		public void actionPerformed(ActionEvent arg0) {
	//			
	//			try {
				
	//				Class.forName("com.mysql.jdbc.Driver");
	//				String url = "jdbc:mysql://localhost/m2ljava?autoReconnect=true&useSSL=false";
	//				String login = "root";
	//				String password = "";
	//				Connection cn = DriverManager.getConnection(url, login,password);
	//				Statement st = cn.createStatement();	
	//				String requete ="Select * From personne where personne.id_personne = id_personne";
	//				ResultSet result;
	//				result = st.executeQuery(requete);
	//				table.setModel(DbUtils.resultSetToTableModel(result));
					
	//			} catch (ClassNotFoundException e) {
	//				e.printStackTrace();
	//			} catch (SQLException e) {
	//				e.printStackTrace();
	//			}	
				
	//		}
	//	});
		

	}
	
	
	private JLabel lEmail() {
		JLabel email = new JLabel("email :");
		email.setForeground(new Color(102, 102, 102));
		email.setBackground(new Color(0, 0, 0));
		email.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		email.setBounds(409, 265, 181, 14);
	return email;
	}
	
	private JLabel lNom() {
		JLabel nom = new JLabel("nom :");
		nom.setForeground(new Color(102, 102, 102));
		nom.setBackground(new Color(0, 0, 0));
		nom.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		nom.setBounds(409, 265, 181, 14);
	return nom;
	}
	private JLabel lPrenom() {
		JLabel prenom = new JLabel("prenom :");
		prenom.setForeground(new Color(102, 102, 102));
		prenom.setBackground(new Color(0, 0, 0));
		prenom.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		prenom.setBounds(409, 265, 181, 14);
	return prenom;
	}


	private JTextField mMail() {
		mEmail = new JTextField();
		mEmail.setEnabled(false);
		mEmail.setEditable(false);
		mEmail.setBackground(new Color(102, 102, 102));
		mEmail.setBounds(406, 287, 160, 20);
		mEmail.setColumns(10);
	return mEmail;
	}
	private JTextField mPrenom() {
		mPrenom = new JTextField();
		mPrenom.setEnabled(false);
		mPrenom.setEditable(false);
		mPrenom.setBackground(new Color(102, 102, 102));
		mPrenom.setBounds(406, 287, 160, 20);
		mPrenom.setColumns(10);
	return mPrenom;
	}
	private JTextField mNom() {
		mNom = new JTextField();
		mNom.setEnabled(false);
		mNom.setEditable(false);
		mNom.setBackground(new Color(102, 102, 102));
		mNom.setBounds(406, 287, 160, 20);
		mNom.setColumns(10);
	return mNom;
	}


	private void associateLabels(){
		labEmail.setLabelFor(mEmail);
		labPrenom.setLabelFor(mPrenom);
		labNom.setLabelFor(mNom);
	}
	
	public JPanel getCardModif(){
		
		JPanel cardPersonnes = new JPanel();
		cardPersonnes.setBackground(new Color(51, 153, 204));
		cardPersonnes.setLayout(null);
		cardPersonnes.add(List());
		
		cardPersonnes.add(mEmail);
		cardPersonnes.add(labEmail);
		
		cardPersonnes.add(mPrenom);
		cardPersonnes.add(labPrenom);
		
		cardPersonnes.add(mNom);
		cardPersonnes.add(labNom);		
		
		JButton btnValiderLaModification = new JButton("Valider");
		btnValiderLaModification.setBounds(250, 351, 160, 23);
		btnValiderLaModification.addActionListener(getValidationSelectionListener());
		cardPersonnes.add(btnValiderLaModification);
		
		cardPersonnes.add(getListPersonne());

	return cardPersonnes;
	}
	
	private JLabel List(){
		JLabel List = new JLabel("Liste des personnes enregistr\u00E9es :");
		List.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		List.setBounds(37, 43, 249, 16);
	return List;
	}
	
	private JList<String> getListPersonne(){
		JList<String> listePersonnes = new JList<>(getListPersonneModel());
		listePersonnes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listePersonnes.setBackground(new Color(51, 102, 153));
		listePersonnes.setBounds(37, 80, 190, 256);
		listePersonnes.addListSelectionListener(getListPersonneSelectionListener());	
		return listePersonnes;
		}
	
	private ListSelectionListener getListPersonneSelectionListener()
	{
		return new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e)
			{
				JList<String> source = (JList<String>) e.getSource();
				int index = source.getSelectedIndex();
				System.out.println(index);
				System.out.println(source.getModel().getSize() -1);
				if (index == source.getModel().getSize() - 1){
					//gérer l'ajout ici
					System.out.println("Ajout d'une personne");
				}
				else{						
					//gérer la modif ici
					PrenomOn(mapPersonnes.get(index).getNom());
					PrenomOn(mapPersonnes.get(index).getPrenom());
					PrenomOn(mapPersonnes.get(index).getMail());
					
					System.out.println("Selection de " + mapPersonnes.get(index).getNom());
				}
			}
		};
	}
	public void PrenomOn(String data){
		mPrenom.setText("");
		mPrenom.setEditable(true);
		mPrenom.setEnabled(true);
		mPrenom.setBackground(new Color(51, 102, 153));
		mPrenom.setForeground(new Color(0,0,0));
		mPrenom.setText(data);	
	}
	
	private ListModel<String> getListPersonneModel()
	{
		rafraichirMap();
		return new ListModel<String>() {
			
			@Override
			public void removeListDataListener(ListDataListener l)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int getSize()
			{
				return mapPersonnes.size() + 1;
			}
			
			@Override
			public String getElementAt(int index)
			{
				if (index < mapPersonnes.size())
					return mapPersonnes.get(index).getNom();
				else
					return "<Ajouter>";
			}
			
			@Override
			public void addListDataListener(ListDataListener l)
			{
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	private void rafraichirMap()
	{
		mapPersonnes = new TreeMap<>();
		int i = 0;
		for (Personne p : inscriptions.getPersonnes())
			mapPersonnes.put(i++, p);
	}
	
	private ActionListener getValidationSelectionListener()
	{
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				inscriptions.createPersonne(mNom.getText(),
											mPrenom.getText(),
											mEmail.getText()
											);	
				rafraichirMap();
			}
		};
	} 
	
	public JPanel getOnglet()
	{
		JPanel ongletPers = new JPanel();
		associateLabels();
		ongletPers.setLayout(new BorderLayout());
		ongletPers.setName("Gestion de Personnes");
		ongletPers.add(getCardModif());
		return ongletPers;
	}
}
