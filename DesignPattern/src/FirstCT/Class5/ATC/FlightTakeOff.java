package FirstCT.Class5.ATC;

public class FlightTakeOff {
    public AirPlane flight;
    public RunWay runWay;
    public FlightTakeOff(AirPlane flight,RunWay runWay){
        this.flight = flight;
        this.runWay = runWay;
    }

    public void execute(){
        flight.takeOff();
        runWay.takeOff();
    }
}
