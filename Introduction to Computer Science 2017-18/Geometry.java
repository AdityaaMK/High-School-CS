import java.util.Scanner;

public class Geometry{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);

	double pi = Math.PI;

	System.out.print("Please enter the width of the rectangle: ");
	double number1 = reader.nextDouble();

	System.out.print("Please enter the length of the rectangle: ");
	double number2 = reader.nextDouble();

	double area = number1*number2;
	System.out.println("Area of rectangle: " + round(area));

	System.out.print("Please enter the side of the square: ");
	double number3 = reader.nextDouble();

	double perimeter = number3*4;
	System.out.println("Perimeter of square: " + round(perimeter));

	System.out.print("Please enter the height of the triangle: ");
	double h = reader.nextDouble();

	System.out.print("Please enter the length of the base: ");
	double b = reader.nextDouble();

	double areatri = .5*b*h;
	System.out.println("Area of triangle: " + round(areatri));

	System.out.print("Please enter the diameter of the circle: ");
	double d = reader.nextDouble();

	double radius = .5*d;
	double circ1 = 2*pi*radius;
	System.out.println("Circumference of circle: " + round(circ1));

	System.out.print("Please enter the radius of the circle: ");
	double r = reader.nextDouble();

	double circ2 = 2*pi*r;
	System.out.println("Circumference of circle: " + round(circ2));


	}
	public static double round(double a){

	double val = (double) (Math.round(a*100))/100;
	return val;

	}
}