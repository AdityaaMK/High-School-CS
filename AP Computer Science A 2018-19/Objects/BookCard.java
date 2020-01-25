public class BookCard{

	private String author;
	private String title;
	private int yearOfPub;

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public int getyearOfPub(){
		return yearOfPub;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setyearOfPub(int yearOfPub){
		this.yearOfPub = yearOfPub;
	}

	public void setTitle(String Title){
		this.title = Title;
	}

	public BookCard(String author, String title, int yearOfPub){
		this.author = author;
		this.title = title;
		this.yearOfPub = yearOfPub;
	}

	public String toString(){
			return "Book: "+title+" \nAuthor: "+author+" \nYear of Publication: "+yearOfPub;
	}
}