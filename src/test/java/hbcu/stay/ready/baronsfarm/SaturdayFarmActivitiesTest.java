package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.SaturdayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SaturdayFarmActivitiesTest {
    @Test
    public void testSatCornConsumed(){
        SaturdayFarmActivities saturdayFarmActivities = new SaturdayFarmActivities();
        int expected = 3;
        int actual = saturdayFarmActivities.baronBaronessSaturdayCornConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSatTomatoesConsumed(){
        SaturdayFarmActivities saturdayFarmActivities = new SaturdayFarmActivities();
        int expected = 3;
        int actual = saturdayFarmActivities.baronBaronessSaturdayTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSatEggsConsumed(){
        SaturdayFarmActivities saturdayFarmActivities = new SaturdayFarmActivities();
        int expected = 7;
        int actual = saturdayFarmActivities.baronBaronessSaturdayEggsConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSatHorseRide(){
        SaturdayFarmActivities saturdayFarmActivities = new SaturdayFarmActivities();
        int expected = 20;
        int actual = saturdayFarmActivities.baronBaronessSaturdayHorseRide();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSatFeedHorse(){
        SaturdayFarmActivities saturdayFarmActivities = new SaturdayFarmActivities();
        int expected = 60;
        int actual = saturdayFarmActivities.baronBaronessSaturdayFeedHorses();

        Assert.assertEquals(expected,actual);
    }

}
