import java.util.ArrayList;
public class Deck{

	private ArrayList<Card> list;
	private ArrayList<Card> list2;
	private ArrayList<Card> list3;
	private ArrayList<Card> newList;
	private ArrayList<Card> getHand;
	private int value;
	private String suit;
	private String S;

	public Deck(){

		list = new ArrayList<>();

		for(int i=1; i<5; i++){
			String suit = "";
			for(int j=2; j<14; j++){
				if(i==1){
					suit = "Spades";
					Card card = new Card(j, suit);
					list.add(card);
				}
				if(i==2){
					suit = "Hearts";
					Card card = new Card(j, suit);
					list.add(card);
				}

				if(i==3){
					suit = "Diamonds";
					Card card = new Card(j, suit);
					list.add(card);
				}
				if(i==4){
					suit = "Clubs";
					Card card = new Card(j, suit);
					list.add(card);
				}
			}
		}
	}

	public ArrayList<Card> getHand(){
		getHand = new ArrayList<>();

		for(int i=0; i<5; i++)
			getHand.add(list.remove(i));
		return getHand;
	}

	public void shuffle(){
		for(int k=0; k<50; k++){
			int i=(int)(Math.random()*list.size());
			int j=(int)(Math.random()*list.size());

			Card swap = list.get(i);
			list.set(i, list.get(j));
			list.set(j, swap);
		}
	}

	public void shuffle2(){
		for(int i=0; i<26; i++)
			list2.add(list.remove(i));
		for(int i=26; i<53; i++)
			list3.add(list.remove(i));

		for(int i=0; i<26; i++){
			newList.add(list2.remove(i));
			newList.add(list3.remove(i));
		}
	}

	public String toString(){
		for(int i=0; i<list.size(); i++)
			S+=(i+1)+" - "+list.get(i).getFaceValue()+" of "+list.get(i).getSuit()+"\n";
		return S;
	}


}
