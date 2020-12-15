package hbcu.stay.ready.baronsfarm;

import org.junit.Test;

public class ChickenTest {

    @Test

    public void ChickenTest() {

        //Given
        Chicken chicken = new Chicken("Frank");
        CornStalk cornStalk = new CornStalk();
        //Then
        System.out.println(chicken.makeNoise());
        System.out.println(chicken.eat(cornStalk));
    }
}
