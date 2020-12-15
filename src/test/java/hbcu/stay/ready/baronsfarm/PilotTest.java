package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    private boolean pilot;

    @Test
    public void getFlyTest(){
        //Given
        //boolean  isFly= true;
        //boolean ride = true;
        Pilot pilot = new Pilot("Barron", "Huray", 1004l);
        this.pilot = (boolean) pilot.getFly();
        
        //When
        boolean expected = true;
        boolean actual = (boolean) pilot.getFly();
        //Then
        Assert.assertEquals(true,actual);
    }

    @Test
    public void setFlyTest(){
        //Given
        Pilot pilot = new Pilot("Barron", "Huray", 1004l);
        this.pilot = (boolean) pilot.setFly();
        //When
        boolean expected = true;
        boolean actual = (boolean) pilot.setFly();
        //Then
        Assert.assertEquals(true,actual);
    }

    @Test
    public void getRideTest(){
        //Given
        Pilot pilot = new Pilot("Barron", "Huray", 1004l);
        this.pilot = (boolean) pilot.getRide();

        //When
        boolean expected = true;
        boolean actual = (boolean) pilot.getRide();

        //Then
        Assert.assertEquals(true,actual);
    }

    @Test
    public void setRideTest(){
        //Given
        Pilot pilot = new Pilot("Barron", "Huray", 1004l);
        this.pilot = (boolean) pilot.setRide();
        //When
        boolean expected = true;
        boolean actual = (boolean) pilot.setRide();
        //Then
        Assert.assertEquals(true,actual);
    }
}
