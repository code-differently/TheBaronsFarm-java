package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.SundayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SundayFarmActivitiesTest {
    @Test
    public void testBaronSundayPlanting(){
        SundayFarmActivities sundayFarmActivities = new SundayFarmActivities();
        int expected = 3;
        int actual = sundayFarmActivities.baronPlantingOnSunday();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSundayCornConsumed(){
        SundayFarmActivities sundayFarmActivities = new SundayFarmActivities();
        int expected = 3;
        int actual = sundayFarmActivities.baronBaronessSundayCornConsumption();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSundayTomatoesConsumed(){
        SundayFarmActivities sundayFarmActivities = new SundayFarmActivities();
        int expected = 3;
        int actual = sundayFarmActivities.baronBaronessSundayTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSundayEggsConsumed(){
        SundayFarmActivities sundayFarmActivities = new SundayFarmActivities();
        int expected = 7;
        int actual = sundayFarmActivities.baronBaronessSundayEggsConsumption();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSundayHorseRide(){
        SundayFarmActivities sundayFarmActivities = new SundayFarmActivities();
        int expected = 20;
        int actual = sundayFarmActivities.baronBaronessSundayHorseRide();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSundayHorseFeed(){
        SundayFarmActivities sundayFarmActivities = new SundayFarmActivities();
        int expected = 60;
        int actual = sundayFarmActivities.baronBaronessSundayFeedHorses();

        Assert.assertEquals(expected,actual);
    }
}
