package com.example.lesson32.data;

import java.util.Objects;

public class Card<T> {

    private int id;
    private boolean isFaceUp;
    private boolean isMatched;
    private T content;

    public Card(boolean isFaceUp, boolean isMatched, T content, int id) {
        this.isFaceUp = isFaceUp;
        this.isMatched = isMatched;
        this.content = content;
        this.id = id;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card<?> card = (Card<?>) o;
        return id == card.id &&
                isFaceUp == card.isFaceUp &&
                isMatched == card.isMatched &&
                Objects.equals(content, card.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isFaceUp, isMatched, content);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", isFaceUp=" + isFaceUp +
                ", isMatched=" + isMatched +
                ", content=" + content +
                '}';
    }
}

