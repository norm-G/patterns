package programmingPattern.erzeugermuster.singleton;



public class King {

		private String name;
		
		private static King ourKing;
		
		private King() {
			
		}
		
		public static King getInstance() {
			if(ourKing== null){
				ourKing = new King();
			}
			return ourKing;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String angriff() {
			return ""+this.name+" befiehlt den Angriff!";
		}
		
		public String rueckzug() {
			return ""+this.name+" befiehlt den Rückzug!";
		}
}
