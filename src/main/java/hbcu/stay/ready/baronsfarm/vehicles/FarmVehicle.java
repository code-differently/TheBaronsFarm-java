package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.farm.buildings.Farm;

public interface FarmVehicle extends Vehicle {

    void operate(Farm farm); // return farm
}
