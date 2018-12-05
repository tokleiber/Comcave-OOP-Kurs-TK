
public class Tierheim {
// Attribute
	Hund hund1 = new Hund();
	Katze katze1 = new Katze();
//Methoden
	
	public void start() {
		//unser komplettes Programm werden wir hier schreiben
		System.out.println("Tierheim wurde geöffnet");
		oeffneTierheim();
		nehmeNeuenHundAuf();
		nehmeNeueKatzeAuf();
		schließeTierheim();
	}
		private void nehmeNeuenHundAuf() {
			hund1 = new Hund();
			hund1.setzeAttribute("Hasso", "Borde Collie", "schwarz", 'm', 80);
			System.out.println(hund1.getName()+" wurde aufgenommen");
		}
		private void nehmeNeueKatzeAuf() {
			katze1 = new Katze();
			katze1.setzeAttribute("Cat");
			System.out.println(katze1.getName()+" wurde aufgenommen");
		}
			
		private void oeffneTierheim() {	
			Tierheim dasTierheim = new Tierheim();
		}
			
		private void schließeTierheim() {
				System.out.println("Tierheim wurde geschlosssen");}
		
		
		
		
		
		
	}

