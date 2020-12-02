package com.example.lesson32.ui;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.lesson32.data.Card;
import com.example.lesson32.data.Game;

public class EmojiGame {

    private final Game<String> game;

    @RequiresApi(api = Build.VERSION_CODES.R)
    public EmojiGame() {
        List<String> content = new ArrayList<>(List.of("🎃", "👹","😎","👽","🦁","⚡️"));
        game = new Game<>(content);
    }

    public void choose(Card<String> card) {
        game.choose(card);
    }

    public List<Card<String>> getCards() {
        return game.getCards();
    }

}
