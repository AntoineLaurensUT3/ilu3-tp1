package cartes;

public enum Type {
	FEU ("Feu Rouge", "Feu Vert", "Vehicule Prioritaire"), 
	ESSENCE("Panne d'essence", "Essence", "Citerne d'essence"), 
	CREVAISON("Crevaison", "Roue de secours", "Increvable"), 
	ACCIDENT("Accident","Reparation", "As du Volant");
	
	private  String parade = "";
	private  String attaque = "";
	private  String botte = "";
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}

	public String getParade() {
		return parade;
	}


	public String getAttaque() {
		return attaque;
	}

	public String getBotte() {
		return botte;
	}

}
