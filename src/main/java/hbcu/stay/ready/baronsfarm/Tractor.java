package hbcu.stay.ready.baronsfarm;

public class Tractor implements FarmVehicle {

    public void harvest(Crop) {

    }

    public String operate(Farm farm) {
        String tractoroperates = "";
        if (farm != null) {
            tractoroperates += "Tractor operates";
            System.out.println(tractoroperates);
        }
        return tractoroperates;
    }

    public String makeNoise() {
        return "Vroom vroom";
    }
}
