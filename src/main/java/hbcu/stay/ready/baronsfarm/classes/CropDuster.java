package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.AirCraft;
import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;

public class CropDuster implements AirCraft, FarmVehicle {
Pilot pilot;
boolean fertilize = true;
    public CropDuster(Pilot pilot){
         this.pilot = pilot;
    }
    public CropDuster(){

    }
    @Override
    public void fly() {

    }

    @Overload
    public void fly(Pilot pilot) {
        pilot.fly();
    }


    @Overload
    public void fly(CropRow field) {
        field.fertilize(null);
    }


    @Override
    public String makeNoise() {
        return "Wooosh!";
    }

    @Override
    public int ride() {
        return 0;
    }

    @Override
    public int operate(Farm farm) {
        return 1;
    }
}

