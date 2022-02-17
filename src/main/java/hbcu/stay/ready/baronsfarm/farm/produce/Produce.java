package hbcu.stay.ready.baronsfarm.farm.produce;

import hbcu.stay.ready.baronsfarm.Edible;

public interface Produce extends Edible {
     Boolean isFertilized = false;
     Boolean isHarvested = false;

     Boolean hasBeenFertilized();
     Boolean hasBeenHarvested();

    Boolean yield(Boolean isFertilized);

}
