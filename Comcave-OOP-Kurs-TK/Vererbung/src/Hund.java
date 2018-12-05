
public class Hund extends Tiere {
 public void belle() {
	 System.out.println("Wuff wuff ");
 }

 public void gebeName() {
	 System.out.println(super.name);
 }

public void gebeAttribute() {
	super.gebeAttribute();
	belle();
}

}
