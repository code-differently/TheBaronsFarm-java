package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.land.Farm;

public class FarmVehicle extends Vehicle {

	FarmVehicle(){}

	public void operate(Farm farm){}

	@Override
	public String makeNoise(String sound){
		return sound;
	}
}
