import java.util.Scanner;
import java.lang.Math;

public class ParallelArrayDay2Prg1{
	public static void main (String[]args){

		Scanner reader = new Scanner(System.in);
		String[] players = {"Clayton Kershaw", "Jake Arrieta", "David Price", "Max Scherzer", "Chris Sale", "Dallas Keuchel", "Zack Greinke", "Corey Kluber", "Gerrit Cole"};
		String[] team = {"Dodgers", "Cubs", "Red Sox", "Nationals", "White Sox", "Astros", "Dodgers", "Indians", "Pirates"};
		int[] wins = {16, 22, 18, 14, 13, 20, 19, 9, 19};
		int[] losses = {7, 6, 5, 12, 11, 8, 3, 16, 8};
		int[] games = {33, 33, 32, 33, 31, 33, 32, 32, 32};
		double[] IP = {232.2, 229, 220.1, 228.2, 208.2, 232, 222.2, 222, 208};
		double[] k9 = {11.64, 9.28, 9.19, 10.86, 11.82, 8.38, 8.08, 9.93, 8.74};
		double[] bb9 = {1.62, 1.89, 1.92, 1.34, 1.81, 1.98, 1.62, 1.82, 1.9};
		double[] ERA = {2.13, 1.77, 2.45, 2.79, 3.41, 2.48, 1.66, 3.49, 2.6};

		int i = 0;

		int a = 0;

		System.out.print("Which player's stats would you like to research? ");
			String name1 = reader.nextLine();

			if(name1.equals("quit"))
				a = 0;
			else
				a = 1;

			while(a>0)
			{


				for(int j = 0; j < team.length; j++)
				{
					if(name1.equals(players[j]))
						i = j;
				}

				System.out.print("Which stat would you like? ");
					String stat = reader.nextLine();
					System.out.println();

				switch (stat){
					         case "Wins": System.out.println(name1+" had "+wins[i]+" wins last season.");
					break;
					         case "Losses": System.out.println(name1+" had "+losses[i]+" losses last season.");
					break;
					         case "Games": System.out.println(name1+" played in "+games[i]+" games last season.");
					break;
					         case "IP": System.out.println(name1+" had an IP of "+IP[i]+" last season.");
					break;
							 case "K/9": System.out.println(name1+" had a K/9 of "+k9[i]+" last season.");
					break;
							 case "BB/9": System.out.println(name1+" had a BB/9 of "+bb9[i]+" last season.");
					break;
							 case "ERA": System.out.println(name1+" had a ERA of "+ERA[i]+" last season.");
					break;
				}
						System.out.print("Which player's stats would you like to research? ");
							name1 = reader.nextLine();

							if(name1.equals("quit"))
								a = 0;
							else
								a = 1;
			}

	}

}

