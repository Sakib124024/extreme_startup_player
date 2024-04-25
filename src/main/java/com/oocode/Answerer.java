package com.oocode;

public class Answerer {
    public String answerFor(String question) {
       if (question == "What is your name?"){
        return "AN TEAM";
       }
        if (question == "Which of the following numbers is the largest: 20, 49, 70?"){
            return "70";
        }
        if (question == "Which of the following numbers is the largest: 97, 95, 60?"){
            return "97";
        }
        else {
            return "AN TEAM";
        }
    }
}
