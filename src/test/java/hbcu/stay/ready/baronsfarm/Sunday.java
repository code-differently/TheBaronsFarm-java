package hbcu.stay.ready.baronsfarm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Sunday {


    private Stable stable1;
    private Stable stable2;
    private Stable stable3;

    @Before
    public void setUp() {

        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();

        stable1.addHorses(3);
        stable2.addHorses(3);
        stable3.addHorses(4);

    }
    @Test
    public void RideHorse(){
        ArrayList<Horse> horses = stable1.getHorseList();

//for each loop



    }


}
