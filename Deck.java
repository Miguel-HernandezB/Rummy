import java.util.*; 

// import package.Stack;


public class Deck {
    private int top;
    private ArrayList<Card> deck;
    
    /**
    * Creates an empty deck of cards.
    */
    public Deck(){
        this.deck = new ArrayList<Card>();
    }
    /**
    *  Mira el tope del deck, sin remover la carta.
    */
    public Card peek(){
        this.top = deck.size();
        return deck.get(top-1);
    }
    /**
    * Anade una cartas al deck.
    */

    public void addCard(Card card){
        deck.add(card);
    }

    /**
    * returns number of cards on the deck
    */
    public int getSizeOfDeck(){
        return deck.size();
    }

    /**
    * Remueve (devuelve) carta al tope de un deck boca abajo. Si no hay carta, devuelve null.
    */
    public Card dealCard(){
        this.top = deck.size();
        return deck.remove(deck.size() - 1);
        
    }

    /**
    * Remueve carta del tope del discard pile. Si no hay carta, devuelve null.
    */
    public Card removeCard(){
        this.top = deck.size();
        return deck.remove(deck.size() - 1); 
    }

    /**
    * Shuffles the cards present in the deck.
    */
    public void shuffle(){
        Collections.shuffle(deck);
    }
    /**
    * Looks for an empty deck.
    * @return <code>true</code> if there are no cards left to be dealt from the deck.
    */
    public boolean isEmpty(){
        return deck.isEmpty();
    }

    /**
    * Restores the deck to being empty and ready to add Cards to
    */
    public void restoreDeck(){
        deck.clear();
    }


}



