public class Lion extends Animaux{
	private String nomLion;
	private int ageLion;
	private String sexeLion;
	private int numEncloLion;
	private String contenueRepas;
	private String heureRepas;
	
	public String getNom() {
		return this.nomLion;
	}
	public int getAge() {
		return this.ageLion;
	}
	public String getSexe() {
		return this.sexeLion;
	}
	public int getNumEnclo() {
		return this.numEncloLion;
	}
	public String getContenueRepas() {
		return this.contenueRepas;
	}
	public String getHeureRepas() {
		return this.heureRepas;
	}
	public  Lion(String unNom,int unAge,String unSexe,int unNumEnclo,String unContenueRepas,String uneheureRepas) {
		this.nomLion=unNom;
		this.ageLion=unAge;
		this.sexeLion=unSexe;
		this.numEncloLion=unNumEnclo;
		this.contenueRepas=unContenueRepas;
		this.heureRepas=uneheureRepas;
	}
	public String toString() {
		String mot="nom : "+nomLion+"\n";
		mot+="age : "+ageLion+"\n";
		mot+="sexe : "+sexeLion+"\n";
		mot+="numéro de l'enclo : "+numEncloLion+"\n";
		mot+="comptenu du repoas : "+contenueRepas+"\n";
		mot+="heure du repas : "+heureRepas+"\n";
		return mot;
	}
}