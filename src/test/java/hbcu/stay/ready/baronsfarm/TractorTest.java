package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Farm;
import hbcu.stay.ready.baronsfarm.classes.Tractor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TractorTest {

    @Test
    public void testTractorMakeNoise(){
        Tractor tractor = new Tractor();
        String expected = "chug chug chug";
        String actual = tractor.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTractorRide(){
        Tractor tractor = new Tractor();
        int expected = 1;
        int actual = tractor.ride();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTractorOperation(){
        Tractor tractor = new Tractor();
        Farm farm = new Farm();
        int expected = 1;
        int actual = tractor.operate(farm);

        Assert.assertEquals(expected,actual);
    }
}

