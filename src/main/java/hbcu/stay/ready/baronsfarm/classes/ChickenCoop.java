package hbcu.stay.ready.baronsfarm.classes;

import java.util.ArrayList;
import java.util.Collections;

public class ChickenCoop extends Farm {

    public ChickenCoop(){
        super();
    }
    private ArrayList<Chicken> chickenList;

    public ChickenCoop(Chicken chicken1, Chicken chicken2, Chicken chicken3){
        chickenList = new ArrayList<>();

        chickenList.add(chicken1);
        chickenList.add(chicken2);
        chickenList.add(chicken3);
    }

    public void addChicken(Chicken chicken){
        Collections.addAll(chickenList);
    }

    public ArrayList<Chicken> getChickenList(){
        return chickenList;
    }
}