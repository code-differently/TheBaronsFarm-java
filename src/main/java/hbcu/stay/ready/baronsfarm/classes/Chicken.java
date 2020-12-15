package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.abstracts.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Chicken extends Animal implements Eater {

    private EdibleEgg edibleEgg = new EdibleEgg();
    boolean hasBeenFertilized = false;

    public EdibleEgg getEdibleEgg() {
        return new EdibleEgg();
    }

    public Chicken() {
        super();
    }


    public EdibleEgg yield() {
        return edibleEgg;
    }


//    public void harvest() {
//
//    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    @Overload
    public EdibleEgg eat() {
        this.edibleEgg = new EdibleEgg();
        return edibleEgg;
    }


//    public void getFertilize() {
//
//    }


    @Override
    public String Edible() {
        return "EdibleEgg";
    }

    @Override
    public String eat(Edible edible) {
        return "Tasty eggs!" + edible.toString();
    }

    @Overload
    public String Edible(String egg) {
        return "Yummy EdibleEgg!";
    }

    public boolean hasBeenFertilized() {
        if (hasBeenFertilized) {
            return true;
        } else {
            return false;
        }

    }
}
