package Practice1;

public class ATC implements ATCMediator{
    Flight flight;
    Runway runway;
    boolean landingStatus;

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public boolean isLandingOk() {
        return landingStatus;
    }

    @Override
    public void setLanding(boolean status) {
        this.landingStatus = status;
    }
}
