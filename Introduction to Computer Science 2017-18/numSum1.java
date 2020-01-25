import java.util.Scanner;

public class numSum1
{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);

	System.out.print("Please enter the first number: ");
	int number1 = reader.nextInt();

	System.out.print("Please enter the second number: ");
	int number2 = reader.nextInt();

	int input = (number1 + number2);
	System.out.println("Sum: " + input);

	System.out.print("Please enter the third number: ");
	int number3 = reader.nextInt();

	System.out.print("Please enter the fourth number: ");
	int number4 = reader.nextInt();

	System.out.print("Please enter the fifth number: ");
	int number5 = reader.nextInt();

	System.out.println("Sum: " + numSum2(number3, number4, number5));

	System.out.print("Please enter the sixth number: ");
	int number6 = reader.nextInt();

	System.out.print("Please enter the seventh number: ");
	int number7 = reader.nextInt();

	System.out.print("Please enter the eight number: ");
	int number8 = reader.nextInt();

	System.out.print("Please enter the ninth number: ");
	int number9 = reader.nextInt();

	System.out.println("Sum: " + numSum3(number6, number7, number8, number9));

	System.out.print("Please enter the tenth number: ");
	int number10 = reader.nextInt();

	System.out.print("Please enter the eleven number: ");
	double number11 = reader.nextDouble();

	System.out.println("Sum: "+numQuot(number10, number11));

	int a = number1+number2;
	int b = number3+number4+number5;
	int c = number6+number7+number8+number9;
	double d = number10/number11;

	double avg = (a+b+c+d)/4;
	System.out.println("Average of sums: "+avg);

	}
	public static int numSum2(int a, int b, int c){
	Scanner reader = new Scanner(System.in);

	int input2 = (a + b + c);
	return input2;
	}
	public static int numSum3(int a, int b, int c, int d){
	Scanner reader = new Scanner(System.in);

	int input3 = (a + b + c + d);
	return input3;
	}
	public static double numQuot(int a, double b){
	Scanner reader = new Scanner(System.in);

	double input4 = (a/b);
	return input4;

	}
}