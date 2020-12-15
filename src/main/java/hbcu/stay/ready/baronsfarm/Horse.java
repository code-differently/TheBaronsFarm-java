package hbcu.stay.ready.baronsfarm;

public class Horse implements Animal, Rideable {


    public String eat(Edible edible) {
        String horseeats = "";
        if (edible != null) {
            horseeats += "Horse eats edible";
            System.out.println(horseeats);
        }

        return horseeats;
    }

    public String makeNoise() {
        return "Neigh!";
    }
}
