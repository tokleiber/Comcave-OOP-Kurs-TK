
public class Main {

	public static void main(String[] args) {
		
		Hund Hasso= new Hund();
		Katze Mitze= new Katze();
		Vogel Papagei= new Vogel();
		
		Hasso.setzeAttribute("Hasso", "Border Collie", "schwarz");
		Mitze.setzeAttribute("Mitze", "Perser", "weiﬂ");
		
		
		
		Hasso.gebeAttribute();
		Mitze.gebeAttribute();
		
		Hasso.gebeName();
		
		Hasso.fresse();
		Hasso.belle();
		Mitze.fresse();
		Mitze.belle();
		Papagei.fresse();
		Papagei.belle();
		
		
		
	}

}
