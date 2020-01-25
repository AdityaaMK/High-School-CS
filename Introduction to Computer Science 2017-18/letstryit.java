import java.util.Scanner;

public class letstryit
{
	public static void main(String[]args)
	{

		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter dividend: ");
		Double dividend = reader.nextDouble();

		System.out.print("Please enter divisor: ");
		Double divisor = reader.nextDouble();

		System.out.println(numberquotient(dividend, divisor));

		System.out.print("Please enter integer 1: ");
		Double int1 = reader.nextDouble();

		System.out.print("Please enter integer 2: ");
		Double int2 = reader.nextDouble();

		System.out.print("Please enter integer 3: ");
		Double int3 = reader.nextDouble();

		System.out.print("Please enter integer 4: ");
		Double int4 = reader.nextDouble();

		System.out.print("Please enter integer 5: ");
		Double int5 = reader.nextDouble();

		System.out.println(numberaverage(int1, int2, int3, int4, int5));

		System.out.print("Please enter an integer to be raised to the fourth power: ");
		int intraised4 = reader.nextInt();

		System.out.println(numberraisedfour(intraised4));

		System.out.print("Please enter a double to be raised to the fourth power: ");
		Double doubleraised4 = reader.nextDouble();

		System.out.println(numberraisedfour(doubleraised4));

	}
	public static double numberquotient(double a, double b)
	{
		double quotient = a/b;
		return quotient;

	}
	public static double numberaverage(double a, double b, double c, double d, double e)
	{
		double average = (a+b+c+d+e)/2;
		return average;

	}
	public static int numberraisedfour(int a)
	{
		int fourthpower = (a*a*a*a);
		return fourthpower;

	}
	public static double numberraisedfour(double a)
	{
		double fourthpowers = (a*a*a*a);
		return fourthpowers;

	}
}