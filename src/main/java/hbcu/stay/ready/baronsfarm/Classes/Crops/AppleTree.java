package hbcu.stay.ready.baronsfarm.Classes.Crops;

import hbcu.stay.ready.baronsfarm.Interfaces.Produce;
import java.util.Random;

public class AppleTree extends Crop{

    public AppleTree(String color) {
    }
        String color = "red";
        Random random = new Random();
        int randomInt = random.nextInt(450);

    public boolean yield() {
        boolean yield = false;
        int numberOfApples = 0;
        if(color.equals("red")){
            yield = true;
        }
        if(yield){
            numberOfApples = randomInt;
        }
        System.out.println("Well, call me Tim Cook cus now we got " + numberOfApples + " apples!");
        return yield;

    }

}
