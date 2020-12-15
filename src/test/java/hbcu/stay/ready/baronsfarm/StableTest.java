package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Horse;
import hbcu.stay.ready.baronsfarm.classes.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void TestStableConstructor(){
        //Given
        Stable stable = new Stable(new Horse(), new Horse(), new Horse());
        Assert.assertEquals(3,stable.getHorseList().size());
    }

    @Test
    public void TestAddHorses(){
        //Given
        Stable stable = new Stable(new Horse(), new Horse(), new Horse());
        //When
        Stable expected = stable;
        stable.addHorse(new Horse());
        //Then
        Assert.assertEquals(3,stable.getHorseList().size());
    }

}
