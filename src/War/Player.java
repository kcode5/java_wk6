package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//1c/i/ii create Player class, vars - List of Card, score, name, define methods
    private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	//constructors 
	public Player() {
	    score = 0;
    }
	
	public Player(String playerName) {
        name = playerName;
        score = 0;
    }
	//print player info and loop thru hand List for each card, calling describe method for card value
	public void describe() {
        System.out.printf("Current Hand for: " + name );
        for (Card card : hand) {
            card.describe();
        }
    }
	
	//method to remove/return the first element (top card) from the arrayList object, hand
	public Card flip() {
        return hand.remove(0);
    }
	//draw method takes a Deck as an arg and calls draw method on the deck, adding the returned card
	//to the arrayList object hand
	public void draw(Deck deck) {
        hand.add(deck.draw());
    }
	//increment player's score
	public void incrementScore() {
        score++;
    }
	//returns the players score
	public int getScore() {
        return score;
    }
	
}    

