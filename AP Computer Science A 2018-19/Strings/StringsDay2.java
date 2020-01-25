public class StringsDay2{
	public static void main(String[]args){

	String word1 = "abc";
	String word2 = "def";

	System.out.println(word1.compareTo(word2));
	System.out.println(word2.compareTo(word1));

	for(char letter = 'a'; letter<='z'; letter++)
		System.out.print(letter+" ");

		char letter = 'C';
		int charValue = (int)letter;

		System.out.print(charValue);
	}
}