package programmingPattern.erzeugermuster.simpleFactory;

public class Schuhfabrik {
	
	public Schuh erzeugeSchuhe(String schuhArt) {
		
		if(schuhArt.equals("Turnschuh")) {
			return new Turnschuh();
		}else if (schuhArt.equals("Wanderschuh")) {
			return new Wanderschuh(); 
		}else {
			return null;
		}
		
	}

}
