package War;

public class App {

	public static void main(String[] args) {
		
		//2.create App class
		//3.instantiate a Deck and 2 players, call the shuffle method on the deck
		Deck deck = new Deck();
        Player p1 = new Player("1");
        Player p2 = new Player("2");
        
        deck.shuffle();
        
        //4.iterate 52 times, calling the draw method and passing deck
        for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                p1.draw(deck);
            } else {
                p2.draw(deck);
            }
        }
	
        //5.iterate 26 times and call flip method for each player
        for (int i = 0; i < 26; i++) {
            Card p1Card = p1.flip();
            Card p2Card = p2.flip();
            if (p1Card.getValue() > p2Card.getValue()) {
                p1.incrementScore();
            } else if (p1Card.getValue() < p2Card.getValue()) {
                p2.incrementScore();
            }
        }
        
        //6.print player scores to console
        System.out.printf("Final Score for Player 1: " +  p1.getScore() + "\n");
        System.out.printf("Final Score for Player 2: " +  p2.getScore() + "\n");
        
        //7.compare scores and print winner
        if(p1.getScore() > p2.getScore()) {
            System.out.println("Player 1 wins!");
        } else if (p1.getScore() < p2.getScore()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("The game is a draw.");
        }
         
	}

}
