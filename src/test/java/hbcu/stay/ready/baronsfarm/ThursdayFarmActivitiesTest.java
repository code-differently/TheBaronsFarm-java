package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.ThursdayFarmActivities;
import hbcu.stay.ready.baronsfarm.classes.TuesdayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ThursdayFarmActivitiesTest {
    @Test
    public void testThuCornConsumed(){
        ThursdayFarmActivities thursdayFarmActivities = new ThursdayFarmActivities();
        int expected = 3;
        int actual = thursdayFarmActivities.baronBaronessThursdayCornConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testThuTomatoesConsumed(){
        ThursdayFarmActivities thursdayFarmActivities = new ThursdayFarmActivities();
        int expected = 3;
        int actual = thursdayFarmActivities.baronBaronessThursdayTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testThuEggsConsumed(){
        ThursdayFarmActivities thursdayFarmActivities = new ThursdayFarmActivities();
        int expected = 7;
        int actual = thursdayFarmActivities.baronBaronessThursdayEggsConsumption();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testThuHorseRide(){
        ThursdayFarmActivities thursdayFarmActivities = new ThursdayFarmActivities();
        int expected = 20;
        int actual = thursdayFarmActivities.baronBaronessThursdayHorseRide();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testThuFeedHorse(){
        ThursdayFarmActivities thursdayFarmActivities = new ThursdayFarmActivities();
        int expected = 60;
        int actual = thursdayFarmActivities.baronBaronessThursdayFeedHorses();

        Assert.assertEquals(expected,actual);
    }

}
