package FirstCT.Practice1;

public interface ATCMediator {
    void registerFlight(Flight flight);
    void registerRunway(Runway runway);
    boolean isLandingOk();
    void setLanding(boolean status);
}
