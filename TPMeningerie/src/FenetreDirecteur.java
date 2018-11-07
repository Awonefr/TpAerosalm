import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class FenetreDirecteur extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btnAjouterunAnimal;
	private JButton btnDepartAnimal;
	private JButton btnAjouterEmployer;
	private JButton btnDepartEmployer;
	public FenetreDirecteur (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bonjour Directeur que voullez vous faire ?");
		btnAjouterunAnimal = new JButton("Ajouter un Animal");
		btnDepartAnimal = new JButton("Supprimer un Animal");
		btnAjouterEmployer = new JButton("Ajouter un employer");
		btnDepartEmployer = new JButton("départ d'un employer");
		monPanel.setLayout(new BorderLayout());
		monPanel.add(lblMessage,BorderLayout.CENTER);
		monPanel.add(btnAjouterunAnimal,BorderLayout.WEST);
		monPanel.add(btnDepartAnimal,BorderLayout.EAST);
		monPanel.add(btnAjouterEmployer,BorderLayout.NORTH);
		monPanel.add(btnDepartEmployer,BorderLayout.SOUTH);
		btnAjouterunAnimal.addActionListener(this);
		btnDepartAnimal.addActionListener(this);
		btnAjouterEmployer.addActionListener(this);
		btnDepartEmployer.addActionListener(this);
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
		if ( evenement.getSource() == btnAjouterEmployer) {
			new AjoutEmployer();
			this.dispose();	
		}
		if(evenement.getSource() == btnDepartEmployer) {
			new DepartEmployer();
			this.dispose();	
		}
	}
	
}