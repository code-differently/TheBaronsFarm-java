package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Botanist;
import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist, Eater {

    public Farmer(String name, String noise, long id) {
        super(name, noise, id);

    }

    public Farmer() {

    }

    public Object Edible() {
        return null;
    }


    public String eat(Edible edible) {
        return "Good nutritious food!";
    }


    public Object plant(CropRow cropRow) {
        return cropRow;
    }


    public String eat() {
        return "Good nutritious food!";
    }
}
