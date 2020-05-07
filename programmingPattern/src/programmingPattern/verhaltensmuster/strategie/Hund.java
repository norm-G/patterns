package programmingPattern.verhaltensmuster.strategie;

public class Hund extends Tier{
	public Hund() {
		super();
		setVoice("wuff");
		flugTyp = new esFliegtNicht();
	}
}
