public class ArrayTwoD3{
	public static void main(String[]args){

	String[][] array3 = new String [3][3];
	int a = 0;
	String as = "*";
	for(int row=0; row<3; row++){
		for(int col=0; col<3; col++){
			if(row==1)
				as+="*";
			if(row==2)
				as+="**";
				System.out.print(as+"\t");
				as = "*";
				a++;
			if(a==3){
				System.out.print("\n");
				a=0;
			}
	}
	}

	}

}
