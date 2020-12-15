package hbcu.stay.ready.baronsfarm.TestCrops;

import hbcu.stay.ready.baronsfarm.Classes.Crops.CranberryBog;
import org.junit.Assert;
import org.junit.Test;

public class TestCranberriesBog {

    @Test
    public void TestCranberryBog(){
        //Given
        CranberryBog cranberryBog = new CranberryBog("red");
        //When

        //Then
        Assert.assertTrue(cranberryBog.yield());
    }
}
