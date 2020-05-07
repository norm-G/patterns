package programmingPattern.verhaltensmuster.strategie;

public class esFliegtNicht implements Fliegt {

	@Override
	public String fliegt() {
		return "Es fliegt nicht";
	}
	
}