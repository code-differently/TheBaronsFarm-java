package hbcu.stay.ready.baronsfarm.Classes.Crops;

import java.util.Random;

public class CornStalk extends Crop {


    public CornStalk(double height){
    }
    double height = 65;
    Random random = new Random();
    int randomInt = random.nextInt(25);

    public boolean yield() {
        boolean yield = false;
        int corn = 0;

        if (height >= 50) {
            yield = true;
        }

        if (yield == true) {
            corn = randomInt;
        }
        System.out.println("This corn stalk yielded " + randomInt + " ears of corn");
        return yield;
    }


}
