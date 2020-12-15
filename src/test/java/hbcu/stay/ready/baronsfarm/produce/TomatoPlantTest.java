package hbcu.stay.ready.baronsfarm.produce;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.edible.EarCorn;
import hbcu.stay.ready.baronsfarm.edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {
	private TomatoPlant tomatoPlant;
	private Edible tomato;
	private Edible corn;

	@Before
	public void setUp(){
		tomatoPlant = new TomatoPlant();
		tomato = new Tomato();
		corn = new EarCorn();
	}


	@Test
	public void testYieldOnlyTomatoes(){
		//Act
		tomatoPlant.yield(tomato);
		tomatoPlant.yield(corn);
		tomatoPlant.yield(tomato);
		//Arrange
		int expected = 2;
		int actual = tomatoPlant.getTomatoPlant().size();
		//Assert
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void testYieldContainsTomatoes(){
		//Act
		tomatoPlant.yield(tomato);
		tomatoPlant.yield(corn);
		//Assert
		Assert.assertTrue(tomatoPlant.getTomatoPlant().contains(tomato));
		Assert.assertFalse(tomatoPlant.getTomatoPlant().contains(corn));
	}
}