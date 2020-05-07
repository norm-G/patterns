package programmingPattern.strukturmuster.adapter;

import java.util.Random;

public class FeindRoboter {
	
	Random random = new Random();
	
	
	public void zuschlagen() {
		int angriff = random.nextInt(10)+1;
		System.out.println("Feindlicher Roboter verursacht "+angriff+" Schaden mit seiner Hand");
	}
	
	public void vorwaertsGehen() {
		int gehen = random.nextInt(3)+1;
		
		System.out.println("Feindlicher Roboter geht "+gehen+" vorwaerts");
	}
	
	public void reaktionAufMensch(String mensch) {
		System.out.println("Feindlicher Roboter trapelt auf "+mensch);
	}
	
}
