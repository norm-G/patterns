package programmingPattern.strukturmuster.adapter;

import java.util.Random;

public class FeindPanzer implements FeindAngreifer{
	
	Random random = new Random();
	
	
	@Override
	public void waffeAbfeuern() {
		//zwischen 1 und 10
		int angriff = random.nextInt(10)+1;
		System.out.println("Feindlicher Panzer macht "+angriff+" Schaden");
	}

	@Override
	public void vorwaertsFahren() {
		int bewegen = random.nextInt(5)+1;
		
		System.out.println("Feindlicher Panzer bewegt sich um "+bewegen+" vorwaerts");
	}

	@Override
	public void fahrerZuweisen(String fahrer) {
		System.out.println(fahrer+" faehrt den Panzer");		
	}

}
