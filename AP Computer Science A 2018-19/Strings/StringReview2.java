import java.util.ArrayList;

public class StringReview2{
	public static void main(String[]args){

/*1*/	String test = "The quick brown fox jumped over the lazy dog";
		int counter = 0;

	for(int i=0; i<test.length(); i++){
		for(char letter = 'a'; letter<='z'; letter++){
			if(test.charAt(i)==letter)
				counter++;
		}
	}
	System.out.println("There is "+counter+" lowercase letters");

/*2*/

	for(int i=0; i<test.length(); i++){
		if(test.charAt(i)==' ')
			System.out.println();
		else
			System.out.print(test.charAt(i));
	}

	System.out.println();

/*3*/

	String test2 = "";

	ArrayList<String> p1 = new ArrayList<>();

	for(int i=0; i<test.length(); i++){
		if(test.charAt(i)!=' ')
			test2 += test.charAt(i);
		if(i==test.length()-1){
			p1.add(test2);
		}
		else{
			p1.add(test2);
			test2 = "";
		}
	}

	System.out.println(p1);
}

}