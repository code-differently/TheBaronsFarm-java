package hbcu.stay.ready.baronsfarm.Classes;

public class Farmer extends Person {

    Farmer Baron = new Farmer("Baron");

    public Farmer(String name) {
        super(name);
    }

    public void hasFarm(){
        Farm baronsFarm = new Farm();

    }


    public static Farmer name() {
        return Farmer.name();
    }
}
