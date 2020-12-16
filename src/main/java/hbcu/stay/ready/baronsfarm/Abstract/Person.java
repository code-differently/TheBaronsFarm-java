package hbcu.stay.ready.baronsfarm.Abstract;

import hbcu.stay.ready.baronsfarm.Interface.Eater;
import hbcu.stay.ready.baronsfarm.Interface.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {

    }

    public void eat() {

    }
}
