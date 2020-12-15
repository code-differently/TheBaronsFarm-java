package hbcu.stay.ready.baronsfarm.EdibleState;

public class HasBeenFertilized implements EdibleState {




	@Override
	public void next(Edible edible) {
		edible.setState(new HasBeenHarvested());

	}

	@Override
	public void printStatus() {
		System.out.println("Has been fertilized.");
	}
}
