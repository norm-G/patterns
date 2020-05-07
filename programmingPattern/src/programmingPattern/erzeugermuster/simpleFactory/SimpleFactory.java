package programmingPattern.erzeugermuster.simpleFactory;


/** Simple Factory Pattern
 * <pre>
 * Wird genutzt wenn man eine Superklasse und mehrere Unterklassen hat
 * Kann mit 
 * - interfaces
 * - abstract class
 * - normal java class
 * genutzt werden
 * 
 * Factory design pattern is used when we have a super class with multiple 
 * sub-classes and based on input, we need to return one of the sub-class. 
 * This pattern take out the responsibility of instantiation of a class 
 * from client program to the factory class. We can apply Singleton pattern 
 * on Factory class or make the factory method static.
 * 
 * Beispiel:
 * Eine Schuhfabrik erzeugt entweder Turnschuh oder Wanderschuh
 * </pre>  
 * @author Norm
 */
public class SimpleFactory {
	
	
	public static void go(boolean start) {
		
		if(start) {
			System.out.println("### simpleFactory ###");
			
			Schuhfabrik fabrik = new Schuhfabrik();
			Schuh meinSchuh = fabrik.erzeugeSchuhe("Turnschuh");
			Schuh deinSchuh = fabrik.erzeugeSchuhe("Wanderschuh");
			
			System.out.println(meinSchuh.getName());
			System.out.println(deinSchuh.getName());
			System.out.println("");
		}
		
	}
	
	
}
