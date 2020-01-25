public class MethodNotes{

	public static void printName(){
		System.out.println("Mr. Schiff");
	}

	public static void showSum(int j, int k){
		int sum = j+k;
		System.out.println(sum);
	}

	public static int addNumbers(int j, int k){
		//int sum = j+k;
		//return sum;
		return j+k;
	}

	public static int [] fillArray(int j, int k, int schiff){
		int [] arr = {j,k,schiff};
		return arr;
	}

	public static boolean isEven(int i){
		//if(i%2==0)
		//	return true;
		//return false;

		return(i%2==0);
	}

	public static boolean isEven(int i, int j){
		if(i%2==0&&j%2==0)
			return true;
		return false;
	}

	public static void main(String[]args){
		printName();
		showSum(5,7);
		int sum = addNumbers(5,5);
		System.out.println(sum);
		int [] arr = fillArray(1,2,3);

		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		System.out.println();

		System.out.println(isEven(10));
		System.out.println(isEven(10,11));
	}

}