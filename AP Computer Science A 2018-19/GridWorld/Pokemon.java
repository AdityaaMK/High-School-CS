public class Pokemon implements Comparable<Pokemon>{
	private int hp;
	private String name;

	public Pokemon(int hp, String name){
		this.hp = hp;
		this.name = name;
	}

	public String toString(){
		return name+" has "+hp+" hp.";
	}

	public int gethp(){
		return hp;
	}

	public int compareTo(Pokemon obj){
		if(hp>obj.gethp())
			return 1;
		if(hp<obj.gethp())
			return -1;
		else
			return 0;
	}

}



