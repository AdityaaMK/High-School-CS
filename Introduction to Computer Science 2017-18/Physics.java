import java.util.Scanner;

public class Physics{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);


	System.out.print("Please enter the time: ");
	double t = reader.nextDouble();

	System.out.print("Please enter the initial height: ");
	double b = reader.nextDouble();

	double hf = -4.9*t*t + b;
	System.out.println("Height final: " + round(hf));

	System.out.print("Please enter the time: ");
	double t2 = reader.nextDouble();

	System.out.print("Please enter the initial velocity: ");
	double vo = reader.nextDouble();

	double vf = vo - (9.8*t2);
	System.out.println("Velocity final: " + round(vf));

	System.out.print("Please enter position x2: ");
	double x2 = reader.nextDouble();

	System.out.print("Please enter position x1: ");
	double x1 = reader.nextDouble();

	System.out.print("Please enter time b: ");
	double timeb = reader.nextDouble();

	System.out.print("Please enter time a: ");
	double timea = reader.nextDouble();


	double v = (x2-x1)/(timeb-timea);
	System.out.println("Average of velocity of particle: " + round(v));

	}
		public static double round(double a){

		double val = (double) (Math.round(a*100))/100;
		return val;

	}

}

