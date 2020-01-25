public class ArrayTwoD2{
	public static void main(String[]args){

	int[][] array2 = new int[5][4];

	for(int x=0; x<4; x++){
		for(int y = 0; y<5; y++){
			if(x==0)
				array2[0][0]=4;
			if(x==1)
				array2[0][1]=9;
			if(x==2)
				array2[0][2]=4;
			if(x==3)
				array2[0][3]=25;
			if(x==0&&y>=1)
				array2[y][x] = ((array2[y-1][x])*2);
			if(x==1&&y>=1)
				array2[y][x] = ((array2[y-1][x])*3);
			if(x==2&&y>=1)
				array2[y][x] = ((array2[y-1][x])*4);
			if(x==3&&y>=1)
				array2[y][x] = ((array2[y-1][x])*5);
	}
}

		int a = 0;
		for(int x = 0; x<5; x++){
			for(int y = 0; y<4; y++){
				System.out.print(array2[x][y]+"\t");
				a++;
				if(a==4){
					System.out.print("\n");
					a=0;
				}
	}
}
	System.out.println();

	}
}