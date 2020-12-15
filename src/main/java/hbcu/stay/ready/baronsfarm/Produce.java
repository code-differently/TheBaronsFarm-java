package hbcu.stay.ready.baronsfarm;

public interface Produce {
    boolean hasBeenHarvested = false;
    boolean hasBeenFertilized = false;

    public void harvest();
    public void fertilize();
    public Edible yield();

}
