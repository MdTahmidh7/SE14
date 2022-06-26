package FirstCT.Class5.ATC;

public class RunWay implements Command{
    private String id;
    RunWay(String id){
        this.id=id;
    }
    public boolean available = true;
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {
        available = false;
    }
    public  boolean getAvailability(){
        return true;
    }
    public String toString(){
        return id;
    }
}
