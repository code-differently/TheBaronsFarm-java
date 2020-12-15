package hbcu.stay.ready.baronsfarm.people;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Eater;
import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;

public class Person implements NoiseMaker, Eater {
	private String name;

	public Person(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//TODO test and finsh after edible is working
	@Override
	public void eat(Edible edible) {

	}

	@Override
	public String makeNoise(String sound) {
		return sound;
	}
}
