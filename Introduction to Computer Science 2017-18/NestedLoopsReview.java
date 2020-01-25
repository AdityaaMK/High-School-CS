public class NestedLoopsReview{
	public static void main(String[]args){
	//*Practice 1

	int i=1;
	do{
		int x=0;
		while(x<i){
			System.out.print("*");
		x++;
		}
		System.out.println();
		i++;
	}while(i<5);

	System.out.println();

	//*Practice 2

	int y=0;
	do{
		int x=4;
		while(x>y){
		System.out.print("*");
		x--;
	}
	System.out.println();
	y++;
	}while(y<5);

	//*Practice 3

	i=3;
		do{
			int x=0;
			while(x<i){
				System.out.print("*");
			x++;
			}
			System.out.println();
			i+=3;
	}while(i<13);

	System.out.println();

	//*Practice 4

	for(i=1; i<+4;i++){
		for(int a=1; a<=i; a++){
			System.out.println("*");
		}
		System.out.println("X");
	}

	//*Practice 5

	System.out.println();

	for(int b=0;b<3;b++){
		int z=0;
		while(z<5){
			System.out.print("*");
			z++;
		}
			System.out.println();
		}
	System.out.println();

	//*Practice 6

	for(int c=1;c<=8;c++){
		if(c<=4){
			for(y=1;y<=c;y++)
			System.out.print("*");
		}
		if(c>4){
			for(y=0;y<8-c;y++)
			System.out.print("*");
		}
		System.out.println();
	}

	}
}