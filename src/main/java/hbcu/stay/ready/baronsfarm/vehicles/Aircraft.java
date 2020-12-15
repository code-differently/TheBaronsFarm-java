package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.people.Person;
import hbcu.stay.ready.baronsfarm.people.Pilot;

public class Aircraft extends Vehicle{
	//boolean fly;

	Aircraft(Pilot pilot){
		fly(pilot);
	}

	public String fly(Pilot pilot){

		return "We are in the air";
	}

}
