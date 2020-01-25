public class DemoOne{
	public static void main (String[]args){

		int myVar = 0;

		for(int i = 0; i<10; i++)
			System.out.println("i is: "+i);

		//Q1
		int b = 0;
		int count = 0;
		for(int a = 0; a < 101; a+=2){
			b+=a;
			count++;
		}
			double c = (b/count);
			System.out.println(c);

		//Q2
		for(int i=5; i>0; i--){					//for(int i=5; i>0; i--;)
			for(int a=1; a<=i; a++){			//for(int i=j; ...
			System.out.print("*");
			}
			System.out.println();
		}

		//Q3
		int turn = 0;
		for(int i=1; i<5; i++){
			for(int a=5; a>i; a--)
			System.out.print(a);
				if(i%2==1)
					System.out.print("*");
			System.out.println();
		}

		//Q4a
		int bagels = 171;
		int gross = bagels/144;
		int rembagels = bagels%144;
		int dozen = rembagels/12;
		int singles = rembagels%12;

		System.out.println("171 bagels are "+gross+" gross "+dozen+" dozen and "+singles+" bagels");



	}
}