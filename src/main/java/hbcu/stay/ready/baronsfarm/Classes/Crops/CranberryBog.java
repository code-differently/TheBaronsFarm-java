package hbcu.stay.ready.baronsfarm.Classes.Crops;

import java.util.Random;

public class CranberryBog extends Crop {

    public CranberryBog(String color) {
    }

    String color = "red";
    Random random = new Random();
    int randomInt = random.nextInt(50);

    public boolean yield() {
        boolean yield = false;
        int tonsOfCranberries = 0;
        if (color.equals("red")) {
            yield = true;
        }
        if (yield) {
            tonsOfCranberries = randomInt;
        }
        System.out.println(tonsOfCranberries + " tons of cranberries?! Tell Ocean Spray to bring me my money!");
        return yield;
    }
}
