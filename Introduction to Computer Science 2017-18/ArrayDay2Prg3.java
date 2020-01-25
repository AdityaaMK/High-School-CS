public class ArrayDay2Prg3{
	public static void main(String[]args){

	int[] array = {1,2,3,4,5,6,7,8};

	for (int i = 0; i < array.length; i++){
		System.out.print(array[i] + " ");
	}

		System.out.println();

	for (int i = 0; i < 4; i++){
		int x = array[i];
		int y = array[7-i];
		array[i] = y;
		array[7-i] = x;
	}

	for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
	}

	}

}
