public class ArrayTwoD{
	public static void main(String[]args){

	int[][] array1 = new int[4][6];

	int sum = 0;
	int max = array1[0][0];
	int min = array1[0][0];

	for(int a = 0; a<4; a++){
		for(int b = 0; b<6; b++){
			array1[a][b] = ((int)(Math.random()*71)+7);
			sum+=array1[a][b];
			System.out.print(array1[a][b]+" ");
			if(array1[a][b]>max)
				max=array1[a][b];
			if(array1[a][b]<min)
				min=array1[a][b];
		}
		System.out.println();
	}

	System.out.println("Sum: "+sum);
	System.out.println("Max: "+max);
	System.out.println("Min: "+min);

	}
}
