import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class AjoutAnimal extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage1;
	private JLabel lblMessage2;
	private JLabel lblMessage3;
	private JLabel lblMessage4;
	private JLabel lblMessage5;
	private JLabel lblMessage6;
	private JTextField jtfNom;
	private JTextField jtfAge;
	private JTextField jtfSexe;
	private JTextField jtfNumEnclo;
	private JTextField jtfContenueRepas;
	private JTextField jtfheureRepas;
	private JButton btnValider;
	private JButton btnRetour;
	public AjoutAnimal (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		//champs
		lblMessage1 = new JLabel ("nom de l'animal:");
		jtfNom = new JTextField();
		Font police = new Font("Arial", Font.BOLD, 14);
		jtfNom.setFont(police);
		jtfNom.setPreferredSize(new Dimension(150, 30));
		
		lblMessage2 = new JLabel ("Age de l'animal:");
		jtfAge = new JTextField();
		jtfAge.setFont(police);
		jtfAge.setPreferredSize(new Dimension(150, 30));
		
		lblMessage3 = new JLabel ("Sexe de l'animal:");
		jtfSexe = new JTextField();
		jtfSexe.setFont(police);
		jtfSexe.setPreferredSize(new Dimension(150, 30));
		
		lblMessage4 = new JLabel ("NumEnclo de l'animal:");
		jtfNumEnclo = new JTextField();
		jtfNumEnclo.setFont(police);
		jtfNumEnclo.setPreferredSize(new Dimension(150, 30));
		
		lblMessage5 = new JLabel ("ContenueRepas de l'animal:");
		jtfContenueRepas = new JTextField();
		jtfContenueRepas.setFont(police);
		jtfContenueRepas.setPreferredSize(new Dimension(150, 30));
		
		lblMessage6 = new JLabel ("heureRepas animal:");
		jtfheureRepas = new JTextField();
		jtfheureRepas.setFont(police);
		jtfheureRepas.setPreferredSize(new Dimension(150, 30));
		btnValider = new JButton("Valider");
		btnRetour = new JButton("Retour");
		
		monPanel.add(lblMessage1);
		monPanel.add(jtfNom);
		monPanel.add(lblMessage2);
		monPanel.add(jtfAge);
		monPanel.add(lblMessage3);
		monPanel.add(jtfSexe);
		monPanel.add(lblMessage4);
		monPanel.add(jtfNumEnclo);
		monPanel.add(lblMessage5);
		monPanel.add(jtfContenueRepas);
		monPanel.add(lblMessage6);
		monPanel.add(jtfheureRepas);
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
			String Age=jtfAge.getText();
			String Sexe=jtfSexe.getText();
			String NumEnclo=jtfNumEnclo.getText();
			String ContenueRepas=jtfContenueRepas.getText();
			String heureRepas=jtfheureRepas.getText();
			System.out.println("nom:"+nom);
			System.out.println("Age:"+Age);
			System.out.println("Sexe:"+Sexe);
			System.out.println("NumEnclo:"+NumEnclo);
			System.out.println("ContenueRepas:"+ContenueRepas);
			System.out.println("heureRepas:"+heureRepas);
		}
		if ( evenement.getSource() == btnRetour) {
			new FenetreEmployer();
			this.dispose();
		}
	}
}