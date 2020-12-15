package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.land.CropRow;
import hbcu.stay.ready.baronsfarm.people.Pilot;
import hbcu.stay.ready.baronsfarm.produce.Crop;
import hbcu.stay.ready.baronsfarm.produce.TomatoPlant;

public class Cropduster extends Aircraft{


	Cropduster(Pilot pilot) {
		super(pilot);
	}

	//todo need to get edible in cropRow and switch state to HasBeenFertilized
	public void fertilize(CropRow cropRow){


	}



}
