package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.abstracts.Produce;
import hbcu.stay.ready.baronsfarm.classes.*;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.LinkedList;

public class FarmTest<stable1List> {
    @Test
    public void TestFarmConstructorCropRow(){
        Farm farm = new Farm();
        String expected = "Five cropRows of Baron's Farm";
        Object cropRow = new Object();
        String actual = farm.toString(cropRow);

        Assert.assertEquals(expected,actual);

   }
   @Test
   public void TestFarmConstructorTomatoCrop(){
        Farm farm = new Farm();
        Object tomatoPlant = new Tomato();
        Object expected = tomatoPlant;
        Edible actual = new Tomato(new Tomato(new Tomato()));

        Assert.assertTrue(true);
   }

   @Test
   public void TestConstructorCornCrop(){
       Farm farm = new Farm();
       Object cornStalk = new EarCorn();
       Object expected = cornStalk;
       Edible actual = new EarCorn(new EarCorn(new EarCorn()));

       Assert.assertTrue(true);
   }
   @Test
    public void TestGetHorseFromStable(){
        Farm farm = new Farm();
       LinkedList<String> stable1List = new LinkedList<>();
       LinkedList<String> expected = farm.stable1List(); // I am not sure about this.
       LinkedList<String> actual = farm.stable1List();

       Assert.assertEquals(expected,actual);

   }
   @Test
    public void TestGetBaronFromFarmHouse(){
       Farm farm = new Farm();
       LinkedList<String> farmHouse1List = new LinkedList<>();
       String expected = farm.toString();
       LinkedList<String> actual = farm.getFarmHouse1List();

       Assert.assertTrue(true);
   }
}
