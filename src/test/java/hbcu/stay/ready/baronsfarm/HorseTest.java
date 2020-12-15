package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.EarCorn;
import hbcu.stay.ready.baronsfarm.classes.Horse;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void TestMakeNoise(){
        Horse horse = new Horse();
        horse.makeNoise();
        Assert.assertEquals("heeehaw",horse.makeNoise());
    }

    @Test
    public void TestEdible(){
        Horse horse = new Horse();
        horse.Edible();
        String expected = "EarCorn";
        Assert.assertEquals("EarCorn", horse.Edible());

    }

    @Test
    public void TestRide(){
        Horse horse = new Horse();
        horse.ride();
        Assert.assertEquals(1,horse.ride());
    }
}
