package hbcu.stay.ready.baronsfarm.people;

import hbcu.stay.ready.baronsfarm.Edible;
import hbcu.stay.ready.baronsfarm.farm.produce.Crop;
import hbcu.stay.ready.baronsfarm.farm.produce.CropRow;


public class Farmer  implements Eater, Botanist, Rider  {
    public void eat(Edible food) {

    }

    public void mount(Rider rider) {

    }

    public Rider dismount() {
        return null;
    }

    public CropRow plant(Crop crop) {
        return null;
    }
}
