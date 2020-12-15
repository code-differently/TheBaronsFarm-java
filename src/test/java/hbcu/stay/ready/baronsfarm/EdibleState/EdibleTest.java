package hbcu.stay.ready.baronsfarm.EdibleState;


import org.junit.Assert;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;


public class EdibleTest {
	private Edible edible;

	public void setUp(){
		edible = new Edible();
	}

	@Test
	public void Edible(){

		Assert.assertNotNull(edible.getState());
	}

	@Test
	public void givenNewEdible_whenFertilized_thenHarvested(){

		Assert.assertThat(edible.getState(),instanceOf(NotEdible.class));
		edible.nextState();

		Assert.assertThat(edible.getState(),instanceOf(HasBeenFertilized.class));
		edible.nextState();

		Assert.assertThat(edible.getState(),instanceOf(HasBeenHarvested.class));
	}
}