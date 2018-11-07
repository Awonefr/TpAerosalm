import java.sql.*;
import java.util.ArrayList;
public class Model {
	private static Connection connexion;
	private static PreparedStatement statement;
	private static ResultSet rs;
	private static  ArrayList<Avion> lesAvions;
	
	//m�thode public et statique
	public static void connexionBDD(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion=DriverManager.getConnection("jdbc:mysql://localhost/aeroslam","root","");
			System.out.println("connexion r�ussie");
		}
		catch (ClassNotFoundException erreur) {
			System.out.println("Driver non charg� ! " + erreur);
		}
		catch (SQLException erreur) {
			System.out.println("la connexion � la base de donn�es a �chou� ou erreur SQL ..." + erreur);
		}
	}
	public static void deconnexionBDD(){
		try {
			connexion.close();
			System.out.println("deconnexion r�ussie");
		}
		catch (SQLException erreur) {
			System.out.println("la connexion � la base de donn�es a �chou� ou erreur SQL ..." + erreur);
		}
	}
	public static void ajouterAvion(Avion UnAvion){
		String unNom=UnAvion.getNomAvion();
		int unNbPlace=UnAvion.getNbPlaces();
		connexionBDD();
		try {
			statement= connexion.prepareStatement("INSERT INTO avion(Nom,prenom) values (?, ?)");
			statement.setString(1, unNom);
			statement.setInt(2, unNbPlace);
			int count = statement.executeUpdate();
		}
		catch (SQLException erreur) {
			System.out.println("la connexion � la base de donn�es a �chou� ou erreur SQL ..." + erreur);
		}
	}
	public static void countAvion(Avion UnAvion){
		String unNom=UnAvion.getNomAvion();
		int unNbPlace=UnAvion.getNbPlaces();
		connexionBDD();
		try {
			statement= connexion.prepareStatement("INSERT INTO avion(Nom,prenom) values (?, ?)");
			statement.setString(1, unNom);
			statement.setInt(2, unNbPlace);
			int count = statement.executeUpdate();
		}
		catch (SQLException erreur) {
			System.out.println("la connexion � la base de donn�es a �chou� ou erreur SQL ..." + erreur);
		}
	}
	
}
