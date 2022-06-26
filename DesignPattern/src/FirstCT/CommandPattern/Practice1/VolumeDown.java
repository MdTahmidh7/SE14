package FirstCT.CommandPattern.Practice1;

public class VolumeDown implements Command{
    ElectronicDevice electronicDevice;
    public VolumeDown(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }
}
