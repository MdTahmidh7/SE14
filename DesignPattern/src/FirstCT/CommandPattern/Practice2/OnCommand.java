package FirstCT.CommandPattern.Practice2;

public class OnCommand implements Command{
    Device device;
    public OnCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.on();
    }
}
