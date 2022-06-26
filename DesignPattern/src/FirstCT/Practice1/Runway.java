package FirstCT.Practice1;

public class Runway implements Command{
    ATCMediator atcMediator;
    public Runway(ATCMediator atcMediator){
        this.atcMediator = atcMediator;
        atcMediator.setLanding(true);
    }
    @Override
    public void land() {
        if(atcMediator.isLandingOk()){
            System.out.println("Landing permission Granted");
            atcMediator.setLanding(true);
        }
        else {
            System.out.println("Landing Permission Not Granted");
        }
    }
}
