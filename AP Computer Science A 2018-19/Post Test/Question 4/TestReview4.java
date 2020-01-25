public class TestReview4
{
	public static String recur(String s)
	{
		if(s.length()<=0)
			return "";
		if(s.toUpperCase().charAt(0)=='D' || s.toUpperCase().charAt(0)=='T')
		{
			return ""+s.charAt(0)+s.charAt(0)+recur(s.substring(1));
		}
	    return ""+s.charAt(0)+recur(s.substring(1));
	}
	//This is an alternate solution!!!!
	public static String recur2(String s)
	{
		if(s.length()<=0)
			return "";
		if(s.toUpperCase().substring(0,1).equals("D") || s.toUpperCase().substring(0,1).equals("T"))
		{
			return s.substring(0,1)+s.substring(0,1)+recur(s.substring(1));
		}
	    return s.substring(0,1)+recur(s.substring(1));
	}

	public static void main(String args[])
	{
		String sent="The five boxing wizards jump quickly";
		System.out.println(sent);
		System.out.println(recur(sent));
		//This is an alternate solution
		System.out.println(recur2(sent));
	}
}