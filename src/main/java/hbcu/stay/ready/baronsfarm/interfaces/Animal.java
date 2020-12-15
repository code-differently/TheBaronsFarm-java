package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.crop.Edible;

//A Java class can only extend one parent class. Multiple inheritance is not allowed. Interfaces are not classes, however,
// and an interface can extend more than one parent interface. The extends keyword is used once, and the parent interfaces
// are declared in a comma-separated list.
public interface Animal extends NoiseMaker, Eater {

    String eat(Edible edible);

    String makeNoise();
}
