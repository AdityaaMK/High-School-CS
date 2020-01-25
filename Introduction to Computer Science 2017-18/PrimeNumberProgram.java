public class PrimeNumberProgram{
	public static void main(String[]args){

	int p=0;
	int np=0;
	for(int x=0; x<1000; x++){

		for(int i=1; i<=31; i++){
			if(x/i==i)
			np=x;
		}
			if((x==2)||(x==3)||(x==5)||(x==7)){
			p=x;
			System.out.println(p);
		}
			if((x%2!=0)&&(x%3!=0)&&(x%5!=0)&&(x%7!=0)){
			p=x;
			System.out.println(p);
		}
	}

	//* The purpose of the first for loop was to eliminate the possibilities of composite number.
	//The first if statement allows the single digit prime numbers to be printed.
	//The second if statement allows the rest of the prime numbers up to 1000 to be printed.


	}
}