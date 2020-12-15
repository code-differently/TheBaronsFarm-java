package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenFertilized;
import hbcu.stay.ready.baronsfarm.edible.Tomato;
import hbcu.stay.ready.baronsfarm.land.CropRow;
import hbcu.stay.ready.baronsfarm.people.Farmer;
import hbcu.stay.ready.baronsfarm.people.Pilot;
import static org.hamcrest.CoreMatchers.instanceOf;
import hbcu.stay.ready.baronsfarm.produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CropdusterTest {

	private Cropduster cropduster;
	private Pilot pilot;
	private CropRow cropRow;
	private Farmer farmer;
	private TomatoPlant tomatoPlant;
	private Edible tomato;

	@Before
	public void setUp() {
		cropduster = new Cropduster(pilot);
		pilot = new Pilot("Jim");
		cropRow = new CropRow("tomato");
		farmer = new Farmer("Baron");
		tomatoPlant = new TomatoPlant();
		tomato = new Tomato();
	}

	@Test
	public void testFly(){
		String expected = "We are in the air";
		String actual = cropduster.fly(pilot);
		Assert.assertSame(expected, actual);
	}

	@Test
	public void testFertilize(){
		tomatoPlant.yield(tomato);
		farmer.plant(tomatoPlant,cropRow);
		cropduster.fertilize(cropRow);
		Assert.assertThat(tomatoPlant.getTomatoPlant().get(0).getState()
				,instanceOf(HasBeenFertilized.class));

	}
}