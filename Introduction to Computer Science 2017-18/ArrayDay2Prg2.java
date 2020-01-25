public class ArrayDay2Prg2{
	public static void main(String[]args){

	int[]array = new int[10];

	double sum = 0;
	double num = 0;

	System.out.print("Values: ");

	for(int i = 0; i< array.length; i++){
		array[i] = i + 4;
		System.out.print(array[i] + " ");
		num++;
		sum+= array[i];
	}

	double average = (sum/num);
	System.out.println("\nAverage: " + average);

	}

}

