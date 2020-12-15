package hbcu.stay.ready.baronsfarm;


import hbcu.stay.ready.baronsfarm.EdibleState.Edible;

public class MainApplication {
	public static void main(String[] args) {

	Edible edible = new Edible();
		System.out.println(edible.getState());
	edible.printStatus();

	edible.nextState();
	edible.printStatus();

	edible.nextState();
	edible.printStatus();

	edible.nextState();
		System.out.println(edible.getState());


}

}
