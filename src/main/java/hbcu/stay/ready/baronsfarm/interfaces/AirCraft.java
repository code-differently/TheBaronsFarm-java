package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.classes.CropRow;
import hbcu.stay.ready.baronsfarm.classes.Field;
import hbcu.stay.ready.baronsfarm.classes.Pilot;

public interface AirCraft extends Vehicle{
    void fly();

    void fly(Pilot pilot);

    void fly(CropRow field);
}
