package hbcu.stay.ready.baronsfarm.people;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Botanist;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;
import hbcu.stay.ready.baronsfarm.land.CropRow;
import hbcu.stay.ready.baronsfarm.produce.CornStalk;
import hbcu.stay.ready.baronsfarm.produce.Crop;
import hbcu.stay.ready.baronsfarm.produce.TomatoPlant;

import java.util.ArrayList;

public class Farmer extends Person implements Rider, Botanist{


	public Farmer(String name) {
		super(name);
	}


	@Override
	public void dismount(Rideable rideable) {

	}

	@Override
	public void mount(Rideable rideable) {

	}

	@Override
	public void plant(Crop crop, CropRow cropRow) {


		cropRow.setCropRow(crop);

	}

	@Override
	public void eat(Edible edible) {

	}
}
