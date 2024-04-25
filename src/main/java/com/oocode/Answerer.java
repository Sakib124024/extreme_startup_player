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
        if (question.contains("to the power of")) {
            String[] parts = question.split(" to the power of ");
            int base = Integer.parseInt(parts[0].replaceAll("[^0-9]", ""));
            int exponent = Integer.parseInt(parts[1].replaceAll("[^0-9]", ""));
            return String.valueOf(Math.round(Math.pow(base, exponent)));
        }
        if (question.contains("the scrabble score of")) {
            String[] parts = question.split(" ");
            ScrabbleScorer s= new ScrabbleScorer();
            return s.calculateScore(parts[6]);
        }
        else if (question.contains("are primes")) {
            String[] numbers = question.replaceAll("[^0-9,]", "").split(",");
            StringBuilder primes = new StringBuilder();
            for (String num : numbers) {
                if (isPrime(Integer.parseInt(num.trim()))) {
                    primes.append(num).append(", ");
                }
            }
            return primes.toString().isEmpty() ? "None of the numbers are primes" : primes.toString();
        }
        if (question.startsWith("What is")){
            //"What is 45 multiplied by 18?");
            String regexPattern="multiplied|plus|minus";
            String[] numbers = question.replace("?","").split(" ");
            if(question.contains("multiplied")){
                int count=0;
                for(String s:question.split(" ")){
                    if(s.equals("multiplied")){
                        count++;
                    }
                }
                if(count==2){
                    var num1=Integer.parseInt(numbers[2]);
                    var num2=Integer.parseInt(numbers[5]);
                    var num3=Integer.parseInt(numbers[7]);
                    var result=num1 * num2 * num3;
                    return String.valueOf(result);
                }

            }
            else if(question.contains("plus")){
                int count=0;
                for(String s:question.split(" ")){
                    if(s.equals("plus")){
                        count++;
                    }
                }
                if(count==2){
                    var num1=Integer.parseInt(numbers[2]);
                    var num2=Integer.parseInt(numbers[4]);
                    var num3=Integer.parseInt(numbers[6]);
                    var result=num1 + num2 + num3;
                    return String.valueOf(result);
                }
            }
            else if(question.contains("minus")){
                var num1=Integer.parseInt(numbers[2]);
                var num2=Integer.parseInt(numbers[4]);
                var result=num1 - num2;
                return String.valueOf(result);
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

        else {
            return "AN TEAM";
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
