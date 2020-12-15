package hbcu.stay.ready.baronsfarm.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Stable extends Farm {

    public Stable(){
        super();
    }
    private ArrayList<Horse> horseList;

    public Stable(Horse horse1, Horse horse2, Horse horse3) {
        horseList = new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);
    }

    public void addHorse(Horse horses) {
        Collections.addAll(horseList);
    }

    public ArrayList<Horse> getHorseList() {
        return horseList;
    }
}



