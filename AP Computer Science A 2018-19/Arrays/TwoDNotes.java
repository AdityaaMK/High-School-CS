public class TwoDNotes{

	public static void main (String[] args){

		int [][] arr = new int[4][5];
		int [][] arr2 = {{1,2,3,4},
						 {5,6,7,8}};

		//rows x cols

		for (int i=0;i<4;i++){
			for (int j=0;j<5;j++){
				arr[i][j]=j;
				System.out.print(arr[i][j]);
				}
			System.out.println();
		}

		for (int i=0;i<arr2.length;i++){
					for (int j=0;j<arr2[0].length;j++){
						System.out.print(arr2[i][j]);
					}
			System.out.println();
		}
	}
}