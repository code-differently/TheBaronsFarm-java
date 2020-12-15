package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.Chicken;
import hbcu.stay.ready.baronsfarm.classes.ChickenCoop;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ChickenCoopTest {
    @Test
    public void testChickenCoopConstructor(){
        ChickenCoop chickenCoop = new ChickenCoop(new Chicken(), new Chicken(), new Chicken());
        Assert.assertEquals(3, chickenCoop.getChickenList().size());
    }
    @Test
    public void testAddChicken(){
        ChickenCoop chickenCoop = new ChickenCoop(new Chicken(), new Chicken(), new Chicken());
        ChickenCoop expected = chickenCoop;
        chickenCoop.addChicken(new Chicken());

        Assert.assertEquals(3,chickenCoop.getChickenList().size());
    }



}

