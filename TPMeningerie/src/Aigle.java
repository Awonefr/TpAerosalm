
public class Aigle {
	private String nomAigle;
	private int ageAigle;
	private String sexeAigle;
	private int numEncloAigle;
	private String contenueRepas;
	private String heureRepas;
	
	public String getNom() {
		return this.nomAigle;
	}
	public int getAge() {
		return this.ageAigle;
	}
	public String getsexe() {
		return this.sexeAigle;
	}
	public int getNumEnclo() {
		return this.numEncloAigle;
	}
	public String getContenueRepas() {
		return this.contenueRepas;
	}
	public String getHeureRepas() {
		return this.heureRepas;
	}
	public  Aigle(String unNom,int unAge,String unSexe,int unNumEnclo,String unContenueRepas,String uneheureRepas) {
		this.nomAigle=unNom;
		this.ageAigle=unAge;
		this.sexeAigle=unSexe;
		this.numEncloAigle=unNumEnclo;
		this.contenueRepas=unContenueRepas;
		this.heureRepas=uneheureRepas;
	}
	public String toString() {
		String mot="nom : "+nomAigle+"\n";
		mot+="age : "+ageAigle+"\n";
		mot+="sexe : "+sexeAigle+"\n";
		mot+="numéro de l'enclo : "+numEncloAigle+"\n";
		mot+="comptenu du repoas : "+contenueRepas+"\n";
		mot+="heure du repas : "+heureRepas+"\n";
		return mot;	
	}
}
