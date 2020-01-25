import java.util.Scanner;

public class Ifstatements{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	int number = reader.nextInt();

	int x = number%2;

	if(x==1)
		System.out.println(number+" is an odd number");
	else
		System.out.println(number+" is an even number");

	}
}