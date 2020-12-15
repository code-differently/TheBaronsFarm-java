package hbcu.stay.ready.baronsfarm.classes;

public class Person {
    String name;
    String noise;
    long id;

    public Person(String name, String noise, long id){
        this.name = name;
        this.noise = noise;
        this.id = id;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String setName() {
        this.name = name;
        return name;
    }

    public String getNoise() {
        return noise;
    }

    public String setNoise() {
        this.noise = noise;
        return noise;
    }

    public long getId() {
        return id;
    }

    public long setId() {
        this.id = id;
        return id;
    }
}
