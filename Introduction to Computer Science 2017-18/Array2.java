import java.lang.Math;

public class Array2{
	public static void main(String[]args){

	int[]array = new int[21];
	int m = Integer.MAX_VALUE;

	int s = 0;
	int n = 0;

		for(int x = 1; x < 21; x++){
			array[x]=(int)(Math.random()*42) + 13;
			n++;
			s+= array[x];
				if(array[x] < m){
					m = array[x];
				}
				if(x%5==0)
					System.out.println(array[x]+" ");
				else
					System.out.print(array[x]+" ");
				}

	double avg = (s/n);

	System.out.println("\nSum: \t" + s);
	System.out.println("Average: \t" + avg);
	System.out.println("Minimum Value: \t" +m);

	}
}