package hbcu.stay.ready.baronsfarm.EdibleState;

public class NotEdible implements EdibleState{

	public NotEdible(){
	}


	@Override
	public void next(Edible edible) {
		edible.setState(new HasBeenFertilized());
	}

	@Override
	public void printStatus() {
		System.out.println("Not edible yet");
	}
}
