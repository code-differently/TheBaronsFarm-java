package hbcu.stay.ready.baronsfarm.TestCrops;

import hbcu.stay.ready.baronsfarm.Classes.Crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TestTomatoPlant {

    @Test
    public void TestYield(){
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant(30);
        //When
        boolean actual = true;
        boolean expected = tomatoPlant.yield();
        //Then
        Assert.assertTrue(tomatoPlant.yield());
    }
}
