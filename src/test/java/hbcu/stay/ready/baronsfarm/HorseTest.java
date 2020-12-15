package hbcu.stay.ready.baronsfarm;

import org.junit.Test;

public class HorseTest {

    @Test

    public void HorseTest() {

        //Given
        Horse horse = new Horse("Bobby");
        Rider rider = new Rider() {
            @Override
            public void mount() {
            }
            @Override
            public void dismount() {

            }

        };
        System.out.println(horse.mount(rider));
        System.out.println(horse.dismount());

    }
}
