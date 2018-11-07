public class Tigre extends Animaux{
	private String nomTigre;
	private int ageTigre;
	private String sexeTigre;
	private int numEncloTigre;
	private String contenueRepas;
	private String heureRepas;
	
	public String getNom() {
		return this.nomTigre;
	}
	public int getAge() {
		return this.ageTigre;
	}
	public String getsexe() {
		return this.sexeTigre;
	}
	public int getNumEnclo() {
		return this.numEncloTigre;
	}
	public String getContenueRepas() {
		return this.contenueRepas;
	}
	public String getHeureRepas() {
		return this.heureRepas;
	}
	public  Tigre(String unNom,int unAge,String unSexe,int unNumEnclo,String unContenueRepas,String uneheureRepas) {
		this.nomTigre=unNom;
		this.ageTigre=unAge;
		this.sexeTigre=unSexe;
		this.numEncloTigre=unNumEnclo;
		this.contenueRepas=unContenueRepas;
		this.heureRepas=uneheureRepas;
	}
	public String toString() {
		String mot="nom : "+nomTigre+"\n";
		mot+="age : "+ageTigre+"\n";
		mot+="sexe : "+sexeTigre+"\n";
		mot+="numéro de l'enclo : "+numEncloTigre+"\n";
		mot+="comptenu du repoas : "+contenueRepas+"\n";
		mot+="heure du repas : "+heureRepas+"\n";
		return mot;
	}
}