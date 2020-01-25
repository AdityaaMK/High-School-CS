import java.util.Scanner;

public class Ifstatementsday2{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	int number = reader.nextInt();

	if(number<10)
		System.out.print("The number is less than 10");
	if(number==10)
		System.out.print("The number is equal to");
	if(number>10)
		System.out.print("The number is greater than 10");

	int x = number%2;

	if(x==1)
		System.out.print(" and odd.\n");
	else
		System.out.print(" and even.\n");

	}
}