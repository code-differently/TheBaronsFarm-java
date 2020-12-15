package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Produce;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Crop<T extends Produce>   {
    Produce produce;
    boolean hasBeenHarvested ;

    protected static void setHasBeenFertilized(boolean b) {

    }

    public Edible yield(){
        if(!hasBeenHarvested && this.produce.hasBeenFertilized()){
            hasBeenHarvested = true;
            Edible yieldedEdible =  produce.yield();
            produce = null;
            return yieldedEdible;
        }
        return null;
    }

    public Crop(Produce produce){
        this.produce = produce;
    }
    public void fertilize(){
        produce.setHasBeenFertilized(true);
    }
}