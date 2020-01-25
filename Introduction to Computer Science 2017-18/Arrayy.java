public class Arrayy{
	public static void main (String[]args){

	int a = 3;
	int b = 5;

	for (int i = 0; i < 1; i++){
		System.out.print(a+" "+b);
	}

	System.out.println();

	int temp = a;
	a = b;
	b = temp;

	for(int i = 0; i < 1; i++){
		System.out.print(a+" "+b);
	}

}
}