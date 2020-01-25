public class NumberGroupingRunner{

	public static void main (String [] args){
		int [] array = {1,2,3,4};
		NumberGrouping group = new NumberGrouping(array);
		System.out.println(group.product());
	}


}