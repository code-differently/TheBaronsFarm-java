package hbcu.stay.ready.baronsfarm.TestHousing;

import hbcu.stay.ready.baronsfarm.Classes.Animals.Horse;
import hbcu.stay.ready.baronsfarm.Classes.Housing.FarmHouse;
import hbcu.stay.ready.baronsfarm.Classes.Housing.Stable;
import hbcu.stay.ready.baronsfarm.Classes.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarmHouse {

    @Test
    public void TestGetPersonList(){
        //Given
        FarmHouse farmHouse = new FarmHouse();
        ArrayList<Person> personList = new ArrayList<Person>();
        Person person = null;
        //When
        personList.add(null);
        int expected = 1;
        int actual = personList.size();
        //Then
        Assert.assertEquals(expected,actual);
    }

}


