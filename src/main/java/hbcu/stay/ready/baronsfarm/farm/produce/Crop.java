package hbcu.stay.ready.baronsfarm.farm.produce;

import hbcu.stay.ready.baronsfarm.Edible;

public class Crop implements Produce{

    private Edible yield(Edible edible){
        return edible;
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
