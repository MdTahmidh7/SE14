package FirstCT.Mediator;

public class ATC1 implements ATC{
    Flight flight;
    Runway runway;
    boolean availableStatus;
    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setAvailability(boolean status) {
        this.availableStatus = status;
    }

    @Override
    public boolean isAvailable() {
        return availableStatus;
    }
}
