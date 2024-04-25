package com.oocode;
import java.util.Arrays;

public class Answerer {
    public String answerFor(String question) {
        if (question.startsWith("Which of the following numbers is the largest: ")){
            String[] numbers = question.replaceAll("[^0-9,]","").split(",");
            int maxNumber = Integer.MIN_VALUE;

            for (String number : numbers) {
                int currentNumber = Integer.parseInt(number.trim());
                if (currentNumber > maxNumber) {
                    maxNumber = currentNumber;
                }
            }

            return String.valueOf(maxNumber);
        }
        if (question.startsWith("What is your name?")){
            return "AN TEAM";
        }
        else {
            return "AN TEAM";
        }
    }
}
