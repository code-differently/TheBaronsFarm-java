package hbcu.stay.ready.baronsfarm;

public class CropDuster implements FarmVehicle, Aircraft {

    public void fertilize(CropRow) {

    }

    public String fly(Field field) {
        String cropdflies = "";
        if (field != null) {
            cropdflies += "CropDuster Flies";
            System.out.println(cropdflies);
        }
        return cropdflies;
    }

    public String operate(Farm farm) {
        String cropdoperates = "";
        if (farm != null) {
            cropdoperates += "CropDuster operates";
            System.out.println(cropdoperates);
        }
        return cropdoperates;
    }

    public String makeNoise() {
        return "dust dust";
    }
}
