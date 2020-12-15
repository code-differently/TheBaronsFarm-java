package hbcu.stay.ready.baronsfarm.produce;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import hbcu.stay.ready.baronsfarm.edible.EarCorn;
import hbcu.stay.ready.baronsfarm.edible.Tomato;

import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop {

	private List<Edible> cornStalk = new ArrayList<>();

	public CornStalk(){}

	public List<Edible> getCornStalk() {
		return cornStalk;
	}

	@Override
	public void yield(Edible edible){

		boolean cFlag = edible instanceof EarCorn;


		while(cFlag){
			if (edible.getState() instanceof NotEdible){
				edible.printStatus();
				cornStalk.add(edible);
			}
			cFlag = false;
		}
	}


}
