import java.util.*;

public class PokemonRunner{
	public static void main(String[]args){

	ArrayList<Pokemon> poke = new ArrayList<Pokemon>();

	for(int i=0; i<10; i++){
		poke.add(new Pokemon((int)(Math.random()*100), "Bob"));
	}

	System.out.println(poke);

	Collections.sort(poke);

	System.out.println(poke);

	}
}