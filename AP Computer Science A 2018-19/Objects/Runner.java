import java.util.ArrayList;

public class Runner{
	public static void main(String[]args){

//Test 1

	ArrayList<Card> list1 = new ArrayList<>();
	ArrayList<Card> list2 = new ArrayList<>();

	Deck deck = new Deck();

	deck.shuffle();

	list1 = deck.getHand();
	list2 = deck.getHand();

	System.out.println(list1);
	System.out.println(list2);

	System.out.println(deck);

//Test 2

	System.out.println(getPair(list1));

//Test 3

	for(int i=0; i<deck.size(); i++){
		deck.getHand();
	}

	}
	public static String getPair(ArrayList<Card> hand){
		String FaceValue = "";
		for(int i=0; i<hand.size(); i++){
		 if((hand.get(i).getFaceValue()==hand.get(i-1).getFaceValue())&&(i!=0))
		 	FaceValue += hand.get(i).getFaceValue()+" ";
		}
		 	return "You have a pair of "+FaceValue+"s";
	}

}