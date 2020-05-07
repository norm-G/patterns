package programmingPattern.erzeugermuster.builder;

/** Builder Pattern
 * <pre>
 * Im Fall das ein Konstruktor zuviele Attribute hat 
 * oder Optionale so wird das erzeugen erleichtert
 * 
 * This pattern was introduced to solve some of the 
 * problems with Factory and Abstract Factory 
 * design patterns when the Object contains a lot of attributes. 
 * Builder pattern solves the issue with large number of optional 
 * parameters and inconsistent state by providing a way to build 
 * the object step-by-step and provide a method that will actually 
 * return the final Object.
 * 
 * Beispiel:
 * Ein Computer benoetigten(hdd,ram) 
 * und optionalen(grafik,bluetooth) Feldern
 * </pre>  
 * @author Norm
 */
public class Builder {
	public static void go(boolean start) {
		if(start) {
			System.out.println("### builder ###");
			
			Computer pc= new Computer.ComputerBuilder("20 GB SSD", "16 DDR")
											.setBluetooth(false).setGrafik(true).build();
			
			System.out.println("Computer: "+pc);
			System.out.println("");
			
		}
	}
	
}
