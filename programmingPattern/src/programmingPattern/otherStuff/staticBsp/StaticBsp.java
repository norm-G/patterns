package programmingPattern.otherStuff.staticBsp;


/** Static Beispeil
 * <pre>
 * Was ein Static-Feld bewirkt 
 * 
 * Beispiel:
 * Navi hat ein Static-Feld Version
 * </pre>  
 * @author norm-G
 */
public class StaticBsp {
	public static void go(boolean start) {
		if(start) {
			System.out.println("### static ###");
			
			Navi navi1 = new Navi(1);
			Navi navi2 = new Navi(2);
			Navi navi3 = new Navi(3);
			
			System.out.println(navi1.getVersion());
			System.out.println(navi2.getVersion());
			System.out.println(navi3.getVersion());
			
			navi1.updateVersion("v5");
			
			System.out.println(navi1.getVersion());
			System.out.println(navi2.getVersion());
			System.out.println(navi3.getVersion());
			System.out.println("");
		}
		
	}
}
