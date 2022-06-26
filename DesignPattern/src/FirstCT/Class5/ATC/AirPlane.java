package FirstCT.Class5.ATC;

public class AirPlane implements Command{

    private String id;
    private AirTrafficController atc;

    public AirPlane(String id){
        this.id = id;
    }

    @Override
    public void takeOff() {
        //Business Logic
        System.out.println(id+"AirPlane has been taken Off");
    }

    @Override
    public void land() {
        //Business Logic
        System.out.println("AirPlane has been landed");
        System.out.println("Runway = "+id+" Has been landed");
    }
    public  RunWay requestRunway(){
        RunWay r = this.atc.suggestRunway();
        return r;
    }
    public void connectATC(AirTrafficController atc){
        this.atc = atc;
    }
    public String toString(){
        return  id;
    }
}
