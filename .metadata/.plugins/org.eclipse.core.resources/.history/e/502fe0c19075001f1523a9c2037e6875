package cartes;

public class JeuDeCartes {
	
	private Configuration[] typesDeCartes = new Configuration[19];

	public String affichageJeuDeCartes()
	{
		StringBuilder chaine = new StringBuilder();
		for(int i =0; i<19; i++) {
			 chaine.append(typesDeCartes[i].getNbExemplaires() + " " + typesDeCartes[i].getCarte() + "\n");
		}
		return chaine.toString();
	}
	
	
	private static class Configuration{
		
		private int nbExemplaires;
		private Carte carte;
		
		private Configuration(Carte carte, int nbExemplaires) {
			
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
		}

		public int getNbExemplaires() {
			return nbExemplaires;
		}

		public Carte getCarte() {
			return carte;
		}
		
	}
}
