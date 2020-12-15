package hbcu.stay.ready.baronsfarm.FarmAnimals;

import Interface.Animal;
import hbcu.stay.ready.baronsfarm.Farming.Edible;
import hbcu.stay.ready.baronsfarm.Farming.EdibleEgg;
import hbcu.stay.ready.baronsfarm.Farming.Produce;

public abstract class Chicken extends Produce implements Animal {
    EdibleEgg yield() {

        return null;
    }


    public boolean hasBeenFertilize() {

        return super.hasBeenFertilized();
    }

    public void eat(Edible edible) {

    }

    public void makeNoise() {

    }
}
