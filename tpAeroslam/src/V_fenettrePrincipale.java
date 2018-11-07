//test du git 2

import java.awt.*;
import java.awt.event.* ;
import java.util.ArrayList;
import javax.swing.*;

public class V_fenettrePrincipale extends JFrame implements ActionListener{
	private JPanel monPanel ;
	public V_fenettrePrincipale (){
		this.setTitle("Fprincipale");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);//en pixel
		monPanel = new JPanel () ;
		JMenuBar menu = new JMenuBar();
		
		// barre de menu avion
		JMenu Avion = new JMenu("Avion");
		JMenuItem consulterAvion = new JMenuItem("consulter");
		Avion.add(consulterAvion);
		JMenuItem ajouterAvion = new JMenuItem("ajouter");
		Avion.add(ajouterAvion);
		menu.add(Avion);
		
		// barre de menu destination
		JMenu Destination = new JMenu("Destination");
		JMenuItem consulterDestination = new JMenuItem("consulter");
		Destination.add(consulterDestination);
		JMenuItem ajouterDestination = new JMenuItem("ajouter");
		Destination.add(ajouterDestination);
		menu.add(Destination);
		
		// barre de menu VolCommercial
		JMenu VolCommercial = new JMenu("VolCommercial");
		JMenuItem consulterVolCommercial = new JMenuItem("consulter");
		VolCommercial.add(consulterVolCommercial);
		JMenuItem ajouterVolCommercial = new JMenuItem("ajouter");
		VolCommercial.add(ajouterVolCommercial);
		menu.add(VolCommercial);
		
		// barre de menu VolCourrier
		JMenu VolCourrier = new JMenu("VolCourrier");
		JMenuItem consulterVolCourrier = new JMenuItem("consulter");
		VolCourrier.add(consulterVolCourrier);
		JMenuItem ajouterVolCourrier = new JMenuItem("ajouter");
		VolCourrier.add(ajouterVolCourrier);
		menu.add(VolCourrier);
		
		//Consulter.addActionListener
		consulterDestination.addActionListener(new MenuActionConsulterAvion());
		consulterDestination.addActionListener(new MenuActionConsulterDestination());
		consulterVolCommercial.addActionListener(new MenuActionConsulterVolCommercial());
		consulterVolCourrier.addActionListener(new MenuActionConsulterVolCourrier());
		
		//ajouter.addActionListener
		ajouterAvion.addActionListener(new MenuActionAjouterAvion());
		ajouterDestination.addActionListener(new MenuActionAjouterDestination());
		ajouterVolCommercial.addActionListener(new MenuActionAjouterVolCommercial());
		ajouterVolCourrier.addActionListener(new MenuActionAjouterVolCourrier());
		
		// Permet de définir le menu utilisé dans la JFrame
		this.setJMenuBar(menu);
		this.getContentPane().add(monPanel);// On ajoute le JPanel au conteneur principal de notre fenêtre (obligatoire)
		this.setVisible(true);
	}
	
	public void actionPerformed ( ActionEvent evenement ){
	}
	
	//MenuActionConsulter
	public class MenuActionConsulterAvion implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
			//co
		}
	}
	//----------------------------------------------------------------------------
	public class MenuActionConsulterDestination implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
		
		}
	}
	//----------------------------------------------------------------------------
	public class MenuActionConsulterVolCommercial implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
		
		}
	}
	//----------------------------------------------------------------------------
	public class MenuActionConsulterVolCourrier implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
		
		}
	}
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	
	//MenuActionAjouter
	public class MenuActionAjouterAvion implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
			
		}
	}
	//----------------------------------------------------------------------------
	public class MenuActionAjouterDestination implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
			
		}
	}
	//----------------------------------------------------------------------------
	public class MenuActionAjouterVolCommercial implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
			
		}
	}
	//----------------------------------------------------------------------------
	public class MenuActionAjouterVolCourrier implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evenement){
			
		}
	}
}
