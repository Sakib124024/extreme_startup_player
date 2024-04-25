package com.oocode;

import java.util.HashMap;
import java.util.Map;

public class ScrabbleScorer {

    public static String calculateScore(String word) {
        Map<Character, Integer> letterValues = new HashMap<>();
        letterValues.put('a', 1);
        letterValues.put('b', 3);
        // Add more letter values as needed

        int score = 0;

        for (char c : word.toLowerCase().toCharArray()) {
            score += letterValues.getOrDefault(c, 0);
        }

        return String.valueOf(score);
    }
}