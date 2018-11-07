
import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class FenetreEmployer extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btndirecteur;
	private JButton btnsoigneur;
	private JButton btnComptable;
	private JButton btnVeterinaire;
	private JButton btnRetour;
	public FenetreEmployer (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bonjour Employé quelle employer etes vous ?");
		btndirecteur = new JButton("directeur");
		btnsoigneur = new JButton("soigneur");
		btnComptable = new JButton("comptable");
		btnVeterinaire = new JButton("veterinaire");
		btnRetour = new JButton("Retour");
		monPanel.setLayout(new BorderLayout());
		monPanel.add(lblMessage,BorderLayout.CENTER);
		monPanel.add(btndirecteur,BorderLayout.NORTH);
		monPanel.add(btnsoigneur,BorderLayout.EAST);
		monPanel.add(btnComptable,BorderLayout.WEST);
		monPanel.add(btnVeterinaire,BorderLayout.SOUTH);
		
		btndirecteur.addActionListener(this);
		btnsoigneur.addActionListener(this);
		btnComptable.addActionListener(this);
		btnVeterinaire.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btndirecteur) {
			new FenetreDirecteur();
			this.dispose();	
		}
		if ( evenement.getSource() == btnsoigneur) {
			new Fenetresoigneur();
			this.dispose();	
		}
		if ( evenement.getSource() == btnComptable) {
			new FenetreComptable();
			this.dispose();	
		}
		if ( evenement.getSource() == btnVeterinaire) {
			new FenetreVeterinaire();
			this.dispose();	
		}
	}
}