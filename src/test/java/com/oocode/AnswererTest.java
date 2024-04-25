package com.oocode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
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
    public void canAnswerAddition() {
        var contents = new Answerer().answerFor("What is 75 plus 2?");

        assertThat(contents, equalTo("79"));
    }

    @Disabled
    @Test
    public void canAnswerCalculator() {
        var contents = new Answerer().answerFor("What is 45 multiplied by 18?");

        assertThat(contents, equalTo("810"));
    }




}