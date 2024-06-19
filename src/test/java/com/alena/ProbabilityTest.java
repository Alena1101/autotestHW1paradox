package com.alena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

public class ProbabilityTest extends BaseTest{
    private final Random random = new Random();

    @ParameterizedTest
    @ValueSource(ints = {10,100,1000,10000})
    void noRiskProbabilityTest (int iterationCount){
        int winCount = 0;
        for (int i = 0; i < iterationCount-1; i++) {
            game.initGame();
            game.chooseDoor(random.nextInt(1,4));
            game.giveHint();
            boolean isWin = game.isSelectedDoorWithPrize();
            if (isWin){
                winCount ++;
            }


        }
        float winFreaquancy = winCount*100f/iterationCount;
        System.out.println("freaquancy = " + winFreaquancy);
        Assertions.assertTrue(winFreaquancy<=50);
    }
    @ParameterizedTest
    @ValueSource(ints = {10,100,1000,10000})
    void riskProbabilityTest (int iterationCount){
        int winCount = 0;
        for (int i = 0; i < iterationCount-1; i++) {
            game.initGame();
            game.chooseDoor(random.nextInt(1,4));
            game.giveHint();
            game.changeChoice();
            boolean isWin = game.isSelectedDoorWithPrize();
            if (isWin){
                winCount ++;
            }


        }
        float winFreaquancy = winCount*100f/iterationCount;
        System.out.println("freaquancy = " + winFreaquancy);
        Assertions.assertTrue(winFreaquancy>=50);
    }
}
