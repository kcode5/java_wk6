package War;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//1b/i/ii create deck class, List of Card, List of String, constructor, methods
	
	List<Card> cards = new ArrayList<Card>();
	List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
	
	//constructor populates arrayList object with 52 cards (13 cards across 4 suits)
	public Deck() {
        for (int i = 2; i < 15; i++) {
            for (String suit : suits) {
                cards.add(new Card(i, suit));
            }
        }
    }
	
	//method to randomly shuffle arrayList object
	public void shuffle() {
		Collections.shuffle(cards);
    }
	
	//method to remove/return the first element (top card) from the arrayList object
	public Card draw() {
		return cards.remove(0);
	}
	

}
