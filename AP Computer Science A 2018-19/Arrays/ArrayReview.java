public class ArrayReview{
	public static void main(String[]args){

	double [] arr = new double [10];	/*a*/
	int sum = 0;
	int count = 0;
	double min = Integer.MAX_VALUE;
	double max = Integer.MIN_VALUE;

	for(int i=0; i<10; i++){
		arr[i]=(int)(Math.random()*21)+5;
		sum+=arr[i];
		count++;

		if(arr[i]>max)
			max = arr[i];
		else if(arr[i]<min)
			min = arr[i];

		System.out.print(arr[i] + " ");
	}

	System.out.println();
	int avg = sum/count;
	System.out.println("Sum: "+sum);
	System.out.println("Average: "+avg);
	System.out.println("Min: "+min);
	System.out.println("Max: "+max);

										/*b*/
	double temp = 0;

	for(int i=0; i<arr.length/2; i++){
		temp = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = temp;
	}

	for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]+" ");
	}
}