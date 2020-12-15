package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenFertilized;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import hbcu.stay.ready.baronsfarm.edible.EdibleEgg;
import hbcu.stay.ready.baronsfarm.produce.Produce;
import java.util.ArrayList;
import java.util.Iterator;


public class Chicken implements Produce {

	private ArrayList<EdibleEgg> eggs = new ArrayList<>();
	private ArrayList<EdibleEgg> fertilizedEgg = new ArrayList<>();

	public Chicken(){}

	public ArrayList<EdibleEgg> getEggs() {
		return eggs;
	}
	public ArrayList<EdibleEgg> getFertilizedEggs() {
		return fertilizedEgg;
	}


	public int countOfEggs(){
		return eggs.size();
	}
	public int countOfFertilizedEggs(){
		return fertilizedEgg.size();
	}

	@Override
	public void yield(Edible edible)  {

		boolean flag = edible instanceof EdibleEgg;

		while(flag){

		if (edible.getState() instanceof NotEdible){
			edible.printStatus();
			eggs.add((EdibleEgg) edible);
			}
			flag = false;
		}
	}

	public void fertilizeEgg(){
		for (EdibleEgg nestEgg: eggs) {
			if (nestEgg.getState() instanceof NotEdible) {
				nestEgg.nextState();
				nestEgg.printStatus();
				fertilizedEgg.add(nestEgg);
			}
		}

		Iterator iterator = eggs.iterator();
		while(iterator.hasNext()){
			iterator.next();
			iterator.remove();
		}
	}

}
