public class Newton{
	public static void main(String[] args){
	
	int i = 0;
	int y = (int)(Math.random()*256)+45;
	int initial = (y/2);
	doubleiteration1 = ((((double)(y)/(initial))+initial) / 2.0);
	i++;
	
	System.out.println("Value to estimate square root: " + y);
	System.out.println("Initial Guess: " +initial);
	System.out.println("Step 1: " + iteration1); 
	
	double x1 = iteration1;
	double iteration2 = ((((double)(y)/(x1))+x1) / 2.0);
	System.out.println("Step 2: " + iteration2);
	i++;
	
	double x2 = iteration2;
	double iteration3 = ((((double)(y)/(x2))+x2) / 2.0);
	System.out.println("Step 3: " + iteration3);
	i++;
	
	double x3 = iteration3;
	double iteration4 = ((((double)(y)/(x3))+x3) / 2.0);
	System.out.println("Step 4: " + iteration4);
	i++;
	
	double x4 = iteration4;
	double iteration5 = ((((double)(y)/(x4))+x4) / 2.0);
	System.out.println("Step 5: " + iteration5);
	i++;
	
	double x5 = iteration5;
	double iteration6 = ((((double)(y)/(x5))+x5) / 2.0);
	System.out.println("Step 6: " + iteration6);
	i++;
	
	double x6 = iteration6;
	double iteration7 = ((((double)(y)/(x6))+x6) / 2.0);
	System.out.println("Step 7: " + iteration7 + "\n");
	i++;
	
	System.out.println("Best estimate after " + i + " iterations: " + iteration7);
	
	}
}