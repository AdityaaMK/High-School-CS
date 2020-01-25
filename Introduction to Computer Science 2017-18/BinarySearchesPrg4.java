import java.lang.Math;
import java.util.Scanner;
public class BinarySearchesPrg4{
	public static void main(String[]args){

	Scanner reader = new Scanner(System.in);
	int x = 1;
	int[] arr = new int [10];

	int points = 0;
	String point = " ";

	while(x==1){

				System.out.print("Choose a number between 1-100: ");
				int num = reader.nextInt();

				for (int i = 0; i < arr.length; i++){
					arr[i]=(int)(Math.random()*100) + 1;
				}

				for(int i = 0; i < arr.length; i++)
					System.out.print(arr[i]+" ");

					System.out.println();

				for(int i = 1; i < arr.length; i++){
				int j = i;
				while(j > 0 && arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j--;
				}

			}

				for(int k = 0; k < arr.length; k++)
					System.out.print(arr[k]+" ");
					System.out.println();

				int lo = 0;
				int hi = arr.length-1;
				int key = num;
				boolean yes = false;

				while(lo <= hi){
					int mid = (lo+hi)/2;
					if(arr[mid] == key){
						yes = true;
						break;
					}
					else if(arr[mid] < key){
						lo = mid + 1;
					}
					else if(arr[mid] > key){
						hi = mid - 1;
					}
				}

				if(yes == true){
					points++;
					if(points==1)
					System.out.println(key+" is in the array. You won. You have "+points+" point.");
					else
					System.out.println(key+" is in the array. You won. You have "+points+" points.");
				}
				else
					System.out.println(key+" is NOT in the array.");

				reader.nextLine();
				System.out.print("Do you want to play again? ");
				String answer = reader.nextLine();

				if(answer.equalsIgnoreCase("yes"))
					x = 1;
				else
					x--;

				System.out.println();

			}
	}
}