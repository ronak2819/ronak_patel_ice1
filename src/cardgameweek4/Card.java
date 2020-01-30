package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */
public class Card {
       
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS}; // thype of cards
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};  // number of cards
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
	
	public void display()
	{
		// this method is for showing pull
	}
}
