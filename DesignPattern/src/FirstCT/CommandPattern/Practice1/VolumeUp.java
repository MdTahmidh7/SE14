package FirstCT.CommandPattern.Practice1;

public class VolumeUp implements Command{
    ElectronicDevice electronicDevice;
    public VolumeUp(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUpp();
    }
}
