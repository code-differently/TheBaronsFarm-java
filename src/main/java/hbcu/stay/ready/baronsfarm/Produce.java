package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.crop.Edible;

public abstract class Produce {

    public boolean hasBeenFertilized() {
        return false;
    }

    Edible yield() {
        return null;
    }
}
