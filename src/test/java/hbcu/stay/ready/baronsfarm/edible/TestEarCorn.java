package hbcu.stay.ready.baronsfarm.edible;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import static org.hamcrest.CoreMatchers.instanceOf;

import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenFertilized;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenHarvested;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEarCorn {
	private Edible earCorn;
	@Before
	public void setUp(){
		earCorn = new EarCorn();
	}

	@Test
	public void testNullEdible(){

		Assert.assertNotNull("extendsEdible", earCorn);
	}

	@Test
	public void testInstanceOfEdible(){
		Assert.assertThat(earCorn,instanceOf(Edible.class));
	}

	@Test
	public void givenNewEdible_whenFertilized_thenHarvested(){


		Assert.assertThat(earCorn.getState(),instanceOf(NotEdible.class));
		earCorn.nextState();

		Assert.assertThat(earCorn.getState(),instanceOf(HasBeenFertilized.class));
		earCorn.nextState();

		Assert.assertThat(earCorn.getState(),instanceOf(HasBeenHarvested.class));
	}
}
