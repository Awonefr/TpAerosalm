public class Hippopotame extends Animaux{
	private String nomHippopotame;
	private int ageHippopotame;
	private String sexeHippopotame;
	private int numEncloHippopotame;
	private String contenueRepas;
	private String heureRepas;
	
	public String getNom() {
		return this.nomHippopotame;
	}
	public int getAge() {
		return this.ageHippopotame;
	}
	public String getsexe() {
		return this.sexeHippopotame;
	}
	public int getNumEnclo() {
		return this.numEncloHippopotame;
	}
	public String getContenueRepas() {
		return this.contenueRepas;
	}
	public String getHeureRepas() {
		return this.heureRepas;
	}
	public  Hippopotame(String unNom,int unAge,String unSexe,int unNumEnclo,String unContenueRepas,String uneheureRepas) {
		this.nomHippopotame=unNom;
		this.ageHippopotame=unAge;
		this.sexeHippopotame=unSexe;
		this.numEncloHippopotame=unNumEnclo;
		this.contenueRepas=unContenueRepas;
		this.heureRepas=uneheureRepas;
	}
	public String toString() {
		String mot="nom : "+nomHippopotame+"\n";
		mot+="age : "+ageHippopotame+"\n";
		mot+="sexe : "+sexeHippopotame+"\n";
		mot+="numéro de l'enclo : "+numEncloHippopotame+"\n";
		mot+="comptenu du repoas : "+contenueRepas+"\n";
		mot+="heure du repas : "+heureRepas+"\n";
		return mot;
	}
}