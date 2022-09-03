package FirstCT.Mediator;

public interface ATC {
    void registerFlight(Flight flight);
    void registerRunway(Runway runway);
    void setAvailability(boolean status);
    boolean isAvailable();
}
