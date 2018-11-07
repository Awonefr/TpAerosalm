import java.util.ArrayList;

public class Employer {
	private String nom;
	private String prenom;
	private int age;
	private String employe;
	private String residence;
	private int numEnclo;
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public String getEmploye() {
		return this.employe;
	}
	public int getNumEnclo() {
		return this.numEnclo;
	}
	public String getresidence() {
		return this.residence;
	}
	public Employer(String unNom,String unPrenom,int unAge,String unEmploye,String uneResidence,int unNumEnclo) {
		this.nom=unNom;
		this.prenom=unPrenom;
		this.employe=unEmploye;
		this.age=unAge;
		this.residence=uneResidence;
		this.numEnclo=unNumEnclo;
	}
	public String toString() {
			String mot="nom :"+nom+"\n";
			mot+="prenom : "+prenom+"\n";
			mot+="age : "+age+"ans\n";
			mot+="fonction de l'employés : "+employe+"\n";
			mot+="résidence : "+residence+"\n";
			if(numEnclo!=0) {
				mot+="numéro de l'enclo dont il s'occupe : "+numEnclo+"\n";
			}
		return mot;
	}
}