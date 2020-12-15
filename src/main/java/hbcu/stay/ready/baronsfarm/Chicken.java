package hbcu.stay.ready.baronsfarm;

public class Chicken extends Animal implements Produce, Edible {

    public Chicken(String name) {
        super(name);
    }
    public void yield() {

    }
    @Override
    public String eat(Edible edible) {
        return "Yum";
    }
    @Override
    public String makeNoise() {
        return "Peck Peck, Flap Flap";
    }
}
