package InterfaceGraphique;
import bdd.Connect;
import net.proteanit.sql.DbUtils;

import javax.swing.JPanel;
import javax.swing.JTable;



import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;


public class PanneauTestEquipe extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTable table;
	Connect bdd = new Connect();
	private JPanel panelTest = new JPanel();
	
	public PanneauTestEquipe() {
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		JButton btnLoadTable = new JButton("Load team");
		scrollPane.setRowHeaderView(btnLoadTable);
		
		
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost/m2ljava?autoReconnect=true&useSSL=false";
					String login = "root";
					String password = "";
					Connection cn = DriverManager.getConnection(url, login,password);
					Statement st = cn.createStatement();	
					String requete ="Select * From equipe where equipe.id_equipe = id_equipe";
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
