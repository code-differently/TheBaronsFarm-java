package Interface;

public interface Rider extends Rideable {
    void mount(Rider rider);

    void dismount();
}
