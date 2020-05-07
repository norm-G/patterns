package programmingPattern.erzeugermuster.singleton;


/** Singleton Pattern
 * <pre>
 * Dies ist ein Beispiel einer Lazy Variante des Singelton
 * Weitere Varianten:
 * - Eager initialization
 * - Static block initialization
 * - Thread Safe Singleton
 * - Bill Pugh Singleton Implementation
 * - Using Reflection to destroy Singleton Pattern
 * - Enum Singleton
 * - Serialization and Singleton
 * 
 * Singleton pattern restricts the instantiation of a class 
 * and ensures that only one instance of the class exists in 
 * the Java virtual machine. It seems to be a very simple 
 * design pattern but when it comes to implementation, it 
 * comes with a lot of implementation concerns. The 
 * implementation of the Singleton pattern has always been 
 * a controversial topic among developers.
 * 
 * Beispiel:
 * Es kann nur einen Koenig geben (lazy)
 * </pre>  
 * @author norm-G
 */
public class Singelton {
	
	
	public static void go(boolean start) {
		
		if(start) {
			System.out.println("### Singelton ###");
			
			King bob = King.getInstance();
			bob.setName("bob");
			
			System.out.println(bob.angriff());
			
			King noob = King.getInstance();
			//da nur ein Koenig wird hier auch der name von Bob geaendert
			noob.setName("noob");
			
			System.out.println(noob.angriff());
			System.out.println(bob.rueckzug());
			System.out.println("");
		}
		
	}
	
	
}