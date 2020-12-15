package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.classes.Tomato;
import hbcu.stay.ready.baronsfarm.classes.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void TestHasBeenFertilizedTomato(){
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant(tomato);
        boolean expected = true;
        boolean actual = tomatoPlant.hasBeenFertilized();

        Assert.assertFalse(actual);
    }

    @Test
    public void TestHasBeenHarvestedTomato() {
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant(tomato);
        boolean expected = true;
        boolean actual = tomatoPlant.hasBeenHarvested();

        Assert.assertFalse(actual);

    }
    @Test
    public void TestTomatoYield(){
        Tomato tomato = new Tomato();
        TomatoPlant tomatoPlant = new TomatoPlant(tomato);
        Edible expected = tomato;
        Edible actual = tomatoPlant.tomatoYield(tomato);

        Assert.assertEquals(expected,actual);
    }

}
