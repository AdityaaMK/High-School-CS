import java.util.*;
import java.util.Scanner;
	public class ArrayPrg2{
	public static void main(String[] arguments) {
	Scanner reader = new Scanner(System.in);

	System.out.print("Enter name: ");
	String name1 = reader.nextLine();

	System.out.print("Enter name: ");
	String name2 = reader.nextLine();

	System.out.print("Enter name: ");
	String name3 = reader.nextLine();

	System.out.print("Enter name: ");
	String name4 = reader.nextLine();

	System.out.print("Enter name: ");
	String name5 = reader.nextLine();

	System.out.print("Enter name: ");
	String name6 = reader.nextLine();

	String[] names = {name1, name2, name3, name4, name5, name6};

	for (int i = 0; i < names.length; i++){
		System.out.print(names[i]+" ");
	}

   }
 }