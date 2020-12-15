package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.classes.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FieldTest {

    @Test
    public void CropRowGetCornRowTest(){
        Field field = new Field(new CornStalk(new EarCorn()));
        Field cornRow = new Field(new CornStalk(new EarCorn()));
        ArrayList<CropRow> expected = cornRow.getCropRows();
        ArrayList<CropRow> actual = cornRow.getCropRows();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void CropRowGetTomatoRowTest(){
        Field field = new Field(new TomatoPlant(new Tomato()));
        Field tomatoRow = new Field(new TomatoPlant(new Tomato()));
        ArrayList<CropRow> expected = tomatoRow.getCropRows();
        ArrayList<CropRow> actual = tomatoRow.getCropRows();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void CropRowSetCornRowTest(){
        Field field = new Field(new CornStalk(new EarCorn()));
        Field cornRow = new Field(new CornStalk(new EarCorn()));
        ArrayList<CropRow> expected = cornRow.setCropRows();
        ArrayList<CropRow> actual = cornRow.setCropRows();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void CropRowSetTomatoRowTest(){
        Field field = new Field(new TomatoPlant(new Tomato()));
        Field tomatoRow = new Field(new TomatoPlant(new Tomato()));
        ArrayList<CropRow> expected = tomatoRow.setCropRows();
        ArrayList<CropRow> actual = tomatoRow.setCropRows();

        Assert.assertEquals(expected,actual);
    }
}
