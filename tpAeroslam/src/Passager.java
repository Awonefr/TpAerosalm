public class Passager {
	String nom;
	String prenom;
	String ville;
	String cp;
	int adresse;
	//get
	public String getnom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public String getVille(){
		return this.ville;
	}
	public String getCp(){
		return this.cp;
	}
	public int getAdresse(){
		return this.adresse;
	}
	//set
	public void  setnom(String unNom){
		this.nom=unNom;
	}
	public void  setPrenom(String unPrenom){
		this.nom=unPrenom;
	}
	public void  setVille(String unVille){
		this.nom=unVille;
	}
	public void  setCp(String unCp){
		this.nom=unCp;
	}
	public void  setAdresse(String unAdresse){
		this.nom=unAdresse;
	}
	
	
	public Passager(String unNom,String unprenom,String uneVille,String unCp,int uneAdresse){	
		this.nom=unNom;
		this.prenom=unprenom;
		this.ville=uneVille;
		this.cp=unCp;
		this.adresse=uneAdresse;
	}
	public String toString(){
		
		return cp;
		
	}
}
