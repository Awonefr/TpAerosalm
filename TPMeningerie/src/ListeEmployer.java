import java.util.ArrayList;
public class ListeEmployer {
	
	private ArrayList<Employer> listeEmployer = new ArrayList<Employer>();
	
	public void ajouterUnEmployer(Employer unEmployer){
		listeEmployer.add(unEmployer);
	}
	
	public String getListeEmployer() {
		String mot="il y a : "+listeEmployer.size()+" Employers\n";
		for(int i=0;i<listeEmployer.size();i++) {
			mot+=listeEmployer.get(i).toString()+"\n";
		}
		return mot;
	}
	public Employer départUnEmployer(String unNom){
		boolean presence = false;
		int i=0;
		while(i<listeEmployer.size() && presence==false){
			if(unNom.equals(listeEmployer.get(i).getNom())){
				presence=true;
				listeEmployer.remove(i);
			}
			else{
				i=i+1;
			}
		}
		return listeEmployer.get(i);
	}
}