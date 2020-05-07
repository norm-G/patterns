package programmingPattern.strukturmuster.adapter;


/** Adapter Pattern
 * <pre>
 * Ein Adapter wird benutzt um zwei sich unterscheidene 
 * Classen zusammen zubringen
 * 
 * One of the great real life example of Adapter design pattern 
 * is mobile charger. Mobile battery needs 3 volts to charge but 
 * the normal socket produces either 120V (US) or 240V (India). 
 * So the mobile charger works as an adapter between mobile charging 
 * socket and the wall socket.
 * 
 * Beispiel:
 * Durch den Adapter kann der Roboter wie ein Panzer gesteuert werden
 * </pre>  
 * @author norm-G
 */
public class Adapter {
	
	public static void go(boolean start) {
		if(start) {
			System.out.println("### Adapter ###");
			
			FeindPanzer xyzPanzer = new FeindPanzer();
			
			FeindRoboter fred = new FeindRoboter();
			
			FeindAngreifer adapter = new FeindRoboterAdapter(fred);
			
			System.out.println("Der Roboter");
			fred.reaktionAufMensch("Paul");
			fred.vorwaertsGehen();
			fred.zuschlagen();
			System.out.println("Der Panzer");
			xyzPanzer.fahrerZuweisen("Bob");
			xyzPanzer.vorwaertsFahren();
			xyzPanzer.waffeAbfeuern();
			
			System.out.println("Der Adapter");
			adapter.fahrerZuweisen("Mark");
			adapter.vorwaertsFahren();
			adapter.waffeAbfeuern();
			
			
			System.out.println("");
		}
		
	}

	

}
