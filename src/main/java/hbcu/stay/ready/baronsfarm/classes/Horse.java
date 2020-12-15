package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Horse extends Animal implements NoiseMaker, Rideable {


    public static void add(Horse horses) {
    }

    public String makeNoise(){
        return "heeehaw";
    }

    @Overload
    public String Edible(String EarCorn) {
        return "EarCorn";
    }

    @Override
    public int ride() {
        return 1;
    }

    public String Edible() {
        return "EarCorn";
    }


    public String eat(Edible edible) {
        return "Heehaw! yum tasty earCorn!";
    }
}
