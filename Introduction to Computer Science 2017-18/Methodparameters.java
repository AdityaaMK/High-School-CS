import java.util.Scanner;

public class Methodparameters{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter first name: ");
	String firstname = reader.nextLine();

	System.out.print("Enter last name: ");
	String lastname = reader.nextLine();

	System.out.println (fullname(firstname, lastname));



	}
	public static String fullname(String a, String b){
		String name = a + b;
		return name;
	}

}
