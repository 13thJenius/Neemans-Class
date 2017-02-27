// DeckTester03.java
// This program is designed to explain the "Elevens" lab created
// by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Divided into stages and altered August 2014 by Leon Schram.

public class DeckTester03modStart{
	public static void main(String[] args){
      //reminder that the Card class is independent
      //you can construct (and print) card objects like this:
      Card card1 = new Card("Clubs", "seven", 7);
			System.out.println("hahaha");


      //write a Deck class that 'has-an' array of cards
      //write the following methods:  constructor, add, toString

      Deck deck = new Deck();
       deck.add("Clubs","Three",3);
       System.out.println(deck);
       System.out.println(deck.size());
       System.out.println(deck.isEmpty());
	}//close main
}//close Class


class Deck{
	private Card[] cards;  //an array for a whole deck
	private int size;  //how many cards are currently in the deck
	public Deck(){
		cards = new Card[52];
		size=0;
	}
	public void add(String suit, String number, int num){
		cards[size] = new Card(suit, number, num);
		size++;
	}
	public String toString(){
		String retval = "nothing";
		for (Card crd:cards)
			retval += "Card is " + crd;
		return retval;
	}
   public int size(){ return size;  }
   public boolean isEmpty() { return size == 0; }

}//close Deck class



//do not change this class!!
class Card{
   private String suit;
   private String rank;
   private int value;

   public Card(String s, String r, int v){
      suit = s;
      rank = r;
      value = v;
   }

   public String getSuit()       { return suit; }
   public String getRank()       { return rank; }
   public int getValue()         { return value; }

   public void setSuit(String s) { suit = s; }
   public void setRank(String r) { rank = r; }
   public void setValue(int v)   { value = v; }

   public String toString(){
      return "[" + suit + ", " + rank + ", " + value + "]";
   }

   public boolean matches(Card otherCard) {
		return otherCard.getSuit().equals(this.suit)
			 && otherCard.getRank().equals(this.rank)
			 && otherCard.getValue() == this.value;
	}
}//close Card class
