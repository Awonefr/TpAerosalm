import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class FenetreVisiteur extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btnListeLion;
	private JButton btnListeHippopotame;
	private JButton btnListeTigre;
	private JButton btnListeAigle;
	private JButton btnListeTouquan;
	private JButton btnRetour;
	public FenetreVisiteur (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bienvenue dans le ZOO visiteur ");
		btnListeLion = new JButton("ListeLion");
		btnListeHippopotame = new JButton("ListeHippopotame");
		btnListeTigre = new JButton("ListeTigre");
		btnListeAigle = new JButton("ListeAigle");
		btnListeTouquan = new JButton("ListeTouquan");
		btnRetour = new JButton("btnRetour");
		
		monPanel.add(lblMessage);
		monPanel.add(btnListeLion);
		monPanel.add(btnListeHippopotame);
		monPanel.add(btnListeTigre);
		monPanel.add(btnListeAigle);
		monPanel.add(btnListeTouquan);
		monPanel.add(btnRetour);
		btnListeLion.addActionListener(this);
		btnListeHippopotame.addActionListener(this);
		btnListeTigre.addActionListener(this);
		btnListeAigle.addActionListener(this);
		btnListeTouquan.addActionListener(this);
		btnRetour.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btnListeHippopotame) {
			System.out.println("Vous avez selectionner la liste des hippopotame");// Si la source de l'évènement est le JButton appelé btnValider
		}
		if ( evenement.getSource() == btnListeLion) {
			System.out.println ("Vous avez selectionner la liste des lion");
		}
			
		if ( evenement.getSource() == btnListeTigre) {
			System.out.println ("Vous avez selectionner la liste des tigre");
		}
		if ( evenement.getSource() == btnListeAigle) {
			System.out.println ("Vous avez selectionner la liste des Aigles");
		}
		if ( evenement.getSource() == btnListeTouquan) {
			System.out.println ("Vous avez selectionner la liste des touqaun");
		}
		if(evenement.getSource() == btnRetour) {
			new FenetrePrincipale2S();
			this.dispose();	
		}
	}
}