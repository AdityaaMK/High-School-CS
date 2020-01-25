import java.util.Scanner;

public class IfstatementsReview3{
	public static void main(String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("Would you like (F)rench Fries or (I)ce Cream? ");
	String one = reader.nextLine();

	System.out.print("Would you like (S)oda or (L)emonade? ");
	String two = reader.nextLine();

	if(one.equalsIgnoreCase("F"))
		System.out.print("Your order is 1 French Fry ");

	if(two.equalsIgnoreCase("S"))
			System.out.print(" and 1 soda. The price is $7.75.");

	if(two.equalsIgnoreCase("L"))
			System.out.print("and 1 lemonade. The price is $9.10.");

	}
}