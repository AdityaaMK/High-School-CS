public class NonFictionBook extends Book
{
	private boolean nationalBook;
	private boolean carnegie;
	private boolean heartland;
	public NonFictionBook(String a, String t, String d, boolean n, boolean c, boolean h)
	{
		super(a,t,d);
		nationalBook=n;
		carnegie=c;
		heartland=h;
	}
	public boolean wonNationalBook()
	{
		return nationalBook;
	}
	public boolean wonCarnegie()
	{
		return carnegie;
	}
	public boolean wonHeartland()
	{
		return heartland;
	}
}