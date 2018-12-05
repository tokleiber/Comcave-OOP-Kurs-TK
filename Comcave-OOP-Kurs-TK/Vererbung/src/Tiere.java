
public class Tiere {
protected String name;
private String rasse;
private String farbe;


	//Methoden
	public void fresse() {
		System.out.println("Ich habe hunger");
	}
	
	public void belle() {
		System.out.println("wau wau");
	}
	
	public void setzeAttribute(String name, String rasse, String farbe) {
		this.name = name;
		this.rasse = rasse;
		this.farbe=farbe;
	}
	
	public void gebeAttribute() {
		System.out.println("Ich bin "+ this.name + ", ein " + this.rasse + ", meine farbe ist " + this.farbe + "." );
	}
	
	
	
	
	
	
}
