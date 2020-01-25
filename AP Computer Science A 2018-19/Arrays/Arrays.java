public class Arrays{
	public static void main(String[]args){

	int[]array = new int [40];
	int odd = 1;

	for(int i=0; i<40; i++){
/*1*/	array[i] = (int)(Math.random()*31)+10;
/*2*/	array[array.length-2]=99;
/*3*/	if(array[i]%2==0)
			array[i] = array[i]-2;
/*4*/   if(i%2!=0)
			array[i]*=2;
/*5*/	if(array[i]%4==1)
			array[i]=0;
/*6*/   if(i%4==0)
			array[i]=5;
/*7*/	if(array[i]%2!=0&&odd%2!=0)
			array[i]=1;
			odd++;
		System.out.println(array[i]);
	}

	}
}