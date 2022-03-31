package Class5.ATC;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController {
    public List<AirPlane> flights;
    public List<RunWay> runWays;

    public AirTrafficController(){
        flights = new ArrayList<AirPlane>();
        runWays = new ArrayList<RunWay>();

    }

    public void registerAirplane(AirPlane a){
        this.flights.add(a);
        a.connectATC(this);
    }

    public void registerRunway(RunWay r){
        this.runWays.add(r);
    }
    public RunWay suggestRunway(){

        RunWay suggestRunway = null;
        for (RunWay r:
             runWays) {
            if (r.available) return r;
        }
        return null;
    }
    public boolean isTakeOffOk(){
        boolean isOk = true;
        //Business Logic
        return false;
    }
}
