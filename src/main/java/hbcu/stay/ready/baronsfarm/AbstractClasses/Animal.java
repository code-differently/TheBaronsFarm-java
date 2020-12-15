package hbcu.stay.ready.baronsfarm.AbstractClasses;

import hbcu.stay.ready.baronsfarm.Interfaces.Eater;
import hbcu.stay.ready.baronsfarm.Interfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {

    private String name;

    public Animal(String name) {
    }


    public void Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }
}
