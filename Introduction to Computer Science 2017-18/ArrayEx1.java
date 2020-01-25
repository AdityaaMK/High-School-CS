import java.util.*;
	public class ArrayEx1{
	public static void main(String[] arguments) {

	//Ex. 1A
      	int[] array = {1,2,3,4,5,6,7,8,9,10};

    	 for (int i = 0; i < array.length; i++)
    System.out.println(array[i]);

	System.out.println();

     //Ex. 1B
     int[]array2 = new int[10];
     for (int i = 0; i < array2.length; i++){
     	array2[i] = (i+1);
     	System.out.println(array2[i]);
	}

	System.out.println();

     //Example 2
	 	int[] array3 = new int[5];
	 	int sum = 0;
	 	for(int i = 0; i < array3.length; i++){
	 		array3[i] = (int)(Math.random()*11)+5;
	 		sum += array3[i];
	 		System.out.print(array3[i]+" ");
	 	}
	 	System.out.println("\n"+sum);
	String[] names = {"Adhit", "Aditya", "Karan"};

   }
 }