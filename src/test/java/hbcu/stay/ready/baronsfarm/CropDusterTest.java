package hbcu.stay.ready.baronsfarm;

import org.junit.Test;

public class CropDusterTest {

    @Test

    public void cropDusterTest() {

        //Given
        CropDuster cropDuster = new CropDuster();
        Pilot joe = new Pilot();

        //Then
        System.out.println(cropDuster.fly(joe));
        System.out.println(cropDuster.fertilize());
        System.out.println(cropDuster.operate());
        System.out.println(cropDuster.makeNoise());

    }
}
