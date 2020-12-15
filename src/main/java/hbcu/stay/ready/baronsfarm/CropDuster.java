package hbcu.stay.ready.baronsfarm;

public class CropDuster extends Aircraft implements FarmVehicle {

    @Override
    public String fly(Pilot pilot) {

        return "Watch me youuuuuuuu";
    }

    public String fertilize() {
        return "Grow crops grow";
    }
    @Override
    public String operate() {
        return "We moving now";
    }
    @Override
    public String makeNoise() {

        return "Plane sounds";
    }
}
