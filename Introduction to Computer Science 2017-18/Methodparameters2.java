import java.util.Scanner;

public class Methodparameters2{
	public static void main(String[]args){

	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a value for y2: ");
	Double y2 = reader.nextDouble();

	System.out.println("Enter a value for y1: ");
	Double y1 = reader.nextDouble();

	System.out.println("Enter a value for x2: ");
	Double x2 = reader.nextDouble();

	System.out.println("Enter a value for x1: ");
	Double x1 = reader.nextDouble();

	System.out.println(slope(y2, y1, x2, x1));

	}
	public static Double slope(Double a, Double b, Double c, Double d){
		Double slope = (a-b)/(c-d);
		return slope;

	}

}