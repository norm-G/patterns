package programmingPattern.verhaltensmuster.strategie;


/** Strategie Pattern
 * <pre>
 * Wenn es unterschiedliche Implementierungen von einem Ansatzgibt   
 * auch ein gutes Beispiel ist Zalungsmethode (Bar,Karte)
 * 
 * Strategy pattern is used when we have multiple algorithm for a specific 
 * task and client decides the actual implementation to be used at runtime.
 * 
 * Strategy pattern is also known as Policy Pattern. We define multiple 
 * algorithms and let client application pass the algorithm to be used 
 * as a parameter.
 * 
 * Beispiel:
 * Durch das interface Fliegt und flugtyp wird die Tierklasse erweitert 
 * </pre>  
 * @author Norm
 */
public class Strategie {
	
	public static void go(boolean start) {
		if(start) {
			System.out.println("### Strategie ###");
			
			Tier hund = new Hund();
			Tier vogel = new Vogel();
			
			System.out.println("Hund: "+hund.versuchZuFliegen());
			System.out.println("Vogel: "+vogel.versuchZuFliegen());
			
			hund.setFlugFaehig(new esFliegt());
			
			System.out.println("Hund: "+hund.versuchZuFliegen());
			System.out.println("");
		}
		
	}
}
