public class testa{
	public static void main(String[]args){

	int [] arr = new int [10];
	int temp;

	for(int i=0; i<10; i++){
		arr[i]=(int)(Math.random()*10)+1;
		System.out.print(arr[i]+"\t");

	}
	System.out.println();

	for(int i=0; i<10; i++){
		if(arr[i]%2==0&&i!=0){
			temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}
	}

	for(int i=0; i<10; i++)
		System.out.print(arr[i]+"\t");








	System.out.println();

	int [][] arrr = new int[4][4];
	int counter = 0;

	for(int y=0; y<4; y++){
		for(int x=0; x<4; x++){
			counter++;
			arrr[0][x]=x+1;
			arrr[y][0]=y+1;
		}
		System.out.println();
	}

	for(int y=0; y<4; y++){
		for(int x=0; x<4; x++){
			arrr[y][x] = arrr[0][x]*arrr[y][0];
			System.out.print(arrr[y][x]+"\t");
		}
		System.out.println();
	}



	int tempp;

		for(int x=0; x<2; x++){
			temp = arrr[1][x];
			arrr[1][x] = arrr[1][4-x-1];
			arrr[1][4-x-1] = temp;
	}

	for(int x=0; x<2; x++){
			temp = arrr[3][x];
			arrr[3][x] = arrr[3][4-x-1];
			arrr[3][4-x-1] = temp;
	}

	System.out.println();

	for(int y=0; y<4; y++){
		for(int x=0; x<4; x++){
			System.out.print(arrr[y][x]+"\t");
		}
		System.out.println();
	}

	}
}