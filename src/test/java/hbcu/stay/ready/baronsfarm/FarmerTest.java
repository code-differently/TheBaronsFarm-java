package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.CropRow;
import hbcu.stay.ready.baronsfarm.classes.Farmer;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FarmerTest {
    @Test
    public void farmerEaterTest(){
        Farmer farmer = new Farmer();
        String expected = "Good nutritious food!";
        String actual = farmer.eat();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void farmerPlantingTest(){
        Farmer farmer = new Farmer();
        CropRow cropRow =  new CropRow();
        Object expected = cropRow;
        Object actual = farmer.plant(cropRow);

        Assert.assertEquals(expected, actual);
    }
}
