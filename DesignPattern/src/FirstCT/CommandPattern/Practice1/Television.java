package FirstCT.CommandPattern.Practice1;

public class Television implements ElectronicDevice{
    private int volume =0;
    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }

    public void volumeUpp() {

        volume++;
        System.out.println("Volume is = "+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume is = "+volume);
    }
}
