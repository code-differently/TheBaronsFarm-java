package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.CropRow;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CropRowTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void cropShouldThrowError(){
        expectedException.expectMessage("Ïncorrect message");
        new CropRow().fertilize(null);
    }
    @Test
    public void TestHasBeenFertilized(){
        CropRow cropRow = new CropRow();
        boolean expected = true;
        boolean actual = cropRow.hasBeenFertilized();

        Assert.assertFalse(actual);
    }
    @Test
    public void TestHasBeenHarvested(){
        CropRow cropRow = new CropRow();
        boolean expected = true;
        boolean actual = cropRow.hasBeenHarvested();

        Assert.assertFalse(actual);
    }
}
