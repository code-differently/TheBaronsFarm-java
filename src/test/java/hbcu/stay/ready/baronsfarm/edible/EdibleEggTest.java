package hbcu.stay.ready.baronsfarm.edible;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenFertilized;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenHarvested;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

public class EdibleEggTest {
	private Edible edibleEgg;
	@Before
	public void SetUp(){
		edibleEgg = new EdibleEgg();
	}

	@Test
	public void testEdible(){
		Assert.assertNotNull("extendsEdible",edibleEgg);
	}

	@Test
	public void testInstanceOfEdible(){
		Assert.assertThat(edibleEgg,instanceOf(Edible.class));
	}


	@Test
	public void givenNewEdible_whenFertilized_thenHarvested(){


		Assert.assertThat(edibleEgg.getState(),instanceOf(NotEdible.class));
		edibleEgg.nextState();

		Assert.assertThat(edibleEgg.getState(),instanceOf(HasBeenFertilized.class));
		edibleEgg.nextState();

		Assert.assertThat(edibleEgg.getState(),instanceOf(HasBeenHarvested.class));
	}

	//todo test egg state can't harvest
}