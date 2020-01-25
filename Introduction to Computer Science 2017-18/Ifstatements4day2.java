import java.util.Scanner;

public class Ifstatements4day2{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	int number = reader.nextInt();

	int x1 = number%2;

	if((x1!=0)&&(number>9)&&(number<100))
		System.out.println("\nYou win!");
	else if((x1!=0)&&((number<9)||(number>100)))
		System.out.println("\nYou're close.");
	else if((x1==0)&&(number>9)&&(number<100))
		System.out.println("\nYou're close.");
	else if((x1==0)&&((number<9)||(number>100)))
		System.out.println("\nYou lose.");
	}
}