package hbcu.stay.ready.baronsfarm.TestAnimals;

import hbcu.stay.ready.baronsfarm.Classes.Animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class TestChicken {



    @Test
    public void TestYield(){
        //Given
        Chicken chicken = new Chicken("Bucky");
        //When
       // Boolean expected = true;

        //Then
        Assert.assertTrue(chicken.yield());
    }

    @Test
    public void TestFertilizeEgg(){
        //Given
        Chicken chicken = new Chicken("Bucky");
        //When
        //Boolean expected = true;

        //Then
        Assert.assertTrue(chicken.fertilizeEgg());
    }
}
