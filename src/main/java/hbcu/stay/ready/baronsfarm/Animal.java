package hbcu.stay.ready.baronsfarm;

abstract class Animal implements Eater, NoiseMaker{
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
