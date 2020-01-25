import java.util.ArrayList;

public class StaticPerson{

	public int number = 0;
	public static int staticNumber = 0;

	public void add(){
		number++;
		staticNumber++;
	}


	public String toString(){
		return "number is: "+number+"\n"
		+"static number is: "+staticNumber+"\n";

	}

}