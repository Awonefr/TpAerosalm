import java.util.ArrayList;
public class Animaux {

	private ArrayList<Hippopotame> listeHippopotame = new ArrayList<Hippopotame>();
	private ArrayList<Lion> listeLion = new ArrayList<Lion>();
	private ArrayList<Tigre> listeTigre = new ArrayList<Tigre>();
	private ArrayList<Aigle> listeAigle = new ArrayList<Aigle>();
	private ArrayList<Touquan> listeTouquan = new ArrayList<Touquan>();
	
	//arriver
	public void ajouterUnHippopotame(Hippopotame unHippopotame){
		listeHippopotame.add(unHippopotame);
	}
	public void ajouterUnLion(Lion unLion){
		listeLion.add(unLion);
	}
	public void ajouterUnTigre(Tigre unTigre){
		listeTigre.add(unTigre);
	}
	public void ajouterUnAigle(Aigle unAigle){
		listeAigle.add(unAigle);
	}
	public void ajouterUnTouquan(Touquan unTouquan){
		listeTouquan.add(unTouquan);
	}
	//départ
	public Hippopotame départUnHippopotame(String unNom){
		boolean presence = false;
		int i=0;
		while(i<listeHippopotame.size() && presence==false){
			if(unNom.equals(listeHippopotame.get(i).getNom())){
				presence=true;
				listeHippopotame.remove(i);
			}
			else{
				i=i+1;
			}
		}
		return listeHippopotame.get(i);
	}
	
	public Lion départUnLion(String unNom){
		boolean presence = false;
		int i=0;
		while(i<listeLion.size() && presence==false){
			if(unNom.equals(listeLion.get(i).getNom())){
				presence=true;
				listeLion.remove(i);
			}
			else{
				i=i+1;
			}
		}
		return listeLion.get(i);
	}
	public Tigre départUnTigre(String unNom){
		boolean presence = false;
		int i=0;
		while(i<listeTigre.size() && presence==false){
			if(unNom.equals(listeTigre.get(i).getNom())){
				presence=true;
				listeTigre.remove(i);
			}
			else{
				i=i+1;
			}
		}
		return listeTigre.get(i);
	}
	public Aigle départUnAigle(String unNom){
		boolean presence = false;
		int i=0;
		while(i<listeAigle.size() && presence==false){
			if(unNom.equals(listeAigle.get(i).getNom())){
				presence=true;
				listeAigle.remove(i);
			}
			else{
				i=i+1;
			}
		}
		return listeAigle.get(i);
	}
	public Touquan départUnTouquan(String unNom){
		boolean presence = false;
		int i=0;
		while(i<listeTouquan.size() && presence==false){
			if(unNom.equals(listeTouquan.get(i).getNom())){
				presence=true;
				listeTouquan.remove(i);
			}
			else{
				i=i+1;
			}
		}
		return listeTouquan.get(i);
	}
	//getListe
	public String getListeHippopotame() {
		String mot="il y a : "+listeHippopotame.size()+" hippopotames\n";
		for(int i=0;i<listeHippopotame.size();i++) {
			mot+=listeHippopotame.get(i).toString()+"\n";
		}
		return mot;
	}
	public String getListeLion() {
		String mot="il y a : "+listeLion.size()+" Lions\n";
		for(int i=0;i<listeLion.size();i++) {
			mot+=listeLion.get(i).toString()+"\n";
		}
		return mot;
	}
	public String getListeTigre() {
		String mot="il y a : "+listeTigre.size()+" Tigres\n";
		for(int i=0;i<listeTigre.size();i++) {
			mot+=listeTigre.get(i).toString()+"\n";
		}
		return mot;
	}
	public String getListeAigle() {
		String mot="il y a : "+listeAigle.size()+" Aigles\n";
		for(int i=0;i<listeAigle.size();i++) {
			mot+=listeAigle.get(i).toString()+"\n";
		}
		return mot;
	}
	public String getListeTouquan() {
		String mot="il y a : "+listeTouquan.size()+" Touquans\n";
		for(int i=0;i<listeTouquan.size();i++) {
			mot+=listeTouquan.get(i).toString()+"\n";
		}
		return mot;
	}
}