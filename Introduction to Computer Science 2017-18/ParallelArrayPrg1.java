import java.util.Scanner;
import java.lang.Math;

public class ParallelArrayPrg1{
	public static void main(String[] args){

	Scanner reader = new Scanner(System.in);
	int[] number = new int[5];
	String[] street = new String[5];
	String[] apt = new String[5];
	int[] zpc = new int[5];

	for(int j = 0; j < number.length; j++){
		System.out.println("Individial #"+(j+1));
		System.out.println("Number? ");
		number[j] = reader.nextInt();
		reader.nextLine();
		System.out.println("Street? ");
		street[j] = reader.nextLine();
		System.out.println("Apartment? If none answer with - ");
		apt[j] = reader.nextLine();
		System.out.println("Zipcode? ");
		zpc[j] = reader.nextInt();
		System.out.println();
	}

	for(int i = 0; i < number.length; i++){
		if(apt[i].equals("-"))
			System.out.print(number[i]+" "+street[i]+" "+zpc[i]);
		else
			System.out.print(number[i]+" "+street[i]+" "+apt[i]+" "+zpc[i]);
		System.out.println();

	}

	}
}