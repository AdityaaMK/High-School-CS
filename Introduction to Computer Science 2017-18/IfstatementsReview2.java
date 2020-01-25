import java.util.Scanner;

public class IfstatementsReview2{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	int number = reader.nextInt();

	int x1 = number%2;
	int x2 = number%3;
	int x3 = number%5;
	int x4 = number%7;
	int x5 = number%11;

	if(x1==0)
		System.out.println("\nThe number "+number+" is divisible by 2.");
	else if(x1!=0)
		System.out.println("\nThe number "+number+" is not divisible by 2.");
	if(x2==0)
			System.out.println("\nThe number "+number+" is divisible by 3.");
	else if(x2!=0)
		System.out.println("\nThe number "+number+" is not divisible by 3.");
	if(x3==0)
			System.out.println("\nThe number "+number+" is divisible by 5.");
	else if(x3!=0)
		System.out.println("\nThe number "+number+" is not divisible by 5.");
	if(x4==0)
			System.out.println("\nThe number "+number+" is divisible by 7.");
	else if(x4!=0)
		System.out.println("\nThe number "+number+" is not divisible by 7.");
	if(x5==0)
			System.out.println("\nThe number "+number+" is divisible by 11.");
	else if(x5!=0)
		System.out.println("\nThe number "+number+" is not divisible by 11.");
	}
}