package com.cgpl.AST.expressions;

import java.util.List;
import java.util.Stack;

import com.cgpl.SymbolTable;

public class Deck implements Expression {
    String type = "deck";
    Stack<Card> cards;

    public Deck() {
        this.cards = new Stack<Card>();
    }

    public Stack<Card> getCards()
    {
        return this.cards;
    }

    public void addCard(Card card) {
        this.cards.push(card);
    }

    public Card drawCard() {
        if (this.cards.size() == 0) {
            return null;
        }
        return this.cards.pop();
    }

    public int size() {
        return this.cards.size();
    }

    public void clear() {
        this.cards.clear();
    }

    public void shuffle() {
        // Fisher-Yates shuffle
        for (int i = this.cards.size() - 1; i > 0; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            Card temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(j));
            this.cards.set(j, temp);
        }
    }

    public void remove(int index) {
        this.cards.remove(index);
    }

    public void fillDeckFrench() {
        Suit[] suits = { new Suit("Hearts", "red"), new Suit("Diamonds", "red"), new Suit("Clubs", "black"),
                new Suit("Spades", "black") };
        String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        for (Suit suit : suits) {
            for (String value : values) {
                this.addCard(new Card(value, suit.getName()));
            }
        }
    }
    
    public void fillDeckColor(List<Suit> suits) {
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
        for (Suit suit : suits) {
            for (String value : values) {
                this.addCard(new Card(value, suit.getName()));
            }
        }
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "deck";
    }

    @Override
    public Object getValue() {
        return this.cards;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }
}
