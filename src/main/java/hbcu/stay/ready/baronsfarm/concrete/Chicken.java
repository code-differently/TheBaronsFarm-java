package hbcu.stay.ready.baronsfarm.concrete;


import hbcu.stay.ready.baronsfarm.Abstract.Animal;
import hbcu.stay.ready.baronsfarm.Abstract.Edible;
import hbcu.stay.ready.baronsfarm.Interface.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized = false;

    public Chicken(String name) {
        super(name);
    }

    public void fertilizeEgg(){

  }
    public Edible yield(boolean EdibleEgg){
        return null;
    }



    public void eat() {

    }

    public void makeNoise() {

    }
}
