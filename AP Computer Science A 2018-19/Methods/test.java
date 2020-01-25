public class test{
	public static void main(String[]args){

	int x = 0;
	int y;

	do{
		x++;
		y = 1;
			while(y<=x){
			if(x%3==0)
				System.out.print(y);
			else
				System.out.print(y+""+y);

			y++;
		}
		System.out.println();

	}while(x<6);

	}
}