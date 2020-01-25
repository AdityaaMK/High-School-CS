import java.util.ArrayList;

public class ObjectPractice{
	//this is the "runner" or "client class"



	public static void main(String[]args){
		//instantiating
		BookCard bookCard = new BookCard("a", "b", 1);

		BookCard bookCard2 = new BookCard("Rowling", "Harry Potter", 1997);
		BookCard bookCard3 = new BookCard("Wharton", "Ethan Frome", 1911);
		BookCard bookCard4 = new BookCard("Shakespeare", "Romeo and Juliet", 1597);
		BookCard bookCard5 = new BookCard("Cather", "My Antonia", 1918);
		BookCard bookCard6 = new BookCard("Hawthorne", "The Scarlet Letter", 1850);

		System.out.println(bookCard.getAuthor());
		bookCard.setAuthor("New");
		bookCard.setyearOfPub(1998);

		System.out.println(bookCard.getyearOfPub());

		System.out.println(bookCard.getAuthor());
		System.out.println();
		//System.out.println(bookCard.getTitle());
		//System.out.println(bookCard.getyearOfPub());

		ArrayList<BookCard> list = new ArrayList<>();
		list.add(bookCard2);
		list.add(bookCard3);
		list.add(bookCard4);
		list.add(bookCard5);
		list.add(bookCard6);

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getAuthor());
			System.out.println();
		}

		System.out.println();

		ArrayList<String> author = new ArrayList<>();
		ArrayList<String> title = new ArrayList<>();
		ArrayList<Integer> yearOfPub = new ArrayList<>();

		author.add("Author 1");
		author.add("Author 2");
		author.add("Author 3");
		author.add("Author 4");
		author.add("Author 5");

		title.add("a");
		title.add("b");
		title.add("c");
		title.add("d");
		title.add("e");

		yearOfPub.add(2001);
		yearOfPub.add(2002);
		yearOfPub.add(2003);
		yearOfPub.add(2004);
		yearOfPub.add(2005);

		for(int i=0; i<5; i++){
			int titleNo = (int)(Math.random()*5);
			int authorNo = (int)(Math.random()*5);
			int yearOfPubNo = (int)(Math.random()*5);
			BookCard combinedBookCard = new BookCard(author.get(authorNo), title.get(titleNo), yearOfPub.get(yearOfPubNo));
			System.out.println(combinedBookCard);
			System.out.println();
		}

	}
}