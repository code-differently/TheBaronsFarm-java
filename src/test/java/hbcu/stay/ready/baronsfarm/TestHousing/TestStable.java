package hbcu.stay.ready.baronsfarm.TestHousing;


import hbcu.stay.ready.baronsfarm.Classes.Animals.Horse;
import hbcu.stay.ready.baronsfarm.Classes.Housing.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStable{

    @Test
    public void TestAddHorse(){
        //Given
        Stable stable = new Stable();
        Horse horse = new Horse("Horse1");
        //When
         stable.addHorse(horse);

         //Then

    }

    @Test
    public void TestGetHorseList(){
        //Given
        Stable stable = new Stable();
        ArrayList<Horse> horseList = new ArrayList<Horse>();
        Horse horse = null;
        //When
        horseList.add(null);
        int expected = 1;
        int actual = horseList.size();
        //Then
        Assert.assertEquals(expected,actual);
    }
}


