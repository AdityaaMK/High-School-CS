public class StringRecursion{

	public static String methodOne(String s){

		if (s.length()==0)
			return "";
		if (s.length()/2 < 2)
			return Character.toString(s.charAt(s.length()-1));
		return s.charAt(s.length()/2)+methodOne(s.substring(1));

	}

	public static void methodTwo(String s){
		if (s.length()>=7){
			System.out.println("DONE");
			return;
		}
		System.out.println(s);
		methodTwo(s+s.charAt(0));
	}

	public static void methodThree(String s){
		if (s.length()>=7){
			System.out.println("DONE");
			return;
		}
		methodThree(s+s.charAt(0));
		System.out.println(s);
	}

	public static void main (String [] args){

		//Example 1
		System.out.println(methodOne("abcdef"));
		System.out.println(methodOne("a"));
		System.out.println(methodOne("abc"));
		System.out.println();

		//Example 2
		methodTwo("ABC");
		System.out.println();


		//Example 3
		//Example 3 is different from Example 2.
		//Please take your time and think about the how the difference will change the output.
		methodThree("ABC");
		System.out.println();

	}


}