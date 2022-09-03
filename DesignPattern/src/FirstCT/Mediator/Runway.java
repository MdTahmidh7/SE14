package FirstCT.Mediator;

public class Runway implements Command{
    ATC atc;

    public Runway(ATC atc) {
        this.atc = atc;
    }

    @Override
    public void land() {
        System.out.println("Runway is available for landing");
        atc.setAvailability(true);
    }
}
