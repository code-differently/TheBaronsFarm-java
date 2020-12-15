package hbcu.stay.ready.baronsfarm.equipment;

import hbcu.stay.ready.baronsfarm.Farm;
import hbcu.stay.ready.baronsfarm.crop.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;

public class Tractor implements FarmVehicle {

    void harvest(Crop crop) {
        //this should remove crop from cropRow when harvested
    }

    public String operate(Farm farm) {
        return null;
    }

    public String makeNoise() {
        return null;
    }

    public void ride() {

    }
}
