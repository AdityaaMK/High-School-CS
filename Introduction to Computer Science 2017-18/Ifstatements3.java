import java.util.Scanner;

public class Ifstatements3{
    public static void main(String[]args){
    Scanner reader = new Scanner (System.in);

    System.out.print("Please enter a number: ");
    double n = reader.nextInt();
    reader.nextLine();

    System.out.print("Would you like to (a)dd 2, (s)ubtract 2, (m)ultiply by 2, (d)ivide by 2, or (r)aise to the 2nd power: ");
    String answer = reader.nextLine();

    double a = n+2;
    double s = n-2;
    double m = n*2;
    double d = n/2;
    double r = n*n;

    if(answer.equals("a"))
    	System.out.println("The result when adding "+n+" by 2 is "+a+".");

    if(answer.equals("s"))
    	System.out.println("The result when subtracting "+n+" by 2 is "+s+".");

    if(answer.equals("m"))
    	System.out.println("The result when multiplying "+n+" by 2 is "+m+".");

    if(answer.equals("d"))
    	System.out.println("The result when dividing "+n+" by 2 is "+d+".");

    if(answer.equals("r"))
    	System.out.println("The result when raising "+n+" to the second power is "+r+".");

    }
}