package Practice1;

public class TestMediatorDP {
    public static void main(String[] args) {
        ATCMediator atcMediator = new ATC();

        Flight bowing707 = new Flight(atcMediator);
        Runway runway34 = new Runway(atcMediator);

        atcMediator.registerFlight(bowing707);
        atcMediator.registerRunway(runway34);

        runway34.land();
        bowing707.land();


    }
}
