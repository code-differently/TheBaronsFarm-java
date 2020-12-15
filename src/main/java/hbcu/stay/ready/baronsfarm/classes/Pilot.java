package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.AirCraft;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class  Pilot extends Person implements NoiseMaker, Rider, AirCraft {

    boolean isFly = true;
    boolean isRide = true;
     boolean isMount = true;
     boolean isDismount = true;


    public Pilot(String name, String noise, long id) {
        super(name, noise, id);
        boolean fly = false;
        boolean ride = true;
        boolean mount = true;
        boolean disMount = true;

    }

    @Override
    public void fly() {

    }

    @Override
    public void fly(Pilot pilot) {

    }

    @Override
    public void fly(CropRow field) {

    }

    public Object getFly() {
         return true;
    }

    public Object setFly() {
        this.isFly = isFly;
        return isFly;
    }

    public Object getRide() {
        return true;
    }
    public Object setRide() {
        this.isRide = isRide;
        return isRide;
    }

    public boolean isMount() {
        return isMount;
    }

    public boolean setMount(boolean mount) {
        isMount = mount;
        return mount;
    }

    public boolean isDismount() {
        return isDismount;
    }

    public boolean setDismount(boolean dismount) {
        isDismount = dismount;
        return dismount;
    }

    public String makeNoise() {
        return "Wooosh!";
    }


    public int ride() {
        return 0;
    }

    protected String eatBaroness(Edible edible) {
        return "Yum! eggs and sweet corn";
    }
}