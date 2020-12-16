package hbcu.stay.ready.baronsfarm.concrete;

import hbcu.stay.ready.baronsfarm.Abstract.Animal;
import hbcu.stay.ready.baronsfarm.Interface.Rideable;

public class Horse  extends Animal implements Rideable {
    public Horse(String name) {
        super(name);
    }

    public void eat() {

    }

    public void makeNoise() {

    }

    public void mount(Farmer farmer) {

    }

    public String dismount() {
        return null;
    }
}
