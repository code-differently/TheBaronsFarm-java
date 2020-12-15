package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.FridayFarmActivities;
import hbcu.stay.ready.baronsfarm.classes.TuesdayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FridayFarmActivitiesTest {
    @Test
    public void testFriCornConsumed(){
        FridayFarmActivities fridayFarmActivities = new FridayFarmActivities();
        int expected = 3;
        int actual = fridayFarmActivities.baronBaronessFridayCornConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFriTomatoesConsumed(){
        FridayFarmActivities fridayFarmActivities = new FridayFarmActivities();
        int expected = 3;
        int actual = fridayFarmActivities.baronBaronessFridayTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFriEggsConsumed(){
        FridayFarmActivities fridayFarmActivities = new FridayFarmActivities();
        int expected = 7;
        int actual = fridayFarmActivities.baronBaronessFridayEggsConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFriHorseRide(){
        FridayFarmActivities fridayFarmActivities = new FridayFarmActivities();
        int expected = 20;
        int actual = fridayFarmActivities.baronBaronessFridayHorseRide();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFriFeedHorse(){
        FridayFarmActivities fridayFarmActivities = new FridayFarmActivities();
        int expected = 60;
        int actual = fridayFarmActivities.baronBaronessFridayFeedHorses();

        Assert.assertEquals(expected,actual);
    }

}
