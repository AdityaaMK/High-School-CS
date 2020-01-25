import java.util.Scanner;

public class NestedStatements1{
	public static void main (String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Enter the first angle (top left): ");
	int one = reader.nextInt();

	System.out.print("Enter the second angle (top right): ");
	int two = reader.nextInt();

	System.out.print("Enter the third angle (bottom left): ");
	int three = reader.nextInt();

	System.out.print("Enter the fourth angle (bottom right): ");
	int four = reader.nextInt();


	if(one==three){
		if(two==three)
			System.out.println("The shape is a rectangle. ");
		else if(two==four)
		if(one==three)
			System.out.println("The shape is a parallelogram. ");

	}
	else{
		System.out.println("The shape is a quadrilateral with no special qualities. ");

}

	}
}