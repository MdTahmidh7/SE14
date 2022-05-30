package CommandPattern.Practice1;

public class Remote {
    Command theCommand;
    public Remote(Command theCommand){
        this.theCommand = theCommand;
    }
    public void press(){
        theCommand.execute();
    }
}
