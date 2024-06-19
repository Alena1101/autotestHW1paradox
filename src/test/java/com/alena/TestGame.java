package com.alena;

import java.util.List;

public class TestGame extends Game{
    public List<Door> getDoors() {
        return doors;
    }
    public boolean isSelectedDoorWithPrize() {
        for (Door door: doors){
            if (door.isSelected()){
                return door.hasPrize();
            }
        }
        return false;

    }
    public void initGame(int doorWithPrizeNumber) {
        doors.clear();
        doors.add(new Door(false));
        doors.add(new Door(false));
        doors.add(new Door(false));
        doors.get(doorWithPrizeNumber-1).setHasPrize(true);
    }
}
