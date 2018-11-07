public class Touquan extends Animaux{
	private String nomTouquan;
	private int ageTouquan;
	private String sexeTouquan;
	private int numEncloTouquan;
	private String contenueRepas;
	private String heureRepas;
	
	public String getNom() {
		return this.nomTouquan;
	}
	public int getAge() {
		return this.ageTouquan;
	}
	public String getsexe() {
		return this.sexeTouquan;
	}
	public int getNumEnclo() {
		return this.numEncloTouquan;
	}
	public String getContenueRepas() {
		return this.contenueRepas;
	}
	public String getHeureRepas() {
		return this.heureRepas;
	}
	public  Touquan(String unNom,int unAge,String unSexe,int unNumEnclo,String unContenueRepas,String uneheureRepas) {
		this.nomTouquan=unNom;
		this.ageTouquan=unAge;
		this.sexeTouquan=unSexe;
		this.numEncloTouquan=unNumEnclo;
		this.contenueRepas=unContenueRepas;
		this.heureRepas=uneheureRepas;
	}
	public String toString() {
		String mot="nom : "+nomTouquan+"\n";
		mot+="age : "+ageTouquan+"\n";
		mot+="sexe : "+sexeTouquan+"\n";
		mot+="numéro de l'enclo : "+numEncloTouquan+"\n";
		mot+="comptenu du repoas : "+contenueRepas+"\n";
		mot+="heure du repas : "+heureRepas+"\n";
		return mot;
	}
}