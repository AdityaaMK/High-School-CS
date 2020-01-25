import java.util.ArrayList;

public class ArrayListReview{

	public static ArrayList array6(ArrayList<Integer> a){
		for(int i=0; i<a.size(); i++){
			if(a.get(i)==1){
				a.remove(i);
				i--;
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

	public static ArrayList arrayNew(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> c = new ArrayList<>();

		if(a.size() > b.size()){
			for(int i=0; i<a.size(); i++){
				if(a.get(i)>b.get(i))
					c.add(a.get(i));
				else if(a.get(i)==b.get(i))
					c.add(a.get(i));
				else if(b.get(i)>a.get(i))
					c.add(b.get(i));
				else if(i>b.size()-1)
					c.add(a.get(i));
				}
			}
		else if(b.size() > a.size()){
			for(int i=0; i<b.size(); i++){
				if(a.get(i)>b.get(i))
					c.add(a.get(i));
				else if(a.get(i)==b.get(i))
					c.add(b.get(i));
				else if(b.get(i)>a.get(i))
					c.add(b.get(i));
				else if(i>a.size()-1)
					c.add(b.get(i));
				}
			}

		return c;
	}

	public static void main(String[]args){

	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<Integer> listt = new ArrayList<>();

	for(int i=0; i<10; i++){
		int a = (int)(Math.random()*10)+1;
		list.add(a);
	}
		System.out.println(list);

		System.out.println(array6(list));
		System.out.println(array7(list, list));
		System.out.println(arrayNew(list, list));

	}
}
