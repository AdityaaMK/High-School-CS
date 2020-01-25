import java.util.Scanner;

public class Methodparameters4{
	public static void main(String[]args){

	Scanner reader = new Scanner(System.in);

	System.out.print("Please enter length of base 1: ");
	Double int1 = reader.nextDouble();

	System.out.print("Please enter length of base 2: ");
	Double int2 = reader.nextDouble();

	System.out.print("Please enter height: ");
	Double int3 = reader.nextDouble();

	System.out.println(numberaverage(int1, int2, int3));

	}
	public static double numberaverage(double a, double b, double c){
		double average = (a+b)*c/2;
		return average;
	}

}