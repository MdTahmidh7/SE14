package FirstCT.Mediator;

public class Main {
    public static void main(String[] args) {
        ATC atc = new ATC1();
        Runway runway34 = new Runway(atc);
        Runway runway33 = new Runway(atc);
        Flight flight808 = new Flight(atc);
        Flight flight809 = new Flight(atc);

        runway34.land();
        flight808.land();

        runway34.land();
        flight809.land();
        flight808.parked();
        flight809.land();
    }
}
