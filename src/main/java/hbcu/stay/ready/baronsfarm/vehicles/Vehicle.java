package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.interfaces.NoiseMaker;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Vehicle implements Rideable, NoiseMaker {
	public Vehicle(){

	}

	@Override
	public String makeNoise(String sound) {
		return sound;
	}
}
