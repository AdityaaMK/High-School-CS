import java.util.Scanner;

public class Ifstatements2{
    public static void main(String[]args){
    Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	int x = reader.nextInt();

	System.out.print("Please enter another number: ");
	int x2 = reader.nextInt();

    if(x==x2)
    	System.out.println("\n"+x+" is equal to "+x2+".");
    if(x>x2)
    	System.out.println("\n"+x+" is larger than "+x2+".");
    if(x<x2)
    	System.out.println("\n"+x2+" is larger than "+x+".");

	}
}