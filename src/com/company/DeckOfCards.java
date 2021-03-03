package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    public void fullFillDeck(){
        for(Value v: Value.values()){
            for(Color c: Color.values()){
                deck.add(new Card(c, v));
            }
        }
    }

    private void shuffleDeck(){
        Random rand = new Random();

        for (int i = 0; i < deck.size(); i++) {
            int randomIndexToSwap = rand.nextInt(deck.size());
            Card temp = deck.get(randomIndexToSwap);
            deck.set(randomIndexToSwap, deck.get(i));
            deck.set(i, temp);
        }
    }

    public List<Card> splitCards(){
        List<Card> cardsToReturn = new ArrayList<>();
        for(int i=0; i<24; i++){
            cardsToReturn.add(deck.remove(deck.size() -1));
        }
        return cardsToReturn;
    }

    private List<Card> deck = new ArrayList<>();
    {
        fullFillDeck();
        shuffleDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }
}
