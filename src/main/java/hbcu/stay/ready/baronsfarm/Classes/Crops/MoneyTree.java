package hbcu.stay.ready.baronsfarm.Classes.Crops;

public class MoneyTree extends Crop {

    public MoneyTree(double billAmount) {
    }

    int billAmount = 5;
    public boolean yield() {
        boolean yield = false;
        double cash = 0;

        if (billAmount >= 1) {
            yield = true;
        }
        System.out.println("$" + billAmount + " bills make Money Trees the perfect place for shade, but that's just how I feel");
        return yield;

    }

}
