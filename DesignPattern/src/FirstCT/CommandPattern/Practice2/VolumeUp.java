package FirstCT.CommandPattern.Practice2;

public class VolumeUp implements Command{
    Device device;
    public VolumeUp(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeUp();
    }
}
