package hbcu.stay.ready.baronsfarm.TestHousing;

import hbcu.stay.ready.baronsfarm.Classes.Animals.Chicken;
import hbcu.stay.ready.baronsfarm.Classes.Housing.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestChickenCoop {

    @Test
    public void TestGetChickenList(){
        //Given
        ChickenCoop chickencoop = new ChickenCoop();
        ArrayList<Chicken> chickenList = new ArrayList<Chicken>();
        Chicken chicken = null;
        //When
        chickenList.add(null);
        int expected = 1;
        int actual = chickenList.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
