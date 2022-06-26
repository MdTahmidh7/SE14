package FirstCT.CommandPattern.Practice2;

public class Remote {
    Command command;
    public Remote(Command command){
        this.command = command;
    }
    public void press(){
        this.command.execute();
    }
}
