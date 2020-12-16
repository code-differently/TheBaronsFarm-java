package hbcu.stay.ready.baronsfarm.Interface;

import hbcu.stay.ready.baronsfarm.concrete.Farmer;

public interface Rideable {
    public void mount(Farmer farmer);
    String dismount();
}
