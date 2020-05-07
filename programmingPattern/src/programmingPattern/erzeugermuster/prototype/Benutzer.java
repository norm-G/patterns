package programmingPattern.erzeugermuster.prototype;

import java.util.ArrayList;
import java.util.List;

public class Benutzer implements Cloneable{
	
	private List<String> benutzerListe;
	
	public Benutzer() {
		this.benutzerListe = new ArrayList<String>();
	}
	
	public Benutzer(List<String>benutzerList) {
		this.benutzerListe=benutzerList;
	}
	
	public void loadData() {
		this.benutzerListe.add("bob");
		this.benutzerListe.add("lob");
		this.benutzerListe.add("vob");
		this.benutzerListe.add("hob");
		this.benutzerListe.add("kob");
	}
	
	public void addBenutzer(String s) {
		this.benutzerListe.add(s);
	}
	
	public void removeBenutzer(String s) {
		this.benutzerListe.remove(s);
	}
	
	public List<String> getBenutzer(){
		return this.benutzerListe;
	}
	
	@Override
	public Object clone() {
		List<String> tempList = new ArrayList<String>();
		for(String s:this.benutzerListe) {
			tempList.add(s);
		}
		return new Benutzer(tempList);		
	}
	
	
}
