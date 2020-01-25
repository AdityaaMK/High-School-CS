import java.util.Scanner;
import java.lang.Math;

public class ParallelArrayPrg2{
	public static void main(String[] args){

	Scanner reader = new Scanner(System.in);
	String[] first = new String[6];
	char[] last = new char[6];
	int[] id = new int[6];
	int[] earn = new int[6];
	int[] tot = new int[6];
	int[] per = new int[6];

	for(int j = 0; j < first.length; j++){
		System.out.println("Individial #"+(j+1));
		System.out.println("First name: ");
		first[j] = reader.nextLine();
		System.out.println("Last initial: ");
		last[j] = reader.next().charAt(0);
		System.out.println("ID Number ");
		id[j] = reader.nextInt();
		System.out.println("Points Earned: ");
		earn[j] = reader.nextInt();
		System.out.println("Total Points: ");
		tot[j] = reader.nextInt();
		reader.nextLine();
		per[j] = (earn[j]/tot[j])*100;
		System.out.println();
	}

	for(int i = 0; i < first.length; i++){
		System.out.print(first[i]+" "+last[i]+" "+id[i]+" "+earn[i]+" "+tot[i]+" "+per[i]);
		System.out.println();

	}

	}
}