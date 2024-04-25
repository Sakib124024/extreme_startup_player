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

    @Test
    public void canAnswerAddition() {
        var contents = new Answerer().answerFor("What is 75 plus 2?");

        assertThat(contents, equalTo("77"));
    }

    @Test
    public void canAnswerSubtraction() {
        var contents = new Answerer().answerFor("What is 2 minus 54?");

        assertThat(contents, equalTo("-52"));
    }

    @Test
    public void canAnswerMultiplication() {
        var contents = new Answerer().answerFor("What is 45 multiplied by 18?");

        assertThat(contents, equalTo("810"));
    }
    @Test
    public void canAnswerPowerOf() {
        var contents = new Answerer().answerFor("What is 2 to the power of 2?");

        assertThat(contents, equalTo("4"));
    }

}