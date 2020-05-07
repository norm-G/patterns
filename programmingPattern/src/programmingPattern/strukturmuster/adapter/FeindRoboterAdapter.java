package programmingPattern.strukturmuster.adapter;

public class FeindRoboterAdapter implements FeindAngreifer{
	
	private FeindRoboter roboter;
	
	public FeindRoboterAdapter(FeindRoboter roboter) {
		this.roboter=roboter;
	}
	
	
	
	@Override
	public void waffeAbfeuern() {
		this.roboter.zuschlagen();		
	}

	@Override
	public void vorwaertsFahren() {
		this.roboter.vorwaertsGehen();
	}

	@Override
	public void fahrerZuweisen(String fahrer) {
		this.roboter.reaktionAufMensch(fahrer);		
	}

}
