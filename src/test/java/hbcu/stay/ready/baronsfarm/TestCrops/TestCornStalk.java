package hbcu.stay.ready.baronsfarm.TestCrops;

import hbcu.stay.ready.baronsfarm.Classes.Crops.CornStalk;
import org.junit.Assert;
import org.junit.Test;

public class TestCornStalk {

    @Test
    public void TestYield(){
        //Given
        CornStalk cornStalk = new CornStalk(70);
        //When
        boolean actual = true;
        boolean expected = cornStalk.yield();
        //Then
        Assert.assertTrue(cornStalk.yield());
    }
}
