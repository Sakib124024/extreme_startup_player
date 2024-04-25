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

        if (question.startsWith("What is")){
            //"What is 45 multiplied by 18?");
            String regexPattern="multiplied|plus|minus";
            String[] numbers = question.replace("?","").split(" ");
            if(question.contains("multiplied")){
                var num1=Integer.parseInt(numbers[2]);
                var num2=Integer.parseInt(numbers[5]);
                var result=num1 * num2;
                return String.valueOf(result);
            }
            else if(question.contains("plus")){


            }
            else if(question.contains("minus")){


            }

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
