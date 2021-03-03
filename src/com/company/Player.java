package com.company;

import java.io.CharArrayReader;
import java.util.List;

public class Player {
        private List<Card> cards;
        private String name;

        public Player(List<Card> cards, String name){
            this.cards = cards;
            this.name = name;
        }

        public List<Card> getCards(){
            return cards;
        }

}
