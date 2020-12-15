package hbcu.stay.ready.baronsfarm.TestCrops;


import hbcu.stay.ready.baronsfarm.Classes.Crops.MoneyTree;
import org.junit.Assert;
import org.junit.Test;

public class TestMoneyTree {

    @Test

    public void TestYield(){
        //Given
        MoneyTree moneyTree = new MoneyTree(1);
        //When
        boolean actual = true;
        boolean expected = moneyTree.yield();
        //Then
        Assert.assertTrue(moneyTree.yield());
    }
}
