public class Review3{
	public static void main(String[]args){

//1
	double x=3;
	double y=2;
	double z=1;

	x++;
	y+=2;
	z-=3;
	x--;
	y*=x;
	z/=y;

	System.out.println(x+" "+y+" "+z);

	System.out.println();

//2
	String a = "abcd";
	System.out.println(a);
	String b = "efg";
	System.out.println(b);
	String c = "h";
	System.out.println(c);
	String d = "ij";
	System.out.println(d);
	String e = "klmno";
	System.out.println(e);

//3
	int five = 5;
	int two = 2;
	int div = 5/2;
	int rem = 5%2;

	System.out.println(five+" divided by "+two+" is "+div+" with a reminder "+rem+".");

//4

	for(int g=1; g<7; g++){
		for(int h=1; h<=g; h++){
			if(g%3==0)
				System.out.print(h);
			else
				System.out.print(h+""+h);
		}
		System.out.println();
	}

//5

	int g=0;
	do{
		g++;
		int h=1;
			while(h<=g){
				if(g%3==0)
					System.out.print(h);
				else
					System.out.print(h+""+h);
					h++;
			}

		System.out.println();

	}while(g<6);

	}
}