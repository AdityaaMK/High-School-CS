public class BdayArray{
	public static void main(String[]args){

	int [][] arr = new int[12][30];	/*1*/
	int m;
	int d;
	int counter=0;

	do{
		m = (int)(Math.random()*12);
		d = (int)(Math.random()*30);
		arr[m][d]+=1;
		counter++;
	}while(arr[m][d]<4);

	}
}