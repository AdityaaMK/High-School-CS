public class StarWarsRunner{
	public static void main(String[]args){

	XWing Xwing = new XWing(100, "Adityaa", 100);

	System.out.println(Xwing.getPower());
	Xwing.setPower(999);
	System.out.println(Xwing.getPower());

	Xwing.fireCannon(Xwing.getPower());

	}
}