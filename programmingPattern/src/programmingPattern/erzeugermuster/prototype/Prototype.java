package programmingPattern.erzeugermuster.prototype;


/** Prototype Pattern
 * <pre>
 * Es wird ein Prototyp durch clonen erzeugt um zB das laden aus der DB
 * zu sparen
 * 
 * Prototype pattern is used when the Object creation is a costly affair 
 * and requires a lot of time and resources and you have a similar object 
 * already existing. So this pattern provides a mechanism to copy the 
 * original object to a new object and then modify it according to our 
 * needs. This pattern uses java cloning to copy the object.
 * 
 * Beispiel:
 * 
 * </pre>  
 * @author Norm
 */
public class Prototype {
	
	public static void go(boolean start) {
		if(start) {
			System.out.println("### prototype ###");
			
			Benutzer benutzer = new Benutzer();
			benutzer.loadData();
			
			Benutzer benutzerProto1 = (Benutzer) benutzer.clone();
			Benutzer benutzerProto2 = (Benutzer) benutzer.clone();
			
			benutzerProto1.addBenutzer("Eins");
			benutzerProto1.addBenutzer("Zwei");
			
			benutzerProto2.removeBenutzer("bob");
			
			System.out.println("Original: "+benutzer.getBenutzer());
			System.out.println("Prototype1: "+benutzerProto1.getBenutzer());
			System.out.println("Prototype2: "+benutzerProto2.getBenutzer());
			
			System.out.println("");
		}	
	}

}
