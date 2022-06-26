package FirstCT.CommandPattern.Practice2;

public class OffCommand implements Command{
    Device device;
    public OffCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.off();
    }
}
