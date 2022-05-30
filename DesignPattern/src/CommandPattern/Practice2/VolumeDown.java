package CommandPattern.Practice2;

public class VolumeDown implements Command{
    Device device;
    public VolumeDown(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeDown();
    }
}
