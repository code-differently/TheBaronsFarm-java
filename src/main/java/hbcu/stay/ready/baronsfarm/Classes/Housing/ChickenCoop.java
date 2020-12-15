package hbcu.stay.ready.baronsfarm.Classes.Housing;

import hbcu.stay.ready.baronsfarm.Classes.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickenList = new ArrayList<Chicken>();

    public void addChicken(Chicken chicken) {
        chickenList.add(chicken);
    }

    public ArrayList<Chicken> getChickenList(){
    return chickenList;
    }
}


