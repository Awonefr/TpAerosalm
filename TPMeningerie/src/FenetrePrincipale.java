import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
public class FenetrePrincipale extends JFrame implements ActionListener{
	private JPanel monPanel ;
	private JLabel lblMessage;
	private JButton btnSuivant;
	
	public FenetrePrincipale (){
		this.setTitle("ZOO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		monPanel = new JPanel () ;
		lblMessage = new JLabel ("Bienvenue sur l'application : Zoo management");
		btnSuivant = new JButton("Suivant");
		monPanel.setLayout(new BorderLayout());
		monPanel.add(lblMessage,BorderLayout.CENTER);
		monPanel.add(btnSuivant,BorderLayout.SOUTH);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
		btnSuivant.addActionListener(this);
	}
	public void actionPerformed ( ActionEvent evenement ) {
		new FenetrePrincipale2S();
		this.dispose();
	}
}