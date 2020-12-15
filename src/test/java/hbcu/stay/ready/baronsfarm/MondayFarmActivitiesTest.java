package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.MondayFarmActivities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MondayFarmActivitiesTest {
    @Test
    public void testMondayCornConsumed(){
        MondayFarmActivities mondayFarmActivities = new MondayFarmActivities();
        int expected = 3;
        int actual = mondayFarmActivities.baronBaronessMondayCornConsumption();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMondayTomatoesConsumed(){
        MondayFarmActivities mondayFarmActivities = new MondayFarmActivities();
        int expected = 3;
        int actual = mondayFarmActivities.baronBaronessMondayTomatoesConsumption();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMondayEggsConsumed(){
        MondayFarmActivities mondayFarmActivities = new MondayFarmActivities();
        int expected = 7;
        int actual = mondayFarmActivities.baronBaronessMondayEggsConsumption();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMondayHorseRide(){
        MondayFarmActivities mondayFarmActivities = new MondayFarmActivities();
        int expected = 20;
        int actual = mondayFarmActivities.baronBaronessMondayHorseRide();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMondayHorseFeed(){
        MondayFarmActivities mondayFarmActivities = new MondayFarmActivities();
        int expected = 60;
        int actual = mondayFarmActivities.baronBaronessMondayFeedHorses();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testBaronessMondayFertilizing(){
        MondayFarmActivities mondayFarmActivities = new MondayFarmActivities();
        String expected = "It is Monday let me hope to CropDuster and fly up and up to fertilize the CropRows";
        String actual = mondayFarmActivities.baronessMondayFertilize();

        Assert.assertEquals(expected, actual);
    }
}
