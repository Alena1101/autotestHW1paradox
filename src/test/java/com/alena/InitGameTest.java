package com.alena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InitGameTest extends BaseTest{
    @BeforeEach
    void before (){
        game.initGame();
    }

    @Test
    void atLeastOneDoorHasPrizeTest (){
        List<Door> doors = game.getDoors();
        int doorWithPrizeCount = 0;
        for (Door door: doors){
            if (door.hasPrize()){
                doorWithPrizeCount ++;
            }
        }
        Assertions.assertTrue(doorWithPrizeCount>0);
    }
    @Test
    void singleDoorHasPrizeTest (){
        List<Door> doors = game.getDoors();
        int doorWithPrizeCount = 0;
        for (Door door: doors){
            if (door.hasPrize()){
                doorWithPrizeCount ++;
            }
        }
        Assertions.assertEquals(1,doorWithPrizeCount);
    }

}
