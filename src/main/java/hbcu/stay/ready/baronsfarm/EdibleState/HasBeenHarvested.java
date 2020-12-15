package hbcu.stay.ready.baronsfarm.EdibleState;

public class HasBeenHarvested implements EdibleState{




	@Override
	public void next(Edible edible) {
		System.out.println("ReadyToEat!");
	}

	@Override
	public void printStatus() {
		System.out.println("Is harvest.");
	}
}
