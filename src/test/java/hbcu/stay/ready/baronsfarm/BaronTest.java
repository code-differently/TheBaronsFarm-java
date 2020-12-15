package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Baron;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BaronTest {

    @Test
    public void TestBaronWeeklyEatCorn(){
        int expected = 7;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronWeeklyEatCorn();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronWeeklyEatEggs(){
        int expected = 35;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronWeeklyEatEggs();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBaronWeeklyEatTomatoes(){
        int expected = 14;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronWeeklyEatTomatoes();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestBaronWeeklyFeeHorse(){
        int expected = 210;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronWeeklyFeedHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronWeeklyRideEachHorse(){
        int expected = 70;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronWeeklyRideEachHorse();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronWeeklyOnSundayPlanting(){
        int expected = 3;
        Baron baron = Baron.getInstance();
        int actual = Baron.baronWeeklyPlantingOnSunday();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestBaronHarvestTuesday(){
        String expected = "It is Tuesday time to harvest some  and corn";
        Baron baron = Baron.getInstance();
        String actual = Baron.baronWeeklyHarvestOnTuesday();
    }
}