package Deliberation;
import java.sql.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class page_connexion {

	private JFrame frame;
	private JTextField UserName;
	private JPasswordField passwordField;
	private Statement statement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_connexion window = new page_connexion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//////////Constructeur//////////////
	public page_connexion() {
		
		initialize();
	
	}
/////////Methode connection db 
	public void connectionDB() {};
	
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1101, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(135, 59, 816, 645);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		UserName = new JTextField();
	
	    UserName.setBounds(319, 227, 268, 48);
		panel.add(UserName);
		UserName.setColumns(10);
		
		//insertion de photo
	/*	ImageIcon imageIcon = new ImageIcon("/image/téléchargement.jpg");

        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.CENTER);
	-*/	
		JLabel lblNewLabel = new JLabel("PAGE DE CONNEXION");
		lblNewLabel.setBounds(232, 120, 334, 38);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(319, 328, 268, 48);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("NOM D'UTILISATEUR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(126, 227, 183, 48);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("MOT DE PASSE");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(136, 328, 183, 48);
		panel.add(lblNewLabel_1_1);
		
		JButton SeConnecter = new JButton("SE  CONNECTER");
	
		SeConnecter.addActionListener(connect ->{
			if(UserName.getText().isEmpty() ||passwordField.getText().isEmpty() )	{
				JOptionPane.showMessageDialog(panel,"Les Champs sont Vides");
				pageChef page = new pageChef();
				page.setVisble(true);
			}
			else {
				JOptionPane.showMessageDialog(panel,"Les Champs ne sont pas Vides");
			}
			
			/*try {
				
			
				    // Faire quelque chose avec les données récupérées
				    if( UserName.getText().isEmpty()) {
				    	JOptionPane.showMessageDialog(panel,"Champs Vide");
				    }else {
				    	Class.forName("com.mysql.jdbc.Driver");
						
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deliberation" , "root" , "");
						
						Statement statement = conn.createStatement();
					
						ResultSet resultSet = statement.executeQuery("SELECT * FROM personne where user='UserName.getText()u'");
						String UserN = resultSet.getString(1);
					    String mdp = resultSet.getString(2);
				    	if(UserN == UserName.getText()) {
				    
				    		JOptionPane.showMessageDialog(panel,"Connection etablie");
				    	}
				    	else {
				    		JOptionPane.showMessageDialog(panel,"Connection pas bon ");
				    	}
			
				   
				    	
				   
				}

			
				
				
			}catch(Exception e3) {
				System.out.println(e3);
			}
		*/
			
				
			
		});
		SeConnecter.setBackground(new Color(0, 255, 0));
		SeConnecter.setFont(new Font("Tahoma", Font.BOLD, 14));
		SeConnecter.setBounds(319, 439, 162, 54);
		panel.add(SeConnecter);
		
		JButton btnAnnuler = new JButton("ANNULER");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent exit) {
				        System.exit(0);
				    
			}
		});
		btnAnnuler.setBackground(Color.RED);
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAnnuler.setBounds(623, 581, 162, 54);
		panel.add(btnAnnuler);
	}
}
