public class Destination {
	String villeDest;
	String paysDest;
	public String getVilleDest(){
		return this.villeDest;
	}
	public String getPaysDest(){
		return this.paysDest;
	}
	public Destination(String uneVilleDest,String unPaysDest){	
		this.villeDest=uneVilleDest;
		this.paysDest=unPaysDest;
	}
}
