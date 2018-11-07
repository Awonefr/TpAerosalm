import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class Fenetresoigneur extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btnAjouterunAnimal;
	private JButton btnDepartAnimal;
	private JButton btnRetour;
	public Fenetresoigneur (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bonjour soigneur que voullez vous faire ?");
		btnAjouterunAnimal = new JButton("AjouterunAnimal");
		btnDepartAnimal = new JButton("SupprimerunAnimal");
		btnRetour = new JButton("Retour");
		monPanel.setLayout(new BorderLayout());
		monPanel.add(lblMessage,BorderLayout.CENTER);
		monPanel.add(btnAjouterunAnimal,BorderLayout.WEST);
		monPanel.add(btnDepartAnimal,BorderLayout.EAST);
		monPanel.add(btnRetour,BorderLayout.SOUTH);
		btnAjouterunAnimal.addActionListener(this);
		btnDepartAnimal.addActionListener(this);
		btnRetour.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btnAjouterunAnimal) {
			new AjoutAnimal();
			this.dispose();	
		}
		if(evenement.getSource() == btnDepartAnimal) {
			new DepartAnimal();
			this.dispose();	
		}
		if(evenement.getSource() == btnRetour) {
			new FenetreEmployer();
			this.dispose();	
		}
	}
}