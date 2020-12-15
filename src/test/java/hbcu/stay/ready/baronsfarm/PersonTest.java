package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void personConstructorIdTest(){
        //Given
        long id = 1004l;
        Person person = new Person("Baron", "Hurray!", 1004l);
        //When
        long expected = 1004l;
        long actual = person.getId();
        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void personConstructorNameTest(){
        //Given
        Person person = new Person("Baron", "Hurray!", 1004l);
        //When
        String expected = "Baron";
        String actual = person.getName();
        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void personConstructorNoiseTest(){
        //Given
        Person person = new Person("Baron", "Hurray!", 1004l);
        //When
        String expected = "Hurray!";
        String actual = person.getNoise();
        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Person person = new Person("Baron", "Hurray!", 1004l);
        String expected = "";
        String actual = person.setName();

        Assertions.assertNotEquals(expected,actual);
    }

    @Test
    public void setNoiseTest(){
        Person person = new Person("Baron", "Hurray!", 1004l);
        String expected = "";
        String actual = person.setNoise();

        Assertions.assertNotEquals(expected,actual);
    }

    @Test
    public void setIdTest(){
        Person person = new Person("Baron","Hurray!", 1004l);
        long expected = 0000l;
        long actual = person.setId();

        Assertions.assertNotEquals(expected,actual);
    }


}
