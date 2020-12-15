package hbcu.stay.ready.baronsfarm.people;

//import hbcu.stay.ready.baronsfarm.land.CropRow;
import hbcu.stay.ready.baronsfarm.edible.Tomato;
import hbcu.stay.ready.baronsfarm.land.CropRow;
import hbcu.stay.ready.baronsfarm.produce.Crop;
import hbcu.stay.ready.baronsfarm.produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {
	private Farmer farmer;
	private Crop crop;
	private CropRow cropRow;
	private TomatoPlant tomatoPlant;
	private Tomato tomato;

	@Before
	public void setUp(){
		farmer = new Farmer("Baron");
		crop = new Crop();
		cropRow = new CropRow("tomato");
		tomatoPlant = new TomatoPlant();
		tomato = new Tomato();
	}

	@Test
	public void testPlant(){
		farmer.plant(tomatoPlant,cropRow);
		Assert.assertNotNull(cropRow.getCropRow());
	}

	@Test
	public void testMultiplePlant(){
		farmer.plant(tomatoPlant,cropRow);
		farmer.plant(tomatoPlant,cropRow);
		farmer.plant(tomatoPlant,cropRow);
		farmer.plant(tomatoPlant,cropRow);

		int expected = 4;
		int actual = cropRow.getCropRow().size();

		Assert.assertEquals(expected,actual);
	}

	@Test
	public void testSpecifyCropPlant(){
		farmer.plant(crop,cropRow);
		farmer.plant(crop,cropRow);

		Assert.assertFalse(cropRow.getCropRow().contains(crop));
	}

	@Test
	public void testGetEachElementInCrop(){
		tomatoPlant.yield(tomato);
		farmer.plant(tomatoPlant,cropRow);

		Assert.assertSame(tomato, cropRow.getEdibleInCrop());
	}
	//TODO test the rideable implement
}