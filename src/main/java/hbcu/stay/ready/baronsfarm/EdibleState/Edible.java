package hbcu.stay.ready.baronsfarm.EdibleState;


public class Edible {
	private EdibleState state = new NotEdible();

	public Edible(){
	}

	public EdibleState getState() {

		return state;
	}

	public void setState(EdibleState state) {
		this.state = state;
	}


	public void nextState(){
		state.next(this);
	}

	public void printStatus(){
		state.printStatus();
	}
}
