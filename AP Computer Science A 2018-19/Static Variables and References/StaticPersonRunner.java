import java.util.ArrayList;

public class StaticPersonRunner{
	public static void main(String[]args){

	StaticPerson p1 = new StaticPerson();
	System.out.println("*p1* "+p1);

	p1.add();
	p1.add();
	p1.add();

	System.out.println("*p1* "+p1);

	StaticPerson p2 = new StaticPerson();

	p2.add();
	p2.add();

	System.out.println("*p1* "+p1+"\n *p2* "+p2);

	System.out.println( StaticPerson.staticNumber );
	}
}