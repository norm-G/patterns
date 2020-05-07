package programmingPattern.erzeugermuster.abstractFactory;

public class AdiSchuhFabrik implements SchuhFabrik{

	@Override
	public AbstractSchuh erzeugeSchuh(String art) {
		
		if(art.equals("Turnschuh")) {
			return new AdiTurnschuh();
		}else if(art.equals("Wanderschuh")){
			return new AdiWanderschuh();
		}else {
			return null;
		}
	}

}
