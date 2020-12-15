package hbcu.stay.ready.baronsfarm.land;

import hbcu.stay.ready.baronsfarm.people.Farmer;
import hbcu.stay.ready.baronsfarm.produce.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FieldTest {
	private Field field;
	private Farmer farmer;
	private CropRow cornRow,tomatoRow;
	private Crop corn,tomato;
//
//	@Before
//	public void setUp(){
//		field = new Field();
//		farmer = new Farmer("Baron");
//		cornRow = new CropRow("Corn");
//
//		tomatoRow = new CropRow("Tomato");
//
//
//	}
//
//	@Test
//	public void testCreateRow(){
//		//Act
//		farmer.plant(corn,cornRow);
//
//		Assert.assertNotNull(field.createRow(1,cornRow));
//	}
//
//	@Test public void testMultipleRows(){
//		//Act
//		farmer.plant(corn,cornRow);
//		farmer.plant(tomato,tomatoRow);
//		field.createRow(1,cornRow);
//		field.createRow(2,tomatoRow);
//
//		//Arrange
//		int actual = field.numberOfRow();
//
//		//Assert
//		Assert.assertTrue("hasKeys",actual > 1);
//
//	}
}