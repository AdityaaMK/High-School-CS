public class ifstatementsnotes{
	public static void main(String[]args){

		int a = 5, b = 27;

		if (a == 5)
			System.out.println("a is 5");
		//if (a != 5)
			//System.out.println("a is not 5");
		else
			System.out.println("a is not 5");

		if (b > 0){
			System.out.println("b is positive");
			System.out.println("+");
		}
		else if (b == 0)
			System.out.println("b is zero");
		else
			System.out.println("b is negative");
		System.out.println("This statement is always executed");

		String name = "Ms. Robles";
		String name2 = "Alexandria";
		String name3 = "Robles";
		String name4 = "robles";

		// == CANNOT be used to check if Strings are equal
		// The conditions we will make must be true statements as long as the two Strings are spelled and spaced the exact same way. In addition they MUST HAVE the same Capitalization.

		//1
		if(name.equals("Ms. Robles"))
			System.out.println("That's my name!");
		else
			System.out.println("That's not my name!");

		//2

	}
}