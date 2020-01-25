import java.util.*;

public class ArrayPrg3
{
	public static void main(String[] arg)
	{
		Scanner reader = new Scanner(System.in);

		int[] array1 =  new int[5];
		int sum = 0;

		for (int i = 0; i < array1.length; i++)
		{
			array1[i]=(int)(Math.random()*100) + 1;
			System.out.print(array1[i]+" ");
			sum += array1[i];
		}
			System.out.println();

			System.out.print(sum);

			System.out.println();

		int val1 = 0;
			for(int i = 1; i < 5; i++){
				if(array1[val1]>array1[(i)]);
				val1 = 1;
			}
		System.out.println("Smallest Value: "+array1[val1]);

		int val2 = 0;
			for(int i = 1; i < 5; i++){
				if(array1[val2]<array1[(i)]);
				val2 = i;
			}
		System.out.println("Largest Value: "+array1[val2]);

	}
}