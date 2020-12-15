package hbcu.stay.ready.baronsfarm.produce;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.edible.EarCorn;
import hbcu.stay.ready.baronsfarm.edible.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {
	private CornStalk cornStalk;
	private Edible tomato;
	private Edible corn;

	@Before
	public void setUp(){
		cornStalk = new CornStalk();
		tomato = new Tomato();
		corn = new EarCorn();
	}

	@Test
	public void testYieldCorn(){
		//Act
		cornStalk.yield(corn);
		cornStalk.yield(corn);
		//Arrange
		int expected = 2;
		int actual = cornStalk.getCornStalk().size();
		//Assert
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void testYieldOnlyCorn(){
		//Act
		cornStalk.yield(corn);
		cornStalk.yield(tomato);
		cornStalk.yield(corn);
		//Arrange
		int expected = 2;
		int actual = cornStalk.getCornStalk().size();
		//Assert
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void testYieldContainsCorn(){
		//Act
		cornStalk.yield(tomato);
		cornStalk.yield(corn);
		//Assert
		Assert.assertTrue(cornStalk.getCornStalk().contains(corn));
		Assert.assertFalse(cornStalk.getCornStalk().contains(tomato));
	}

}