import java.util.ArrayList;

public class ArrayListDemo{
	public static void main(String[]args){

	ArrayList<Integer> list = new ArrayList<>();

	System.out.println(list.size());


	for(int i=1; i<=10; i++)
		list.add(i);

	for(int i=0; i<list.size(); i++)
		System.out.print(list.get(i)+" ");
	System.out.println();

	System.out.println(list);

	list.add(1, -1); //adds -1 after 1 and the other numbers are shifted over to the right
	System.out.println(list);

	list.set(2, -2); //replaces the 2 with -2
	System.out.println(list);

	list.remove(4); //removes the 4
	System.out.println(list);

	System.out.println(list.remove(4));
	System.out.println(list);

	list.add(4, list.remove(2)); //removes number from 2 spot and adds it as 4 element
	System.out.println(list);

	}
}
