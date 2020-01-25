import java.util.Scanner;

	public class ForLoopsP1M2{
		public static void main (String [] args){
		Scanner reader = new Scanner (System.in);

		System.out.print("How many test scores would you like to input? ");
		int test = reader.nextInt();
			int random =(int)(Math.random()*101)+60;

		int o = 0;
		int s = 0;
		int us = 0;
		int score = 0;
		for(int i = 1; i <= test; i++){
		System.out.println("Please enter your test score ");
		score = reader.nextInt();
		if((score >= 90)&&(score <=100)){
		o++;
		}
		if((score >= 70)&&(score <= 89)){
		s++;
		}
		if((score >= 1)&&(score<=69)){
		us++;
		}
			}

		int w = 3;

		if(score <= 75){
			System.out.println("Enter a retake score: ");
			int retake = reader.nextInt();
			w--;
			System.out.println(w+" retakes remaining");
			}
	if(score <= 75){
				System.out.println("Enter a retake score: ");
				int retake = reader.nextInt();
				w--;
				System.out.println(w+" retakes remaining");
			}
			if(score <= 75){
							System.out.println("Enter a retake score: ");
							int retake = reader.nextInt();
							w--;
							System.out.println(w+" retakes remaining");
			}

		System.out.println("Outstanding Scores: "+o);
		System.out.println("Satisfactory Scores: "+s);
		System.out.println("Unsatisfactory Scores: "+us);







	}
}
