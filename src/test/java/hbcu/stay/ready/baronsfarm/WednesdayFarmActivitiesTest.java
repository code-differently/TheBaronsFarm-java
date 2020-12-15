package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.TuesdayFarmActivities;
import hbcu.stay.ready.baronsfarm.classes.WednesdayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WednesdayFarmActivitiesTest {
    @Test
    public void testWedCornConsumed(){
        WednesdayFarmActivities wednesdayFarmActivities = new WednesdayFarmActivities();
        int expected = 3;
        int actual = wednesdayFarmActivities.baronBaronessWedCornConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testWedTomatoesConsumed(){
        WednesdayFarmActivities wednesdayFarmActivities = new WednesdayFarmActivities();
        int expected = 3;
        int actual = wednesdayFarmActivities.baronBaronessWedTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testWedEggsConsumed(){
        WednesdayFarmActivities wednesdayFarmActivities = new WednesdayFarmActivities();
        int expected = 7;
        int actual = wednesdayFarmActivities.baronBaronessWedEggsConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTueHorseRide(){
        WednesdayFarmActivities wednesdayFarmActivities = new WednesdayFarmActivities();
        int expected = 20;
        int actual = wednesdayFarmActivities.baronBaronessWedHorseRide();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testWedFeedHorse(){
        WednesdayFarmActivities wednesdayFarmActivities = new WednesdayFarmActivities();
        int expected = 60;
        int actual = wednesdayFarmActivities.baronBaronessWedFeedHorses();

        Assert.assertEquals(expected,actual);
    }

}
