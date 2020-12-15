package hbcu.stay.ready.baronsfarm.Classes.Crops;

import java.util.Random;

public class TomatoPlant extends Crop{


        public TomatoPlant(double height){
        }

        Random random = new Random();
        int randomInt = random.nextInt(30);
        double heightOfCrop = random.nextInt(75);

        public boolean yield() {
            boolean yield = false;
            int tomato = 0;

            if (heightOfCrop >= 30) {
                yield = true;
            }
            if (yield) {
                tomato = randomInt;
                System.out.println("height of crops: " + heightOfCrop);
                System.out.println(tomato + " tomato's perfect for throwing");

            }else if(heightOfCrop < 30) {
                System.out.println("Bad tomato season for Big Jimmy");
            }

            return yield;
        }
    }

