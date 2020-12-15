package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.CornStalk;
import hbcu.stay.ready.baronsfarm.classes.EarCorn;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    @Test
    public void TestHasBeenFertilizedCorn(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk(earCorn);
        boolean expected = true;
        boolean actual = cornStalk.hasBeenFertilized();

        Assert.assertFalse(actual);
    }
    @Test
    public void TestHasBeenHarvestedCorn(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk(earCorn);
        boolean expected = true;
        boolean actual = cornStalk.hasBeenHarvested();

        Assert.assertFalse(actual);
    }
    @Test
    public void TestCornYield(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk(earCorn);
        Edible expected = earCorn;
        Edible actual = cornStalk.cornStalkYield(earCorn);

        Assert.assertEquals(expected,actual);
    }

}
