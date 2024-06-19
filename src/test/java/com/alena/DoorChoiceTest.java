package com.alena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DoorChoiceTest extends BaseTest{
    @BeforeEach
    void before (){
        game.initGame();
    }
    @ParameterizedTest
    @CsvSource({"1,true", "5,false","0,false","2,true","3,true","-1,false"})
    void selectDoorTest (int selectedDoor, boolean ifDoorSet){
        game.chooseDoor(selectedDoor);
        boolean actualResult = false;
        for (Door door: game.getDoors()){
            if (door.isSelected()) {
                actualResult = true;
                break;
            }

        }
        Assertions.assertEquals(ifDoorSet,actualResult);
    }
}
