package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class CornStalk extends Crop<EarCorn> {

    public CornStalk(EarCorn produce) {
        super(produce);
    }
    public boolean hasBeenFertilized(){
        return false;
    }

    public boolean hasBeenHarvested(){
        return false;
    }

    public Edible cornStalkYield(EarCorn earCorn){
        boolean hasBeenFertilized = false;
        if(hasBeenFertilized && hasBeenHarvested){

        }
        return earCorn;
    }
}

