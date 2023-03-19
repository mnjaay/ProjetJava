package Deliberation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class pageChef {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageChef window = new pageChef();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pageChef() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1101, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 1067, 103);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnDeconnection = new JButton("DECONNECTION");
		btnDeconnection.setBackground(Color.RED);
		btnDeconnection.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDeconnection.setForeground(Color.BLACK);
		btnDeconnection.setBounds(928, 22, 129, 58);
		panel.add(btnDeconnection);
		
		JLabel lblNewLabel_1 = new JLabel("TABLEAU DE BORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(433, 14, 269, 70);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 123, 213, 660);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Nouveau Professeur");
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 237, 193, 58);
		panel_1.add(btnNewButton);
		
		JButton btnNouveauEtudiant = new JButton("Nouveau Etudiant");
		btnNouveauEtudiant.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNouveauEtudiant.setBounds(10, 334, 193, 58);
		panel_1.add(btnNouveauEtudiant);
		
		JButton btnDeliberation = new JButton("Consulter Resultat");
		btnDeliberation.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeliberation.setBounds(10, 428, 193, 58);
		panel_1.add(btnDeliberation);
		
		JButton btnDeliberation_1 = new JButton("Deliberation");
		btnDeliberation_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeliberation_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeliberation_1.setBounds(10, 517, 193, 58);
		panel_1.add(btnDeliberation_1);
		
		JLabel lblNewLabel = new JLabel("Prenom :");
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 52, 74, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNom.setBounds(10, 83, 74, 13);
		panel_1.add(lblNom);
		
		JLabel lblStatus = new JLabel("Status :");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblStatus.setBounds(10, 120, 74, 13);
		panel_1.add(lblStatus);
		
		
		
	}

	public void setVisble(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
