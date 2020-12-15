package hbcu.stay.ready.baronsfarm;

public class Farmer extends Person implements Rider, Botanist {

    private Farm farm;

    public Farmer() {
        this.farm = new Farm();
    }

    public String plant(Crop crop) {
        return null;
    }

    public String eat(Edible edible) {
        String farmereats = "";
        if (edible != null) {
            farmereats += "Farmer eats edible";
            System.out.println(farmereats);
        }
        return farmereats;
    }

    public String makeNoise() {
        return "Boo Yah! I'm a farmer!";
    }

    public String mountRideable(Rideable rideable) {
        String farmermounts = "";
        if (rideable != null) {
            farmermounts += "Farmer mounts";
            System.out.println(farmermounts);
        }
        return farmermounts;
    }

    public String dismountRideable(Rideable rideable) {
        String farmerdismounts = "";
        if (rideable != null) {
            farmerdismounts += "Farmer dismounts";
            System.out.println(farmerdismounts);
        }
        return farmerdismounts;
    }

    public String plant(Crop crop, CropRow cropRow) {
        return null;
    }
}
