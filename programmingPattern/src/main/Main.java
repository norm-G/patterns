package main;

import programmingPattern.erzeugermuster.abstractFactory.AbstractFactory;
import programmingPattern.erzeugermuster.builder.Builder;
import programmingPattern.erzeugermuster.prototype.Prototype;
import programmingPattern.erzeugermuster.simpleFactory.SimpleFactory;
import programmingPattern.erzeugermuster.singleton.Singelton;
import programmingPattern.verhaltensmuster.strategie.Strategie;
import programmingPattern.otherStuff.staticBsp.StaticBsp;
import programmingPattern.strukturmuster.adapter.Adapter;


public class Main {

	public static void main(String[] args) {
		//Fuer weitere Beschreibung mit Maus über die jeweilige Klasse gehen
		
		//bei true wird das Beispiel ausgeführt
		boolean erzeuger = true;
		boolean struktur = true;
		boolean verhalten = true;
		boolean andere = false;
		
		//### Erzeuger ###
		Singelton.go(erzeuger);
		
		SimpleFactory.go(erzeuger);
		
		AbstractFactory.go(erzeuger);
		
		Builder.go(erzeuger);
		
		Prototype.go(erzeuger);
		
		//### Struktur ###
		Adapter.go(struktur);
		// TODO
		
		//### Verhalten ###
		Strategie.go(verhalten);
		// TODO
		
		//### Andere ###
		StaticBsp.go(andere);
	}

}
