public class NumberGrouping implements NumberComputation{

	int [] array;

	public NumberGrouping(int [] array){
		this.array=array;
	}

	public int product(){
		int product = 1;
		//standard for loop
		for (int i = 0; i<array.length; i++)
			product*=array[i];

		//your solution should only use one loop

		product = 1;
		//for each loop
		for (int j:array)
			product *=j;

		return product;
	}

}