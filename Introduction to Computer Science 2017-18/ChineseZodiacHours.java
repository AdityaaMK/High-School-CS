import java.util.Scanner;

public class ChineseZodiacHours{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);

	System.out.print("Please enter the hour of the day: ");
	int hour = reader.nextInt();

	reader.nextLine();

	System.out.print("Please enter (A)M or (P)M: ");
	String ap = reader.nextLine();

		if((hour == 12)||(hour == 1))
		{
		if(ap.equalsIgnoreCase("A"))
		System.out.println("Your Chinese Zodiac is the Rat.");
		}

		if((hour == 2)||(hour == 3))
		{
		if(ap.equalsIgnoreCase("A"))
		System.out.println("Your Chinese Zodiac is the Ox.");
		}

		if((hour == 4)||(hour == 5))
		{
		if(ap.equalsIgnoreCase("A"))
		System.out.println("Your Chinese Zodiac is the Tiger.");
		}

		if((hour == 6)||(hour == 7))
		{
		if(ap.equalsIgnoreCase("A"))
		System.out.println("Your Chinese Zodiac is the Rabbit.");
		}

		if((hour == 8)||(hour == 9))
		{
		if(ap.equalsIgnoreCase("A"))
		System.out.println("Your Chinese Zodiac is the Dragon.");
		}

		if((hour == 10)||(hour == 11))
		{
		if(ap.equalsIgnoreCase("A"))
		System.out.println("Your Chinese Zodiac is the Snake.");
		}

		if((hour == 12)||(hour == 1))
		{
		if(ap.equalsIgnoreCase("P"))
		System.out.println("Your Chinese Zodiac is the Horse.");
		}

		if((hour == 2)||(hour == 3))
		{
		if(ap.equalsIgnoreCase("P"))
		System.out.println("Your Chinese Zodiac is the Goat.");
		}

		if((hour == 4)||(hour == 5))
		{
		if(ap.equalsIgnoreCase("P"))
		System.out.println("Your Chinese Zodiac is the Monkey.");
		}

		if((hour == 6)||(hour == 7))
		{
		if(ap.equalsIgnoreCase("P"))
		System.out.println("Your Chinese Zodiac is the Rooster.");
		}

		if((hour == 8)||(hour == 9))
		{
		if(ap.equalsIgnoreCase("P"))
		System.out.println("Your Chinese Zodiac is the Dog.");
		}

		if((hour == 10)||(hour == 11))
		{
		if(ap.equalsIgnoreCase("P"))
		System.out.println("Your Chinese Zodiac is the Pig.");
		}

	}
}
