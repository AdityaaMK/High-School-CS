import java.util.Scanner;

public class Ifstatements4{
    public static void main(String[]args){
    Scanner reader = new Scanner (System.in);

    int weight = (int)(Math.random()*211)+70;

    System.out.println("Weight: "+weight+"lbs");

    System.out.print("Are you active or sedentary: ");
    String answer = reader.nextLine();

    if(answer.equals("active"))
    	System.out.println("Calories: "+15*weight);
    else
		System.out.println("Calories: "+13*weight);

    }
}
