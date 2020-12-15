package hbcu.stay.ready.baronsfarm.Classes.Animals;

import hbcu.stay.ready.baronsfarm.AbstractClasses.Animal;
import hbcu.stay.ready.baronsfarm.Interfaces.Produce;

public class Chicken<EdibleEgg> extends Animal implements Produce {
    private Object EdibleEgg;
    private Object Egg;



    public Chicken(String name) {
        super("Bucky");
    }

    public void eat() {
    }

    public void makeNoise() {
    }

    private boolean hasBeenFertilized(Object egg) {
        return true;
    }

    public boolean yield() {
        boolean flag = false;
        if (hasBeenFertilized(Egg)) {
            flag = true;
        }
        return flag;
    }

    public boolean fertilizeEgg(){
        boolean flag = false;
        if(hasBeenFertilized(Egg)){
            flag = true;
        }
        return flag;
    }

}
