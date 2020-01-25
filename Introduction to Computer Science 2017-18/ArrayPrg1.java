import java.util.*;
	public class ArrayPrg1{
	public static void main(String[] arguments) {

	int[] array1 =  new int[6];

	for (int i = 0; i < array1.length; i++){
		array1[i]=(int)(Math.random()*20) + 1;
		System.out.print(array1[i]+" ");
	}

   }
 }