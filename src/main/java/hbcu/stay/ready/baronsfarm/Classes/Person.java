package hbcu.stay.ready.baronsfarm.Classes;

import hbcu.stay.ready.baronsfarm.Interfaces.Eater;
import hbcu.stay.ready.baronsfarm.Interfaces.NoiseMaker;

public class Person implements Eater, NoiseMaker {
    String name;


    public Person(String name){ this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public void eat() {

    }

    public void makeNoise() {

    }
}
