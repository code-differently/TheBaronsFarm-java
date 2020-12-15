package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.CropDuster;
import hbcu.stay.ready.baronsfarm.classes.CropRow;
import hbcu.stay.ready.baronsfarm.classes.Farm;
import hbcu.stay.ready.baronsfarm.classes.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void TestMakeNoise() {
        CropDuster cropDuster = new CropDuster();
        cropDuster.makeNoise();
        Assert.assertEquals("Wooosh!", cropDuster.makeNoise());


    }

    @Test
    public void TestRide() {
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride();
        Assert.assertEquals(0, cropDuster.ride());
    }

    @Test
    public void fertilizeTest() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
        cropDuster.fly(cropRow);

        Assert.assertTrue(cropRow.hasBeenFertilized());
    }

    @Test
    public void mountAndFlyTest() {
        CropDuster cropDuster = new CropDuster();
        long id = 0000l;
        Pilot pilot = new Pilot("", "", id);
        cropDuster.fly(pilot);

        Assert.assertTrue(pilot.isMount());

    }

    @Test
    public void disMountFlightTest() {
        CropDuster cropDuster = new CropDuster();
        long id = 0000l;
        Pilot pilot = new Pilot("", "", id);
        cropDuster.fly(pilot);

        Assert.assertTrue(pilot.isDismount());

    }

    @Test
    public void operateTest(){
        CropDuster cropDuster = new CropDuster();
        Farm farm = new Farm();
        int expected = 1;
        int actual = cropDuster.operate(farm);

        Assert.assertEquals(expected,actual);
    }
}

