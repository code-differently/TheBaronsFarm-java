package hbcu.stay.ready.baronsfarm.farmanimals;

import hbcu.stay.ready.baronsfarm.Produce;
import hbcu.stay.ready.baronsfarm.crop.Edible;
import hbcu.stay.ready.baronsfarm.crop.EdibleEgg;
import hbcu.stay.ready.baronsfarm.interfaces.Animal;

public class Chicken extends Produce implements Animal {
//is this override or overload?
    EdibleEgg yield() {
        return null;
    }

    @Override
    public boolean hasBeenFertilized() {
        return super.hasBeenFertilized();
    }

    public String eat(Edible edible) {
        return null;
    }

    public String makeNoise() {
        return null;
    }
}
