package hbcu.stay.ready.baronsfarm.edible;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenFertilized;
import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenHarvested;
import hbcu.stay.ready.baronsfarm.EdibleState.NotEdible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

public class TomatoTest {

	private Edible tomato;

	@Before
	public void setUp() {
		tomato = new Tomato();
	}

	@Test
	public void testInstanceOfEdible(){
		Assert.assertThat(tomato,instanceOf(Edible.class));
	}



	@Test
	public void givenNewEdible_whenFertilized_thenHarvested(){


		Assert.assertThat(tomato.getState(),instanceOf(NotEdible.class));
		tomato.nextState();

		Assert.assertThat(tomato.getState(),instanceOf(HasBeenFertilized.class));
		tomato.nextState();

		Assert.assertThat(tomato.getState(),instanceOf(HasBeenHarvested.class));
	}

}