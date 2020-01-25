import java.util.Scanner;

public class ParallelArrayNotes{
	public static void main(String[] args){

/*
	String[] last = {"Robles", "Thakur", "Magesh", "Patel", "Suresh"};
	String[] first = {"A", "C", "K", "W", "S"};
	int[] grade = {12, 9, 9, 10, 11};
	double[] gpa = {4.0, 4.0, 3.8, 3.9, 4.0};
*/

	Scanner reader = new Scanner(System.in);
	String[] last = new String[5];
	String[] first = new String[5];
	int[] grade = new int[5];
	double[] gpa = new double[5];

	for(int j = 0; j < last.length; j++){
		System.out.println("Individial #"+(j+1));
		System.out.println("Last Name? ");
		last[j] = reader.nextLine();
		System.out.println("First Initial? ");
		first[j] = reader.nextLine();
		System.out.println("Grade Level? ");
		grade[j] = reader.nextInt();
		System.out.println("GPA? ");
		gpa[j] = reader.nextDouble();
		System.out.println();
		reader.nextLine();
	}

	for(int i = 0; i < last.length; i++){
		System.out.print(last[i]+"\t"+first[i]+"\t"+grade[i]+"\t"+gpa[i]+"\t");
		System.out.println();

	}

	}
}