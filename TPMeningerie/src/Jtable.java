import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;

import javax.swing.*;
public class Jtable extends JFrame{
	private JPanel monPanel ;
	public Jtable (){
		this.setLocationRelativeTo(null);   
		monPanel = new JPanel () ;
		monPanel.setLayout(new BorderLayout());
		setTitle("JTable test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Object[][] donnees = {
                {"Alexis", "wone", "rouge", "oui", "tennis"},
                {"alex", "mora", "noir", "oui", "Natation"},
                {"marie", "xion", "vert", "non", "basket"},
        };
		String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport favori"};
		
		JTable tableau = new JTable(donnees, entetes);
		this.setSize(600, 400);//en pixel
		this.setResizable(false);
		this.getContentPane().add(new JScrollPane(tableau));
		getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
		getContentPane().add(tableau, BorderLayout.CENTER);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
}
