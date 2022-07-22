package Structural_DP.Adapter.Bridge_DP;

public class User {
    public static void main(String[] args) {
    AutoMobile bus = new Bus(new Produce(),new Assemble());
    bus.manufacture();

    AutoMobile taxi = new Taxi(new Produce(),new Assemble());
    taxi.manufacture();
    }
}
