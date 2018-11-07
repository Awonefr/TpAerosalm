public class Avion {
	String nomAvion;
	int nbPlaces;
	public String getNomAvion(){
		return this.nomAvion;
	}
	public int getNbPlaces(){
		return this.nbPlaces;
	}
	public Avion(String unNomAvion,int unNbPlaces){	
		this.nomAvion=unNomAvion;
		this.nbPlaces=unNbPlaces;
	}
}
