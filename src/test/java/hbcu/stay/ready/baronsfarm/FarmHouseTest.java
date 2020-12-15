package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FarmHouseTest {
    @Test
    public void testFarmHouseConstructor(){
        FarmHouse farmHouse = new FarmHouse(new Person(), new Person());
        Assert.assertEquals(2, farmHouse.getPersonArrayList());

    }

    @Test
    public void testAddPerson(){
        FarmHouse farmHouse = new FarmHouse(new Person(), new Person());
        farmHouse.addPerson(new Person());

        Assert.assertEquals(2, farmHouse.getPersonArrayList().size());
    }

}
