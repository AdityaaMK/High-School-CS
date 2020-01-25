public class ArrayReview2{
	public static void main(String[]args){

	int [][] arrayTwo = new int[5][7];
	int counter = 0;
	int sum = 0;
	int temp = 0;

	for(int i=0; i<5; i++){
		for(int j=0; j<7; j++){
		counter++;
		arrayTwo[i][j] = counter;

		temp = arrayTwo[i][1];
		arrayTwo[i][1] = arrayTwo[i][5];
		arrayTwo[i][5] = temp;

		System.out.print(arrayTwo[i][j] + "\t");
		sum += arrayTwo[i][2];
		}
		System.out.println();
	}

		System.out.println("Average: "+sum/5);

	for(int i=0; i<5; i++){
		for(int j=0; j<7; j++){
			temp = arrayTwo[i][1];
			arrayTwo[i][1] = arrayTwo[i][5];
			arrayTwo[i][5] = temp;
		}
	}

	for(int i=0; i<5; i++){
		for(int j=0; j<7; j++){
			System.out.print(arrayTwo[i][j]+"\t");
		}
	System.out.println();
	}

	}
}