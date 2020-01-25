import java.util.Scanner;

public class Ifstatements2day2{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	int number = reader.nextInt();

	int x1 = number%2;
	int x2 = number%11;

	if((x1==0)&&(x2==0))
		System.out.println("\nThe number "+number+" is both even and divisible by 11.");
	else if((x1!=0)&&(x2==0))
		System.out.println("\nThe number "+number+" is not even but is divisible by 11.");
	else if((x1==0)&&(x2!=0))
		System.out.println("\nThe number "+number+" is even and but is not divisible by 11.");
	else if((x1!=0)&&(x2!=0))
		System.out.println("\nThe number "+number+" is neither even nor divisible by 11.");


	}
}