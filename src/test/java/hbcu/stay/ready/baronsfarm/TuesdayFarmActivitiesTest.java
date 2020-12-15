package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.TuesdayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TuesdayFarmActivitiesTest {
    @Test
    public void testTueCornConsumed(){
        TuesdayFarmActivities tuesdayFarmActivities = new TuesdayFarmActivities();
        int expected = 3;
        int actual = tuesdayFarmActivities.baronBaronessTuesdayCornConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTueTomatoesConsumed(){
        TuesdayFarmActivities tuesdayFarmActivities = new TuesdayFarmActivities();
        int expected = 3;
        int actual = tuesdayFarmActivities.baronBaronessTuesdayTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTueEggsConsumed(){
        TuesdayFarmActivities tuesdayFarmActivities = new TuesdayFarmActivities();
        int expected = 7;
        int actual = tuesdayFarmActivities.baronBaronessTuesdayEggsConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTueHorseRide(){
        TuesdayFarmActivities tuesdayFarmActivities = new TuesdayFarmActivities();
        int expected = 20;
        int actual = tuesdayFarmActivities.baronBaronessTuesdayHorseRide();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTueFeedHorse(){
        TuesdayFarmActivities tuesdayFarmActivities = new TuesdayFarmActivities();
        int expected = 60;
        int actual = tuesdayFarmActivities.baronBaronessTuesdayFeedHorses();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBaronTueHarvest(){
        TuesdayFarmActivities tuesdayFarmActivities = new TuesdayFarmActivities();
        String expected = "It is Tuesday let me hope on my tractor and harvest the EarCorns and Tomatoes from each CropRow";
        String actual = tuesdayFarmActivities.baronTuesdayHarvest();

        Assert.assertEquals(expected,actual);
    }
}
