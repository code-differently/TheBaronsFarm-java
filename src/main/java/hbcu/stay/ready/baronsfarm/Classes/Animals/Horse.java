package hbcu.stay.ready.baronsfarm.Classes.Animals;

import hbcu.stay.ready.baronsfarm.AbstractClasses.Animal;
import hbcu.stay.ready.baronsfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public Horse(String name) {
        super(name);
    }

    public void eat() {

    }

    public void makeNoise() {

    }

    public void mount() {

    }

    public String dismount() {
        return null;
    }
}
