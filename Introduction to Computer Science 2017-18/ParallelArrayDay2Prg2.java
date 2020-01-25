import java.util.Scanner;
import java.lang.Math;

public class ParallelArrayDay2Prg2{
	public static void main (String[]args){

		Scanner reader = new Scanner(System.in);

		System.out.print("How many inputs do you want? ");
		int input = reader.nextInt();

		String[] names = new String[input];		int[] age = new int[input];
		int[] heightft = new int[input];
		int[] heightin = new int[input];
		int[] weight = new int[input];

		int avgage = 0;
		int avgheightft = 0;
		int avgheightin = 0;
		int avgweight = 0;

		for(int j = 0; j < names.length; j++){
				System.out.println("Individial #"+(j+1));
				System.out.println("Name? ");
				names[j] = reader.nextLine();
				System.out.println("Age? ");
				age[j] = reader.nextInt();
				System.out.println("Height in feet? ");
				heightft[j] = reader.nextInt();
				System.out.println("Height in inches? ");
				heightin[j] = reader.nextInt();
				System.out.println("Weight? ");
				weight[j] = reader.nextInt();
				System.out.println();

				avgage += age[j];
				avgheightft += heightft[j];
				avgheightin += heightin[j];
				avgweight += weight[j];
	}

		System.out.println("Average age: "+(avgage/input)+" yrs "+"\nAverage height: "+(avgheightft/input)+" ft "+(avgheightin/input)+" in "+"\nAverage weight:"+(avgheightft/input)+" ft "+(avgweight/input));

	}

}

