package hbcu.stay.ready.baronsfarm.produce;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import hbcu.stay.ready.baronsfarm.edible.EarCorn;
import hbcu.stay.ready.baronsfarm.edible.Tomato;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop {

	private List<Edible> tomatoPlant = new ArrayList<>();

	public TomatoPlant(){}

	public List<Edible> getTomatoPlant() {
		return tomatoPlant;
	}

	@Override
	public void yield(Edible edible){


		boolean tFlag = edible instanceof Tomato;


		while(tFlag ){
			if (edible.getState() instanceof NotEdible){
				edible.printStatus();
				tomatoPlant.add(edible);
			}
			tFlag = false;
		}
	}

}
