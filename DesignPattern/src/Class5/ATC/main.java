package Class5.ATC;

public class main {
    public static void main(String[] args) {
        System.out.println("    Hello World    ");

        AirPlane a = new AirPlane("ABC");
        AirPlane a1 = new AirPlane("DEF");
        AirPlane a2 = new AirPlane("GHI");
        RunWay r = new RunWay( "01");
        RunWay r1 = new RunWay( "02");
        RunWay r2 = new RunWay( "03");
        AirTrafficController atc = new AirTrafficController();
        atc.registerAirplane(a);
        atc.registerAirplane(a1);
        atc.registerAirplane(a2);

        atc.registerRunway(r);
        atc.registerRunway(r1);
        atc.registerRunway(r2);


        RunWay runWay = a.requestRunway();
        new FlightLanding(a,runWay).execute();
    }
}
