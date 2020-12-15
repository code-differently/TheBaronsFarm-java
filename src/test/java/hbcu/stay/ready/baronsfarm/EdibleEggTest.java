package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class EdibleEggTest {

      @Test
    public void hasBeenFertilizedTest(){
        //Given
        EdibleEgg edibleEgg = new EdibleEgg();
        boolean hasBeenFertilized = false;
        //When
        boolean expected = false;
        boolean actual = edibleEgg.getClass(true);
        //Then

        Assert.assertFalse(actual);
    }

}
