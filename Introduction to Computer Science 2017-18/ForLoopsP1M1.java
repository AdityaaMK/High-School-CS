import java.util.Scanner;

	public class ForLoopsP1M1{
		public static void main (String [] args){
		Scanner reader = new Scanner (System.in);


			int random =(int)(Math.random()*41)+60;

			int o = 0;
			int s = 0;
			int us = 0;

			for(int i = 1; i<= random; i++){
				System.out.println("Your test scores are "+i);
				int scores = (int)(Math.random()*41)+60;
				System.out.println(scores);

			if((scores >= 90)&&(scores <=100)){
			o++;
			}
			else if((scores >= 70)&&(scores <= 89)){
			s++;
			}
			else if((scores >= 1)&&(scores<=69)){
			us++;
			}
			}



			System.out.println("Outstanding Scores: "+o);
			System.out.println("Satisfactory Scores: "+s);
			System.out.println("Unsatisfactory Scores: "+us);







		}
}
