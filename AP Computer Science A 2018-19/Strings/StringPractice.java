public class StringPractice{
	public static void main(String[]args){

	String exampleString = "ThIs is A tEst";

	for(int i=0; i<exampleString.length(); i++)
		System.out.print(exampleString.charAt(i)); //Q1
		System.out.println();

	System.out.println(exampleString.substring(0,4)); //Q2

	for(int i=0; i<=4; i++)
		System.out.print(exampleString.charAt(i)); //Q3

	String reversedString = "";

	for(int i = exampleString.length()-1; i>=0; i--) //Q4
		reversedString += exampleString.charAt(i);
	System.out.println();

	System.out.println(reversedString);

	char [] arr = new char [exampleString.length()]; //Q5

	for(int i=0; i<exampleString.length(); i++)
		arr[i] = exampleString.charAt(i);
	for(int i=0; i<arr.length/2; i++){
		char temp = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = temp;
	}

	exampleString = "";
	for(int i=0; i<arr.length; i++)
		exampleString += arr[i];
		System.out.println(exampleString);
	}
}