package hbcu.stay.ready.baronsfarm.TestCrops;

import hbcu.stay.ready.baronsfarm.Classes.Crops.AppleTree;
import org.junit.Assert;
import org.junit.Test;

public class TestApples {

    @Test
    public void TestYield(){
        //Given
        AppleTree appleTree = new AppleTree("blue");
        //When

        //Then
        Assert.assertTrue(appleTree.yield());
    }
}
