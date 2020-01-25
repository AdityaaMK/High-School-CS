public class Card{
	private int value;
	private String suit;

	public Card(){
		suit = "Joker";
		value = 0;
	}

	public Card(int value, String suit){
		this.value = value;
		this.suit = suit;
	}

	public int getValue(){
		return value;
	}

	public String getSuit(){
		return suit;
	}

	public String getFaceValue(){
		if((value>1&&value<11))
			return String.valueOf(getValue());
		else if(value==11)
			return "Jack";
		else if(value==12)
			return "Queen";
		else if(value==13)
			return "King";
		return "Ace";
	}

	public String toString(){
			if(value<11)
				return value+" of "+suit;
			return getFaceValue()+" of "+suit;
	}

}