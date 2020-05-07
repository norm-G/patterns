package programmingPattern.verhaltensmuster.strategie;

public class Tier {
	
	private String name;
	private String voice;
	protected Fliegt flugTyp;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public String versuchZuFliegen() {
		return this.flugTyp.fliegt();
	}
	
	public void setFlugFaehig(Fliegt fliegt) {
		this.flugTyp = fliegt;
	}
	

}
