package hbcu.stay.ready.baronsfarm.produce;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import hbcu.stay.ready.baronsfarm.animals.Chicken;
import hbcu.stay.ready.baronsfarm.edible.EdibleEgg;

import java.util.ArrayList;
import java.util.Iterator;

public interface Produce {
	public void yield(Edible edible);

}
