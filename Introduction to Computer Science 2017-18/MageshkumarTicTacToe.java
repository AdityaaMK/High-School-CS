import java.util.Scanner;
import java.lang.Math;
public class MageshkumarTicTacToe{
	public static void main(String[]args){

		Scanner reader = new Scanner(System.in);

		int[][]boardLine = {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};

		char [][]arr = new char[3][3];
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				arr[i][j]='-';

		TicTacToeBoard board = new TicTacToeBoard(620,720);

		board.defineBoard(boardLine);

		board.setFiles("x.jpg","O.png");

		board.setBoard(arr);

		board.repaint();

		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("Instructions: Input the row number and column number of your desired position when prompted to.\nTo win, you must get 3 of your character in a row.");
		System.out.print("Please select a mode 1 player (1) or 2 players (2): ");
		int a = reader.nextInt();

		if (a == 1){
			System.out.println("Single Player Mode");
			for(int x = 0; x < 9; x++){
				System.out.print("Please select a row: ");
				int b = reader.nextInt()-1;

				while((b > 2) || (b < 0)){
					System.out.print("Please enter a valid row (1-3): ");
					b = reader.nextInt()-1;
				}

				System.out.print("Please select a column: ");
				int c = reader.nextInt()-1;

				while((c > 2) || (c < 0)){
					System.out.print("Please enter a valid column (1-3): ");
					c = reader.nextInt()-1;
				}

				while((arr[b][c] == 'x') || (arr[b][c] == 'o')){
					System.out.println("That spot is taken. Try again");
					System.out.print("Please select a row: ");
					b = reader.nextInt()-1;
					while((b > 2) || (b < 0)){
						System.out.print("Please enter a valid row (1-3): ");
						b = reader.nextInt()-1;
					}
					System.out.print("Please select a column: ");
					c = reader.nextInt()-1;
					while((c > 2) || (c < 0)){
						System.out.print("Please enter a valid column (1-3): ");
						c = reader.nextInt()-1;
					}
				}

				arr[b][c] = 'x';
				board.repaint();

				if(((arr[0][0] == 'o') && (arr[0][1] == 'o') && (arr[0][2] == 'o')) || ((arr[1][0] == 'o') && (arr[1][1] == 'o') && (arr[1][2] == 'o')) || ((arr[2][0] == 'o') && (arr[2][1] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("Take an L!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][0] == 'o') && (arr[2][0] == 'o')) || ((arr[0][1] == 'o') && (arr[1][1] == 'o') && (arr[2][1] == 'o')) || ((arr[0][2] == 'o') && (arr[1][2] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("Take an L!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][1] == 'o') && (arr[2][2] == 'o')) || ((arr[0][2] == 'o') && (arr[1][1] == 'o') && (arr[2][0] == 'o'))){
					board.setWinner("Take an L!", 200, 650, 32);
					break;
				}

				if(((arr[0][0] == 'x') && (arr[0][1] == 'x') && (arr[0][2] == 'x')) || ((arr[1][0] == 'x') && (arr[1][1] == 'x') && (arr[1][2] == 'x')) || ((arr[2][0] == 'x') && (arr[2][1] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("YOU WON!!!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][0] == 'x') && (arr[2][0] == 'x')) || ((arr[0][1] == 'x') && (arr[1][1] == 'x') && (arr[2][1] == 'x')) || ((arr[0][2] == 'x') && (arr[1][2] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("YOU WON!!!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][1] == 'x') && (arr[2][2] == 'x')) || ((arr[0][2] == 'x') && (arr[1][1] == 'x') && (arr[2][0] == 'x'))){
					board.setWinner("YOU WON!!!", 200, 650, 32);
					break;
				}
				if(arr[0][0] != '-' && arr[0][1] != '-' && arr[0][2] != '-' && arr[1][0] != '-' && arr[1][1] != '-' && arr[1][2] != '-' && arr[2][0] != '-' && arr[2][1] != '-' && arr[2][2] != '-')
				{
					board.setWinner("TIE!", 170,660,80);
					break;
				}

				int cpurow = (int)(Math.random()*2);
				int cpucolumn = (int)(Math.random()*2);

				while((arr[cpurow][cpucolumn] == 'x') || (arr[cpurow][cpucolumn] == 'o')){
					cpurow = (int)(Math.random()*3);
					cpucolumn = (int)(Math.random()*3);
				}

				board.delay(1000);

				arr[cpurow][cpucolumn]='o';
				board.repaint();

				if(((arr[0][0] == 'o') && (arr[0][1] == 'o') && (arr[0][2] == 'o')) || ((arr[1][0] == 'o') && (arr[1][1] == 'o') && (arr[1][2] == 'o')) || ((arr[2][0] == 'o') && (arr[2][1] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("You Lost.", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][0] == 'o') && (arr[2][0] == 'o')) || ((arr[0][1] == 'o') && (arr[1][1] == 'o') && (arr[2][1] == 'o')) || ((arr[0][2] == 'o') && (arr[1][2] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("You Lost.", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][1] == 'o') && (arr[2][2] == 'o')) || ((arr[0][2] == 'o') && (arr[1][1] == 'o') && (arr[2][0] == 'o'))){
					board.setWinner("You Lost.", 200, 650, 32);
					break;
				}

				if(((arr[0][0] == 'x') && (arr[0][1] == 'x') && (arr[0][2] == 'x')) || ((arr[1][0] == 'x') && (arr[1][1] == 'x') && (arr[1][2] == 'x')) || ((arr[2][0] == 'x') && (arr[2][1] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("You Won.", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][0] == 'x') && (arr[2][0] == 'x')) || ((arr[0][1] == 'x') && (arr[1][1] == 'x') && (arr[2][1] == 'x')) || ((arr[0][2] == 'x') && (arr[1][2] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("You Won.", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][1] == 'x') && (arr[2][2] == 'x')) || ((arr[0][2] == 'x') && (arr[1][1] == 'x') && (arr[2][0] == 'x'))){
					board.setWinner("]You Won.", 200, 650, 32);
					break;
				}
				if(arr[0][0] != '-' && arr[0][1] != '-' && arr[0][2] != '-' && arr[1][0] != '-' && arr[1][1] != '-' && arr[1][2] != '-' && arr[2][0] != '-' && arr[2][1] != '-' && arr[2][2] != '-')
				{
					board.setWinner("TIE!", 170,660,80);
					break;
				}
			}
			board.showText(true);
		}

		else if (a == 2){
			System.out.println("Two Player Mode");
			for(int x = 0; x < 9; x++){
				System.out.print("Player 1, please select a row: ");
				int rowinput1 = reader.nextInt()-1;

				while((rowinput1 > 2) || (rowinput1 < 0)){
					System.out.print("Please enter a valid row (1-3): ");
					rowinput1 = reader.nextInt()-1;
				}

				System.out.print("Player 1, please select a column: ");
				int columninput1 = reader.nextInt()-1;

				while((columninput1 > 2) || (columninput1 < 0)){
					System.out.print("Please enter a valid column (1-3): ");
					columninput1 = reader.nextInt()-1;
				}

				while((arr[rowinput1][columninput1] == 'x') || (arr[rowinput1][columninput1] == 'o')){
					System.out.println("That spot is taken. Try again");
					System.out.print("Player 1, please select a row: ");
					rowinput1 = reader.nextInt()-1;
					while((rowinput1 > 2) || (rowinput1 < 0)){
						System.out.print("Please enter a valid row (1-3): ");
						rowinput1 = reader.nextInt()-1;
					}
					System.out.print("Player 1, please select a column: ");
					columninput1 = reader.nextInt()-1;
					while((columninput1 > 2) || (columninput1 < 0)){
						System.out.print("Please enter a valid column (1-3): ");
						columninput1 = reader.nextInt()-1;
					}
				}

				arr[rowinput1][columninput1] = 'x';
				board.repaint();

				if(((arr[0][0] == 'o') && (arr[0][1] == 'o') && (arr[0][2] == 'o')) || ((arr[1][0] == 'o') && (arr[1][1] == 'o') && (arr[1][2] == 'o')) || ((arr[2][0] == 'o') && (arr[2][1] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("Player Two Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][0] == 'o') && (arr[2][0] == 'o')) || ((arr[0][1] == 'o') && (arr[1][1] == 'o') && (arr[2][1] == 'o')) || ((arr[0][2] == 'o') && (arr[1][2] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("Player Two Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][1] == 'o') && (arr[2][2] == 'o')) || ((arr[0][2] == 'o') && (arr[1][1] == 'o') && (arr[2][0] == 'o'))){
					board.setWinner("Player Two Won!", 200, 650, 32);
					break;
				}
				else
					board.setWinner("Issa a tie!!", 200, 650, 32);

				if(((arr[0][0] == 'x') && (arr[0][1] == 'x') && (arr[0][2] == 'x')) || ((arr[1][0] == 'x') && (arr[1][1] == 'x') && (arr[1][2] == 'x')) || ((arr[2][0] == 'x') && (arr[2][1] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("Player One Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][0] == 'x') && (arr[2][0] == 'x')) || ((arr[0][1] == 'x') && (arr[1][1] == 'x') && (arr[2][1] == 'x')) || ((arr[0][2] == 'x') && (arr[1][2] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("Player One Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][1] == 'x') && (arr[2][2] == 'x')) || ((arr[0][2] == 'x') && (arr[1][1] == 'x') && (arr[2][0] == 'x'))){
					board.setWinner("Player One Won!", 200, 650, 32);
					break;
				}
				if(arr[0][0] != '-' && arr[0][1] != '-' && arr[0][2] != '-' && arr[1][0] != '-' && arr[1][1] != '-' && arr[1][2] != '-' && arr[2][0] != '-' && arr[2][1] != '-' && arr[2][2] != '-')
				{
					board.setWinner("TIE!", 170,660,80);
				    break;
				}

				System.out.print("Player 2, please select a row: ");
				int rowinput2 = reader.nextInt()-1;

				while((rowinput2 > 2) || (rowinput2 < 0)){
					System.out.print("Please enter a valid row (0-2): ");
					rowinput2 = reader.nextInt()-1;
				}

				System.out.print("Player 2, please select a column: ");
				int columninput2 = reader.nextInt()-1;

				while((columninput2 > 2) || (columninput2 < 0)){
					System.out.print("Please enter a valid column (0-2): ");
					columninput2 = reader.nextInt()-1;
				}

				while((arr[rowinput2][columninput2] == 'x') || (arr[rowinput2][columninput2] == 'o')){
					System.out.println("That spot is already taken. Please try again");
					System.out.print("Player 2, please select a row: ");
					rowinput2 = reader.nextInt()-1;
					while((rowinput2 > 2) || (rowinput2 < 0)){
						System.out.print("Please enter a valid row (0-2): ");
						rowinput2 = reader.nextInt()-1;
					}
					System.out.print("Player 2, please select a column: ");
					columninput2 = reader.nextInt()-1;
					while((columninput2 > 2) || (columninput2 < 0)){
						System.out.print("Please enter a valid column (0-2): ");
						columninput2 = reader.nextInt()-1;
					}
				}

				arr[rowinput2][columninput2] = 'o';
				board.repaint();

				if(((arr[0][0] == 'o') && (arr[0][1] == 'o') && (arr[0][2] == 'o')) || ((arr[1][0] == 'o') && (arr[1][1] == 'o') && (arr[1][2] == 'o')) || ((arr[2][0] == 'o') && (arr[2][1] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("Player Two Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][0] == 'o') && (arr[2][0] == 'o')) || ((arr[0][1] == 'o') && (arr[1][1] == 'o') && (arr[2][1] == 'o')) || ((arr[0][2] == 'o') && (arr[1][2] == 'o') && (arr[2][2] == 'o'))){
					board.setWinner("Player Two Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'o') && (arr[1][1] == 'o') && (arr[2][2] == 'o')) || ((arr[0][2] == 'o') && (arr[1][1] == 'o') && (arr[2][0] == 'o'))){
					board.setWinner("Player Two Won!", 200, 650, 32);
					break;
				}

				if(((arr[0][0] == 'x') && (arr[0][1] == 'x') && (arr[0][2] == 'x')) || ((arr[1][0] == 'x') && (arr[1][1] == 'x') && (arr[1][2] == 'x')) || ((arr[2][0] == 'x') && (arr[2][1] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("Player One Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][0] == 'x') && (arr[2][0] == 'x')) || ((arr[0][1] == 'x') && (arr[1][1] == 'x') && (arr[2][1] == 'x')) || ((arr[0][2] == 'x') && (arr[1][2] == 'x') && (arr[2][2] == 'x'))){
					board.setWinner("Player One Won!", 200, 650, 32);
					break;
				}
				else if(((arr[0][0] == 'x') && (arr[1][1] == 'x') && (arr[2][2] == 'x')) || ((arr[0][2] == 'x') && (arr[1][1] == 'x') && (arr[2][0] == 'x'))){
					board.setWinner("Player One Won!", 200, 650, 32);
					break;
				}
				if(arr[0][0] != '-' && arr[0][1] != '-' && arr[0][2] != '-' && arr[1][0] != '-' && arr[1][1] != '-' && arr[1][2] != '-' && arr[2][0] != '-' && arr[2][1] != '-' && arr[2][2] != '-')
				{
					board.setWinner("TIE!", 170,660,80);
				    break;
				}

			}

			board.showText(true);

		}

	}

}
