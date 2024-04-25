package com.oocode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
    @Disabled
    @Test
    public void canAnswerMyName() {
        var contents = new Answerer().answerFor("What is your name?");

        assertThat(contents, equalTo("AN TEAM"));
    }
    @Disabled
    @Test
    public void canAnswerHighest979560() {
        var contents = new Answerer().answerFor("Which of the following numbers is the largest: 97, 95, 60?");

        assertThat(contents, equalTo("97"));
    }

    @Disabled
    @Test
    public void canAnswerPrimes() {
        var contents = new Answerer().answerFor("Which of the following numbers are primes: 97, 95, 60?");

        assertThat(contents, equalTo("97"));
    }
@Disabled
    @Test
    public void canAnswerAddition() {
        var contents = new Answerer().answerFor("What is 75 plus 2?");

        assertThat(contents, equalTo("77"));
    }
    @Disabled
    @Test
    public void canAnswerSubtraction() {
        var contents = new Answerer().answerFor("What is 2 minus 54?");

        assertThat(contents, equalTo("-52"));
    }
    @Disabled
    @Test
    public void canAnswerMultiplication() {
        var contents = new Answerer().answerFor("What is 45 multiplied by 18?");

        assertThat(contents, equalTo("810"));
    }
    @Disabled
    @Test
    public void canAnswerPowerOf() {
        var contents = new Answerer().answerFor("What is 2 to the power of 2?");

        assertThat(contents, equalTo("4"));
    }
    @Disabled
    @Test
    public void canAnswerTwoSameOperation() {
        var contents = new Answerer().answerFor("What is 90 plus 16 plus 56?");

        assertThat(contents, equalTo("162"));
    }
    @Disabled
    @Test
    public void canAnswerScrabbleScore() {
        var contents = new Answerer().answerFor("What is the scrabble score of september?");

        assertThat(contents, equalTo("162"));
    }



}