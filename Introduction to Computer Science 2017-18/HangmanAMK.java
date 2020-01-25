import java.util.Scanner;

public class HangmanAMK{
	public static void main(String[]args){
    	Scanner reader = new Scanner(System.in);

    	int times = 1;
   	while(times == 1){
    	String[] w = {"father", "daughter", "mother", "son", "uncle", "friend", "brother", "sister", "child", "grandpa"}; //set of 10 words
    	int a = (int)(Math.random()*10)+ 1;	//Randomly selects one word from String array
     	String word = "";
    	switch(a){
        	case 1: word = w[0];
            	break;
        	case 2: word = w[1];
            	break;
        	case 3: word = w[2];
            	break;
            case 4: word = w[3];
			    break;
			case 5: word = w[4];
			    break;
			case 6: word = w[5];
            	break;
            case 7: word = w[6];
				break;
			case 8: word = w[7];
				break;
			case 9: word = w[8];
            	break;
            case 10: word = w[9];
				break;
    	}

	System.out.print("Welcome to Hangman! You will guess a letter and try to have it match a letter from a random 6 letter word.");	//User-friendly interface
	System.out.print("If you guess correctly the letter you guess will show up on the screen. If you guess incorrectly you will have an incorrect guess.");
	System.out.print("When you have 6 wrong guesses you will lose the game. If you guess all the letters before you have 6 wrong guesses you will win!");
	System.out.println("Lastly, if you guess something you have guessed before you will lose a turn!");

	int t = 0;	//number of times a letter was guessed
	int wguesses = 0; //wrong guesses
	int right = 0; //correct guesses
	char[] board = new char[6]; //array used to print everything out
	char[] g = new char[12];	//all guesses so far
	for(int i = 0; i < board.length; i++) //fill the array with blanks to start
    	board[i] = '-';
    	boolean win = false; //if i win
    	boolean lose = false; //if i lose
    	while(!win && !lose){ //while loop for the game
    	System.out.println("\n"+wguesses+" incorrect guesses"); //prints out how many wrong guesses
    	System.out.println("\n"+right+" correct guesses\n"); //prints out how many correct guesses
    	System.out.print("Previous guesses: "); //prints out previous guesses
    	for(int i = 0; i < t; i++){ //prints out array
        	System.out.print(g[i]+" ");
    	}

    	System.out.println();
    	for(int i = 0; i < board.length; i++)
        	System.out.print(board[i]+" ");
    	System.out.println();
    	System.out.print("Enter a guess: "); //Allows user to enter a guess
        	String ab = reader.nextLine();
    	g[t] = ab.charAt(0); //Enters guess into char array
    	for(int i = 0; i < word.length(); i++){	//checks to see if guess matches anything in the word
        	if(g[t] == word.charAt(i))
            	board[i] = g[t]; //if it matches it will put the guess into correct spot in array
    	}

    	if(g[t] != word.charAt(0) && g[t] != word.charAt(1) && g[t] != word.charAt(2) && g[t] != word.charAt(3) && g[t] != word.charAt(4) && g[t] != word.charAt(5)) //checks to see if guess is incorrect
        	wguesses++; //if incorrect it adds the guess to the wrong guess count
    	right = 0; //resets count
    	for(int i = 0; i < 6; i++){	//checks if letters match word
        	if(board[i] == word.charAt(i))
            	right++; //increases the correct letter amount
    	}
    	if(right == 6) //if all letters are right you win
        	win = true;
    	if(wguesses == 6) //if you have 6 wrong guesses you lose
        	lose = true;
    	t++; //inreases the letters guessed count
	}

	System.out.println();
	if(right == 6){	//winner method
    	Winner(board);
    }
	if(wguesses == 6){ //loser method
    	Loser(board);
    	System.out.println("The word was "+word);
    }
	System.out.print("Do you want to play again? ");
	String play = reader.nextLine();
	System.out.println();
	if(play.equalsIgnoreCase("yes")){
  		times = 1;
	}
	else
  		times = 0;

	}
}
	//two elaborated additional methods. prints out winner or loser in ASCII art
	public static void Winner(char[] b){	//winning method
    	for(int i = 0; i < b.length; i++)	//print out word
        	System.out.print(b[i]+" ");	//winner display
    	 	System.out.println("\n");
        	System.out.println("\\ \\	/ /_)_ _  _ _  ___ _ _");
        	System.out.println(" \\ \\/\\/ /| | ' \\| ' \\/ -_) '_|");
        	System.out.println("  \\_/\\_/ |_|_||_|_||_\\___|_|");
   	}
	public static void Loser(char[] b){ //losing method
    	for(int i = 0; i < b.length; i++) //prints out board
        	System.out.print(b[i]+" "); //loser display
    	 	System.out.println("\n");
        	System.out.println(" _ ");
        	System.out.println("| |   ___ ___ ___ _ _");
        	System.out.println("| |__/ _ (_-</ -_) '_|");
        	System.out.println("|____\\___/__/\\___|_|");
 	}

}

