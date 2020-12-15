package hbcu.stay.ready.baronsfarm;

public class TomatoPlant extends Crop implements Edible{
    private final String name;
    private Object TomatoPlant;

    @Override
    public Object yield() {
        super.yield();
        return (TomatoPlant);
    }
    public TomatoPlant(String name) {
        this.name = name;
    }
}
