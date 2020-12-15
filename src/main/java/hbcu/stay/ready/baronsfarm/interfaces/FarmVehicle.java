package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.classes.Farm;

public interface FarmVehicle<Operate> extends Vehicle {
    public int operate(Farm farm);
}

