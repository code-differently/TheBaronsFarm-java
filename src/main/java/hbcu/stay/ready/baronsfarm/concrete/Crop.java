package hbcu.stay.ready.baronsfarm.concrete;

import hbcu.stay.ready.baronsfarm.Interface.Produce;

import java.util.ArrayList;

public class Crop implements Produce {
    private ArrayList<Crop> cropRow;
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;
}
