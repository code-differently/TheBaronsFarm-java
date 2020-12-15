package hbcu.stay.ready.baronsfarm;

public class Pilot extends Person implements Rider {

    public String eat(Edible edible) {
        return "Pilot eats edible";
    }

    public String makeNoise() {

        return "Whoo hoo!";
    }

    public String mountRideable(Rideable rideable) {
        String pilotmounts = "";
        if (rideable != null) {
            pilotmounts += "Pilot mounts";
            System.out.println(pilotmounts);
        }
        return pilotmounts;
    }

    public String dismountRideable(Rideable rideable) {
        String pilotdismounts = "";
        if (rideable != null) {
            pilotdismounts += "Pilot dismounts";
            System.out.println(pilotdismounts);
        }
        return pilotdismounts;
    }
}
