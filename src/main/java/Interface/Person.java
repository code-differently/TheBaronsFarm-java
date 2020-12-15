package Interface;

import hbcu.stay.ready.baronsfarm.Farming.Edible;

public interface Person extends NoiseMaker, Eater{
    void eat(Edible edible);

    void makeNoise();
}
