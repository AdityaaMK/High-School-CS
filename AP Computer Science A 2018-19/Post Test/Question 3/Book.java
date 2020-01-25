public class Book
{
	private String author;
	private String title;
	private String date;
	public Book(String a, String t, String d)
	{
		author=a;
		title=t;
		date=d;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{
		return title;
	}
	public String getDate()
	{
		return date;
	}
}