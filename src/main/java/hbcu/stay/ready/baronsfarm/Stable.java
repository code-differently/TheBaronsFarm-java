package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horseList;

    public void addHorses(Integer numberOfHorses){
        for (int i = 0; i < numberOfHorses; i++) {
            horseList.add(new Horse());
        }
    }

    public ArrayList<Horse> getHorseList() {
        return horseList;
    }
}
