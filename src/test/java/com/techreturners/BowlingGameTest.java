package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    private BowlingGame bowlingGame;

    @BeforeEach
    protected void setUp(){
        bowlingGame = new BowlingGame();
    }

    @ParameterizedTest
    @CsvFileSource (files = "src/main/resources/input.csv")
    public void testLoadGame(String input, int expected ){
        int[] rolls = bowlingGame.loadGame(input);
        int simpleSum = Arrays.stream(rolls).sum();
        assertEquals(expected, simpleSum);
    }

}
