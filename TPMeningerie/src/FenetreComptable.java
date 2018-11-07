import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class FenetreComptable extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btnAjouterEmployer;
	private JButton btnDepartEmployer;
	private JButton btnRetour;
	public FenetreComptable (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bonjour comptable que voullez vous faire ?");
		btnAjouterEmployer = new JButton("Ajouter un employer");
		btnDepartEmployer = new JButton("Supprimer un employer");
		btnRetour = new JButton("Retour");
		monPanel.setLayout(new BorderLayout());
		monPanel.add(lblMessage,BorderLayout.CENTER);
		monPanel.add(btnAjouterEmployer,BorderLayout.WEST);
		monPanel.add(btnDepartEmployer,BorderLayout.EAST);
		monPanel.add(btnRetour,BorderLayout.SOUTH);
		btnAjouterEmployer.addActionListener(this);
		btnDepartEmployer.addActionListener(this);
		btnRetour.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btnAjouterEmployer) {
			new AjoutEmployer();
			this.dispose();	
		}
		if(evenement.getSource() == btnDepartEmployer) {
			new DepartEmployer();
			this.dispose();	
		}
		if(evenement.getSource() == btnRetour) {
			new FenetreEmployer();
			this.dispose();	
		}
	}
}