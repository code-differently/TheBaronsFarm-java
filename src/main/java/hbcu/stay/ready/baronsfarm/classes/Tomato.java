package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Produce;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Tomato extends Produce {
    public Tomato(){
        super();
    }

    public Tomato(Edible edible) {
        super(edible);
    }

    @Override
    public Edible getProduce() {
        return getProduce().yield();
    }
}
