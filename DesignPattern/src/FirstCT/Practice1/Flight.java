package FirstCT.Practice1;

public class Flight implements Command{
    ATCMediator atcMediator;
    public Flight(ATCMediator atcMediator){
        this.atcMediator = atcMediator;
        atcMediator.setLanding(true);
    }
    @Override
    public void land() {
        if(atcMediator.isLandingOk()){
            System.out.println("Successfully Landed");
            atcMediator.setLanding(true);
        }
        else {
            System.out.println("Waiting for landing");
        }
    }
}
