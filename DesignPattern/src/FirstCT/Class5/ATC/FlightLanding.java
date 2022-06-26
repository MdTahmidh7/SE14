package FirstCT.Class5.ATC;

public class FlightLanding {
    public AirPlane flight;
    public RunWay runWay;
    public FlightLanding(AirPlane flight,RunWay runWay){
        this.flight = flight;
        this.runWay = runWay;
    }

    public void execute(){
        flight.land();
        runWay.land();
    }
}
