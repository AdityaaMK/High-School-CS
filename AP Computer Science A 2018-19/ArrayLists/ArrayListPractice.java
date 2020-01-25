import java.util.ArrayList;

public class ArrayListPractice{

	public static ArrayList array6(ArrayList<Integer> a){
		int b = a.get(0);
		int c = a.get(a.size()-1);

		a.set(0, c);
		a.set(a.size()-1, b);

		return a;
	}

	public static ArrayList array7(ArrayList<Integer> a){
		for(int i=0; i<a.size(); i++){
			if((a.get(i)%2!=0)&&(i>0)){
				int b = 2*a.get(i-1);
				a.set(i, b);
			}
		}
		return a;
	}

	public static ArrayList array7(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> c = new ArrayList<>();

		for(int i=0; i<a.size(); i++){
			c.add(a.get(i));
		}

		for(int i=0; i<b.size(); i++){
				c.add(b.get(i));
		}
		return c;
	}

	public static void main(String[]args){

	ArrayList<Integer> list = new ArrayList<>();

	for(int i=0; i<10; i++){
		int a = (int)(Math.random()*11)+10;
		list.add(a);
	}

	for(int i=0; i<list.size(); i++)
		System.out.print(list.get(i)+" ");
	System.out.println();


	for(int i=0; i<list.size(); i++){
		if(list.get(i)%2==0)
			System.out.print(list.get(i)+" ");
	}
	System.out.println();


	for(int i=0; i<list.size(); i++){
		if(list.get(i)%2==0)
			list.set(i, list.get(i)+1);
		System.out.print(list.get(i)+" ");
	}

	System.out.println();

	System.out.println(array6(list));
	System.out.println(array7(list));
	System.out.println(array7(list, list));
	}
}