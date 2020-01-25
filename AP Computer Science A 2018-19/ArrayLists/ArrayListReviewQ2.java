import java.util.ArrayList;

public class ArrayListReviewQ2{

	public static ArrayList<Integer> combineLists(ArrayList<Integer> listOne,ArrayList<Integer> listTwo){

	ArrayList<Integer> newList = new ArrayList<>();

	for (int i = 0; i<listOne.size(); i++ )
		newList.add(listOne.get(i));

	for (int i = 0; i<listTwo.size(); i++ )
		newList.add(listTwo.get(i));

	return newList;

	}


	public static void main (String[] args){

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);list1.add(2);list1.add(3);
		list2.add(4);list2.add(5);list2.add(6);

		System.out.println( combineLists(list1,list2) );

	}

}