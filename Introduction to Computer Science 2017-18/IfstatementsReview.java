import java.util.Scanner;

public class IfstatementsReview{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Please enter a number: ");
	double n1 = reader.nextDouble();

	System.out.print("Please enter a number: ");
	double n2 = reader.nextDouble();

	System.out.print("Please enter a number: ");
	double n3 = reader.nextDouble();

	System.out.print("Please enter a number: ");
	double n4 = reader.nextDouble();

	System.out.print("Please enter a number: ");
	double n5 = reader.nextDouble();

	System.out.println("Mean: "+numberaverage(n1, n2, n3, n4, n5));

	}
	public static double numberaverage(double a, double b, double c, double d, double e){
		double average = (a+b+c+d+e)/5;
		return average;
	}
}