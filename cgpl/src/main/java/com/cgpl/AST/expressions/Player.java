package com.cgpl.AST.expressions;

import java.util.ArrayList;
import java.util.List;
import com.cgpl.SymbolTable;

public class Player implements Expression {
    private String type = "player";
    private List<Card> hand;
    private int score;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public void drawCard(Card card) {
        this.hand.add(card);
    }

    public void discardCard(int index) {
        this.hand.remove(index);
    }

    public int increaseScore(int points) {
        this.score += points;
        return this.score;
    }

    public int decreaseScore(int points) {
        this.score -= points;
        return this.score;
    }

    public int getScore() {
        return this.score;
    }

    public List<Card> getHand() {
        return this.hand;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "player";
    }

    @Override
    public Object getValue() {
        return this.hand;
    }

    @Override
    public Expression evaluate(SymbolTable symbolTable) {
        return this;
    }

    public List<Card> shuffleHand() {
        for (int i = this.hand.size() - 1; i > 0; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            Card temp = this.hand.get(i);
            this.hand.set(i, hand.get(j));
            this.hand.set(j, temp);
        }
        return this.hand;
    }

    public Card playCard(int index) {
        Card cardPlayed = this.getHand().get(index);
        this.discardCard(index);
        return cardPlayed;
    }

    public void reset() {
        this.hand.clear();
        this.score = 0;
    }

}