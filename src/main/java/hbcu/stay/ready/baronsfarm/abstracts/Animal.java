package hbcu.stay.ready.baronsfarm.abstracts;

import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;
import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;

public abstract class  Animal implements NoiseMaker, Eater {

    String noise;
    String name;
    Integer id;
    public EdibleEgg eat() {
        return eat();
    }

    public Object yield(Object edibleEgg) {
        return null;
    }
}
