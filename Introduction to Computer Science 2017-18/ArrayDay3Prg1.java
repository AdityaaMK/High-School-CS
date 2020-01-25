public class ArrayDay3Prg1{
	public static void main (String[]args){

	int[] array1 =  new int[6];
	int[] n = {1, 2, 3, 4, 5, 6};

	for (int i = 0; i < n.length; i++){
		n[i]=(int)(Math.random()*20) + 1;
	System.out.print(n[i]+" ");
	}

	System.out.println();

	int temp = n[3];
	n[3] = n[4];
	n[4] = temp;

	for(int i = 0; i < n.length; i++){
		System.out.print(n[i]+" ");
	}

}
}