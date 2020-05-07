package programmingPattern.otherStuff.staticBsp;

public class Navi {
	
	private int nummer;
	private static String version = "v1";
	
	public Navi(int id) {
		this.nummer=id;
	}
	
	public void updateVersion(String vs) {
		version=vs;
	}
	
	public String getVersion() {
		return version;
	}
	
	public int getId() {
		return this.nummer;
	}
	
}
