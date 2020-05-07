package programmingPattern.erzeugermuster.abstractFactory;

public class PumaSchuhFabrik implements SchuhFabrik{

	@Override
	public AbstractSchuh erzeugeSchuh(String art) {
		if(art.equals("Turnschuh")){
			return new PumaTurnschuh();
		}else if(art.equals("Wanderschuh")){
			return new PumaWanderschuh();
		}else {
			return null;
		}
	}

}
