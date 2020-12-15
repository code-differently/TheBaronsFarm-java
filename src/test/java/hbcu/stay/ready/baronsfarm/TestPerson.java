package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.Classes.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void TestName(){
        //Given
        Person person = new Person("Big Jimmy");
        //When
        String actual = "Big Jimmy";
        String expected = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
