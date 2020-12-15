package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Chicken;
import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void yieldTest(){
        //Given
        Chicken chicken = new Chicken();

        //When
        EdibleEgg expected = new EdibleEgg();
        EdibleEgg actual = chicken.yield();
        //Then
        Assert.assertTrue(actual instanceof EdibleEgg);
    }
    @Test
    public void TestHasBeenFertilized(){
        Chicken chicken = new Chicken();
        boolean actual = chicken.hasBeenFertilized();

        Assert.assertFalse(actual);
    }
    @Test
    public void eatTest(){
        Chicken chicken = new Chicken();
        EdibleEgg expected = new EdibleEgg();
        EdibleEgg actual = chicken.eat();

        Assert.assertTrue(actual instanceof EdibleEgg);
   }
    @Test
    public void edibleTest(){
        Chicken chicken = new Chicken();
        String expected = "EdibleEgg";
        String actual = chicken.Edible();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void eat2Test(){
        Chicken chicken = new Chicken();
        String expected = "" + chicken.getEdibleEgg().toString();
        EdibleEgg actual = chicken.eat();

        Assert.assertTrue(actual instanceof EdibleEgg);
   }

}
