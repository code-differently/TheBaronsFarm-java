package hbcu.stay.ready.baronsfarm.Classes.Housing;

import hbcu.stay.ready.baronsfarm.Classes.Animals.Horse;

import java.util.ArrayList;

public class Stable {

    Stable stable = new Stable();

    private ArrayList<Horse> horseList = new ArrayList<Horse>();

    public void addHorse(Horse horse){
        horseList.add(0,horse);
        horseList.add(1,horse);
        horseList.add(2,horse);
        horseList.add(3,horse);
    }

    public ArrayList<Horse> getHorseList(){
        return horseList;
    }
}
