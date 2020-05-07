package programmingPattern.erzeugermuster.abstractFactory;

/** Abstract Factory Pattern
 * <pre>
 * Fabrik einer Fabrik robust und leicht erweiterbar  
 * 
 * Abstract Factory pattern is similar to Factory pattern 
 * and it’s a factory of factories. If you are familiar with 
 * the factory design pattern in java, you will notice that we 
 * have a single Factory class that returns the different 
 * sub-classes based on the input provided and factory class 
 * uses if-else or switch statement to achieve this.
 *
 * In Abstract Factory pattern, we get rid of if-else block and 
 * have a factory class for each sub-class and then an Abstract 
 * Factory class that will return the sub-class based on the 
 * input factory class.
 *  
 * Beispiel:
 * Erweitert Schuhfabrik um zwei abstrakte Hersteller Adidas, Puma
 * </pre>  
 * @author Norm
 */
public class AbstractFactory {
	/**Abstract Factory
	 * Bsp schuhfabrik nun erweitert 
	 */
	public static void go(boolean start) {
		if(start) {
			System.out.println("### abstractFactory ###");
			
			SchuhFabrik adiFabrik = new AdiSchuhFabrik();
			SchuhFabrik pumaFabrik = new PumaSchuhFabrik();
			
			AbstractSchuh meinAdi = adiFabrik.erzeugeSchuh("Wanderschuh");		
			AbstractSchuh meinPuma = pumaFabrik.erzeugeSchuh("Turnschuh");
			
			
			System.out.println(meinAdi.getName());
			System.out.println(meinPuma.getName());
			System.out.println("");
		}
	}
}
