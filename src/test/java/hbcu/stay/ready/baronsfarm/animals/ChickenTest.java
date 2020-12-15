package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.EdibleState.HasBeenFertilized;
import hbcu.stay.ready.baronsfarm.edible.EdibleEgg;
import hbcu.stay.ready.baronsfarm.produce.Produce;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

	private EdibleEgg edibleEgg;
	private Chicken chicken;


	@Before
	public void setUp(){
		edibleEgg = new EdibleEgg();
		chicken = new Chicken();
	}

	@Test
	public void testChicken(){

		//Assert
		Assert.assertThat(chicken,instanceOf(Produce.class));
	}


	@Test
	public void testYieldContainsNonEgg(){
		//Act
		chicken.yield(edibleEgg);
		//Assert
		Assert.assertTrue("NoEggs",
				chicken.getEggs().contains(edibleEgg));
	}

	@Test
	public void countOfNonFertilizedEggs(){
		//Act
		chicken.yield(edibleEgg);
		chicken.yield(edibleEgg);
		chicken.yield(edibleEgg);
		//Arrange
		Integer expected = 3;
		Integer actual = chicken.countOfEggs();
		//Assert
		Assert.assertEquals("NumberNotCorrect",expected,actual);
	}

	@Test
	public void testYieldContainsEdibleEgg(){
		//Act
		chicken.yield(edibleEgg);
		chicken.fertilizeEgg();
		//Assert
		Assert.assertTrue("NoEggs",
				chicken.getFertilizedEggs().contains(edibleEgg));
	}

	@Test
	public void testFertilizeEgg(){
		//Act
		chicken.yield(edibleEgg);
		chicken.fertilizeEgg();
		//Assert
		Assert.assertThat((chicken.getFertilizedEggs().get(0).getState()),
				instanceOf(HasBeenFertilized.class));
	}

	@Test
	public void testRemoveNonFertilizedEgg(){
		//Act
		chicken.yield(edibleEgg);
		chicken.fertilizeEgg();
		//Arrange
		int expected = 0;
		int actual = chicken.countOfEggs();

		//Assert
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void testAddFertilizedEgg(){
		//Act
		EdibleEgg edibleEgg2 = new EdibleEgg();
		EdibleEgg edibleEgg3 = new EdibleEgg();
		chicken.yield(edibleEgg2);
		chicken.yield(edibleEgg3);
		chicken.yield(edibleEgg);
		chicken.fertilizeEgg();
		//Arrange
		int expected = 3;
		int actual = chicken.countOfFertilizedEggs();

		//Assert
		Assert.assertEquals(expected,actual);
	}

}