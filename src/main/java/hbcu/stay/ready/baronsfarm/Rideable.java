package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.people.Rider;

public interface Rideable {

    public void mount(Rider rider);
    public Rider dismount(); //return rider
}
