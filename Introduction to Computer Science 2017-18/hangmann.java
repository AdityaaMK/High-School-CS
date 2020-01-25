import java.util.Scanner;

public class hangmann{

	static String[] words = {"father", "daughter", "mother", "son", "uncle", "friend", "brother", "sister", "child", "grandpa"};
	static String word = words[(int)(Math.random()*words.length-1)]; //selects my word displayed on the board randomly
	static String dash = new String(new char[word.length()]).replace("\0", "-");
	static int count = 6; //static variables make it easier for me to access it through any methods
	static int correctguesses = 0;
	static int times = 10;

	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);

		do{
		while (count != 0 && dash.contains("-")){
			System.out.println("Guess any letter that might be in the word");
			System.out.println(dash);
			String guess = reader.next();
			hang(guess);
		}
		reader.close();
	}
	}while(times == 10);

	public static void hang(String guess){ //method checks what my user enters and uses it to determine whether to move on, replace anything, or deduct the number of tries the user has
		String newdash = "";
		int x = 0;
		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i) == guess.charAt(0)){
				newdash += guess.charAt(0);
				correctguesses++;
				System.out.println("Correct guesses:"+correctguesses+"\nIncorrect guesses"+count);
				System.out.println("Misses Left: "+count+"\nLetters guessed: "+newdash);
			}
			else if (dash.charAt(i) != '-'){ //default option when it does not equal to the "incorrect" value, therefore adds it on
				newdash += word.charAt(i);
			}
			else{
				newdash += "-"; //adds on the underscore every time
			}
			if (word.charAt(i) != guess.charAt(0)){
				x++;
				if(x==word.length()){
					count--;
					System.out.println("Correct guesses:"+correctguesses+"\nIncorrect guesses"+count);
					System.out.println("Misses Left: "+count+"\nLetters guessed: "+newdash);
				}
			}
		}

		if (guess!=(newdash))
			dash = newdash;

		if (dash.equals(word))
			System.out.println("Correct! You win! The word was " + word);

		else if (count==0)
			System.out.println("You've been hung! The word was " + word);
	}
}
