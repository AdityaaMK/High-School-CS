public class testt{

	public static int rand(){
		int rand = (int)(Math.random()*10)+1;
		return rand;
	}

	public static boolean isEven(int num){
		if(num%2==0)
			return true;
		return false;
	}

	public static int[] makeArray(int x){
		int [] arr = new int [x];
		for(int i=0; i<arr.length; i++)
			arr[i] = (int)(Math.random()*10)+1;
		return arr;
	}

	public static void outputArray(int arr[]){
		for(int i=0; i<arr.length; i++)
			System.out.println("Num "+(i+1)+": "+arr[i]);
	}

	public static boolean isArrayEven(int num[]){
		int count = 0;
		for(int i=0; i<num.length; i++){
			if(num[i]%2==0)
				count++;
		}
		if(count==num.length)
			return true;
		return false;
	}

	public static boolean isMoreThanHalfEven(int num[]){
		int count = 0;
		for(int i=0; i<num.length; i++){
			//if(num[i]%2==0)
			if(isEven (num[i]))
				count++;
		}
		if(count>num.length/2)
			return true;
		return false;
	}




	public static void main(String[]args){
		int sum = rand();
		int []test = {2,2,2,2};
		outputArray(test);

		System.out.println("Are all of the values even? "+isArrayEven(test));
		System.out.println("Are more than half of the items even? "+isMoreThanHalfEven(test));
	}
}