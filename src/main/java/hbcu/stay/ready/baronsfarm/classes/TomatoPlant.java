package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class TomatoPlant extends Crop<Tomato> {

    public TomatoPlant(Tomato produce) {
        super(produce);
    }
    public void fertilize(){
        Crop.setHasBeenFertilized(true);
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public boolean hasBeenFertilized(){
        return false;
    }
    public Edible tomatoYield(Tomato tomato){
        boolean hasBeenFertilized = false;
        if (hasBeenFertilized && hasBeenHarvested) {
        }
        return tomato;
    }
}


