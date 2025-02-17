package com.alena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class HintTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"1,1","1,2","1,3","2,1","2,2","2,3"})
    void hintTest (int doorWithPrizeNumber, int selectedDoor){
        game.initGame(doorWithPrizeNumber);
        game.chooseDoor(selectedDoor);
        int hint = game.giveHint()+1;
        Assertions.assertNotEquals(doorWithPrizeNumber,hint);
        Assertions.assertNotEquals(selectedDoor,hint);
    }

}
