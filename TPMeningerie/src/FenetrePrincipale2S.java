import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class FenetrePrincipale2S extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btnEmployer;
	private JButton btnVisiteur;
	public FenetrePrincipale2S (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bienvenue dans le ZOO êtes vous un employer ou un visiteur ?");
		btnEmployer = new JButton("Employé");
		btnVisiteur = new JButton("Visiteur");
		
		monPanel.add(lblMessage);
		monPanel.add(btnEmployer);
		monPanel.add(btnVisiteur);
		btnEmployer.addActionListener(this);
		btnVisiteur.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btnEmployer) {
			new FenetreEmployer();
			this.dispose();	
		}
		if ( evenement.getSource() == btnVisiteur) {
			new FenetreVisiteur();
			this.dispose();	
		}
	}
}