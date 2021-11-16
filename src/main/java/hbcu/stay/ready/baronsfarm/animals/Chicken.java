package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.Edible;
import hbcu.stay.ready.baronsfarm.farm.produce.EdibleEgg;
import hbcu.stay.ready.baronsfarm.farm.produce.Produce;

public class Chicken extends Animal implements Produce {

    public Chicken (){

    }

    public void eat(Edible food) {

    }

    private EdibleEgg yield(EdibleEgg egg){
        return egg;
    }

    public Boolean hasBeenFertilized() {
        return null;
    }

    public Boolean hasBeenHarvested() {
        return null;
    }

    public Boolean yield(Boolean isFertilized) {
        return null;
    }
}
