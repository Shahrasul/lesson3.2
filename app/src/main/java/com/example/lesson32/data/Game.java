package com.example.lesson32.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game<CardContent> {
    private int changePosition;
    private final List<Card<CardContent>> cards = new ArrayList<>();
    private Card<CardContent> oldCard;

    public Game(List<CardContent> contents) {
        for (int i = 0; i < contents.size(); i++) {
            cards.add(new Card<>(false, false, contents.get(i), i * 2));
            cards.add(new Card<>(false, false, contents.get(i), i * 2 + 1));
        }
        Collections.shuffle(cards);
    }

    public void choose(Card<CardContent> card) {
        card.setFaceUp(!card.isFaceUp());
        if (card.isFaceUp()) {
            checkPairs(card);
        }
    }

    private void checkPairs(Card<CardContent> card) {
        if (oldCard != null) {
            if (card.getContent().equals(oldCard.getContent())) {
                cards.remove(oldCard);
                cards.remove(card);
            } else {
                oldCard.setFaceUp(false);
                card.setFaceUp(true);
            }
        } else {
            card.setFaceUp(true);

        }
        oldCard = card;
    }

    public List<Card<CardContent>> getCards() {
        return cards;
    }
}