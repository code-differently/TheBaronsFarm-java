package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Baroness;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BaronessTest {

    @Test

    public void TestBaronessWeeklyEatCorn(){
        int expected = 14;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessWeeklyEatCorn();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessWeeklyEatEggs(){
        int expected = 14;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessWeeklyEatEggs();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessWeeklyEatTomatoes(){
        int expected = 7;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessWeeklyEatTomatoes();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestBaronessWeeklyFeeHorse(){
        int expected = 210;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessWeeklyFeedHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessWeeklyRideEachHorse(){
        int expected = 70;
        Baroness baroness = Baroness.getInstance();
        int actual = Baroness.baronessWeeklyRideEachHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronessFertilizeOnMonday(){
        String expected = "It is Monday let me fly and fertilize the cropRows!";
        Baroness baroness = Baroness.getInstance();
        String actual = Baroness.baronessFertilizeOnMonday();

        Assert.assertEquals(expected,actual);
    }

}
