package FirstCT.Mediator;

public class Flight implements Command{
    ATC atc;

    public Flight(ATC atc) {
        this.atc = atc;
    }

    @Override
    public void land() {
        if(atc.isAvailable()){
            System.out.println("Landing is successful");
            atc.setAvailability(false);
        }else{
            System.out.println("Waiting for landing");
        }
    }
    public void parked(){
        System.out.println("Flight is parked");
        atc.setAvailability(true);
    }
}
