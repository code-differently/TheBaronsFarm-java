package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.crop.Edible;

public interface Person extends Eater, NoiseMaker{

    String eat(Edible edible);

    String makeNoise();
}
