import java.util.Scanner;

public class InitialSetUp{
	public static void main(String[] args){

// This in array is drawing up the board lines. In (xstart, ystart, xend, yend) format
		int[][]boardLine = {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};
// This sets up the array that will be used to set up the X/O grid. They are temporarily filled with hyphens until they are fiflled with x and o values.
		char [][]arr = new char[3][3];
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				arr[i][j]='-';

/*// Use This Sample Code to see if your pictures are displaying on the board.
		arr[1][1]='o';
		arr[2][2]='x';
		arr[1][2]='o';
		arr[0][0]='x';
		arr[0][1]='x';

*/
// This line imports the TicTacToeBoard file
		TicTacToeBoard board = new TicTacToeBoard(620,720);
// This sets up the grid given the lines you provided above in the boardLine array
		board.defineBoard(boardLine);
// This will set your pictures to display for the x and o values. Make sure your names match exactly what you type in the parameters.
		board.setFiles("x.png","o.jpg");
// This sets up the spacing and place values for x and o
		board.setBoard(arr);
// This will refresh the board so that new elements will display.
		board.repaint();



	}
}