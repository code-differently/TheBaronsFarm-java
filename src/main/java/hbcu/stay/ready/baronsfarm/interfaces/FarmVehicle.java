package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.Farm;

public interface FarmVehicle extends Vehicle{

    String operate(Farm farm);

    String makeNoise();

    void ride();
}
