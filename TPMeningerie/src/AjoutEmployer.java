import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class AjoutEmployer extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage1;
	private JLabel lblMessage2;
	private JLabel lblMessage3;
	private JLabel lblMessage4;
	private JLabel lblMessage5;
	private JLabel lblMessage6;
	private JTextField jtfNom;
	private JTextField jtfAge;
	private JTextField jtfprenom;
	private JTextField jtfrésidence;
	private JTextField jtfNumEnclo;
	private JTextField jtfTypeEmployer;
	private JButton btnValider;
	private JButton btnRetour;
	public AjoutEmployer (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		//champs
		
		lblMessage1 = new JLabel ("nom de l'employer : ");
		jtfNom = new JTextField();
		Font police = new Font("Arial", Font.BOLD, 14);
		jtfNom.setFont(police);
		jtfNom.setPreferredSize(new Dimension(150, 30));
		
		lblMessage2 = new JLabel ("Prenom de employer : ");
		jtfprenom = new JTextField();
		jtfprenom.setFont(police);
		jtfprenom.setPreferredSize(new Dimension(150, 30));
		
		lblMessage3 = new JLabel (" age de l'empoyer:");
		jtfAge = new JTextField();
		jtfAge.setFont(police);
		jtfAge.setPreferredSize(new Dimension(150, 30));
		
		lblMessage4 = new JLabel ("résidence:");
		jtfrésidence = new JTextField();
		jtfrésidence.setFont(police);
		jtfrésidence.setPreferredSize(new Dimension(150, 30));
		
		lblMessage5 = new JLabel ("numero de l'enclo qu'il s'occupe:");
		jtfNumEnclo = new JTextField();
		jtfNumEnclo.setFont(police);
		jtfNumEnclo.setPreferredSize(new Dimension(150, 30));
		
		lblMessage6 = new JLabel ("type employer:");
		jtfTypeEmployer = new JTextField();
		jtfTypeEmployer.setFont(police);
		jtfTypeEmployer.setPreferredSize(new Dimension(150, 30));
		btnValider = new JButton("Valider");
		btnRetour = new JButton("retour");
		
		monPanel.add(lblMessage1);
		monPanel.add(jtfNom);
		monPanel.add(lblMessage2);
		monPanel.add(jtfprenom);
		monPanel.add(lblMessage3);
		monPanel.add(jtfAge);
		monPanel.add(lblMessage4);
		monPanel.add(jtfrésidence);
		monPanel.add(lblMessage5);
		monPanel.add(jtfNumEnclo);
		monPanel.add(lblMessage6);
		monPanel.add(jtfTypeEmployer);
		monPanel.add(btnValider);
		monPanel.add(btnRetour);
		
		btnValider.addActionListener(this);
		btnRetour.addActionListener(this);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		if ( evenement.getSource() == btnValider) {
			String nom=jtfNom.getText();
			String prenom=jtfprenom.getText();
			String Age=jtfAge.getText();
			String résidence=jtfrésidence.getText();
			String NumEnclo=jtfNumEnclo.getText();
			String TypeEmployer=jtfTypeEmployer.getText();
			System.out.println("nom:"+nom);
			System.out.println("prenom:"+prenom);
			System.out.println("Age:"+Age);
			System.out.println("résidence:"+résidence);
			System.out.println("NumEnclo:"+NumEnclo);
			System.out.println("TypeEmployer:"+TypeEmployer);
		}
		if ( evenement.getSource() == btnRetour) {
			new FenetreEmployer();
			this.dispose();
		}
	}
}