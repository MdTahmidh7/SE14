package FirstCT.CommandPattern.Practice2;

public class Television implements Device{
    public int volume=0;
    @Override
    public void on() {
        System.out.println(" Device is On");
    }

    @Override
    public void off() {
        System.out.println(" Device is Off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println(" Volume is = "+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println(" Volume is = "+volume);
    }
}
