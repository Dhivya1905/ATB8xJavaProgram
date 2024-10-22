package Oct.ex_14102024_Abstraction_Interface;

public class WagonR extends engine {


    void drive() {
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping car");

    }
}
