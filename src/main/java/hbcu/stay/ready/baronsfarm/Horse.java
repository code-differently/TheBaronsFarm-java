package hbcu.stay.ready.baronsfarm;

public class Horse extends Animal implements Rideable {

    Horse(String name){
        super(name);
    }

    @Override
    public String eat(Edible edible) {

        return "Horse food noises";
    }

    public String mount(Rider rider) {
        return "I'm on";
    }

    public String dismount() {
        return "I'm off";
    }

    @Override
    public String makeNoise() {

        return "Nah fool";
    }



}
