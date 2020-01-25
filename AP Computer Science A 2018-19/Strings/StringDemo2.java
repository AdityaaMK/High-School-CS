public class StringDemo2{
	public static void main(String[]args){

	String word = "Hello";
	String word2 = new String("Hello");
	String word3 = "Hello";
	String word4 = "abc";

	System.out.println(word == "Hello");
	System.out.println(word == word2); /*equal-equal compares memory
										locations in String literal pool*/
	System.out.println(word == word4);

	System.out.println(word.equals("Hello")); //.equals ALWAYS works
	System.out.println(word.equals(word2));

	System.out.println(word.indexOf("aa")); // -1 if doesn't exist

	System.out.println(word.charAt(3)); /*for primitive types such as
											char .equals does not exist*/

	System.out.println(word.substring(1,4)); /*inclusive starting index
											exclusive ending index*/
	System.out.println(word.substring(1,word.length())); //works fine bc exclusive
	System.out.println(word.substring(1));

		  double a=101;
		  double b=.35;
		  if(a*b == 35.35){
			System.out.println("yes");
			}
	}
}