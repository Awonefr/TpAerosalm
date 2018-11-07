import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class DepartAnimal extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JTextField jtfNom;
	private JButton btnValider;
	private JButton btnRetour;
	public DepartAnimal (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("quelle est le nom de l'animal qui part ?");
		jtfNom = new JTextField();
		Font police = new Font("Arial", Font.BOLD, 14);
		jtfNom.setFont(police);
		jtfNom.setPreferredSize(new Dimension(150, 30));
		btnValider = new JButton("Valider");
		btnRetour = new JButton("Retour");
		monPanel.add(lblMessage);
		monPanel.add(jtfNom);
		monPanel.add(btnValider);
		monPanel.add(btnRetour);
		btnValider.addActionListener(this);
		btnRetour.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btnValider) {
			System.out.println("l'animal est bien parti");
		}
		if ( evenement.getSource() == btnRetour) {
			new FenetreEmployer();
			this.dispose();
		}
	}
}