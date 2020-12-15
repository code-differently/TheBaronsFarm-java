package hbcu.stay.ready.baronsfarm.Classes;

import hbcu.stay.ready.baronsfarm.Classes.Crops.Crop;
import hbcu.stay.ready.baronsfarm.Classes.Housing.ChickenCoop;
import hbcu.stay.ready.baronsfarm.Classes.Housing.FarmHouse;
import hbcu.stay.ready.baronsfarm.Classes.Housing.Stable;
import hbcu.stay.ready.baronsfarm.Classes.Vehicles.CropDuster;
import hbcu.stay.ready.baronsfarm.Classes.Vehicles.FarmVehicle;
import hbcu.stay.ready.baronsfarm.Classes.Vehicles.Tractor;
import hbcu.stay.ready.baronsfarm.Interfaces.Pilot;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Farm {

    private Map<Integer, Crop> field;
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Stable Stable;
    private ChickenCoop chickenCoop;
    private FarmVehicle FarmVehicle;


    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void addStables() {
        stables.add(0, Stable);
        stables.add(1, Stable);
        stables.add(2, Stable);
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void addChickenCoops() {
        chickenCoops.add(0, chickenCoop);
        chickenCoops.add(1, chickenCoop);
        chickenCoops.add(2, chickenCoop);
        chickenCoops.add(3, chickenCoop);
    }

    public FarmVehicle getFarmVehicle() {
        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();
        return FarmVehicle;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }


    public Farmer hasFarmer(Farmer baron) {
        Farmer farmer = new Farmer("Baron");
        return farmer.name();
    }
}
