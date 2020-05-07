package programmingPattern.verhaltensmuster.strategie;

public class Vogel extends Tier{
	public Vogel() {
		super();
		setVoice("Schirp");
		flugTyp = new esFliegt();
	}
}
