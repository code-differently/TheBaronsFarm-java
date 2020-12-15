package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.Classes.Animals.Chicken;
import hbcu.stay.ready.baronsfarm.Classes.Housing.ChickenCoop;
import hbcu.stay.ready.baronsfarm.Classes.Housing.FarmHouse;
import hbcu.stay.ready.baronsfarm.Classes.Housing.Stable;
import hbcu.stay.ready.baronsfarm.Classes.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarm {


    @Test
    public void TestGetStables(){
        //Given
        Stable stable = new Stable();
        ArrayList<Stable> stables = new ArrayList<Stable>();
        //When
        stables.add(stable);
        int expected = 1;
        int actual = stables.size();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetChickenCoop(){
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        //When
        chickenCoops.add(chickenCoop);
        chickenCoops.add(chickenCoop);
        int expected = 2;
        int actual = chickenCoops.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestGetFarmHouse(){
        //Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person("Jimmy");
        //When
        farmHouse.addPerson(person);
        Person expected = person;
        Person actual = farmHouse.addPerson(person);
        //Then
        Assert.assertEquals(expected,actual);
    }
}
