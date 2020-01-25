public class FictionBook extends Book
{
	private boolean booker;
	private boolean nobel;
	private boolean penFaulkner;
	public FictionBook(String a, String t, String d, boolean b, boolean n, boolean p)
	{
		super(a,t,d);
		booker=b;
		nobel=n;
		penFaulkner=p;
	}
	public boolean wonBooker()
	{
		return booker;
	}
	public boolean wonNobel()
	{
		return nobel;
	}
	public boolean wonPenFaulkner()
	{
		return penFaulkner;
	}
}