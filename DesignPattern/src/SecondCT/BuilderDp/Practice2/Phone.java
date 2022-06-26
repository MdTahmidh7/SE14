package SecondCT.BuilderDp.Practice2;

public class Phone {
    String name;
    int screenSize;
    int ram;
    int rom;
    String os;

    public Phone(String name, int screenSize, int ram, int rom, String os) {
        this.name = name;
        this.screenSize = screenSize;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", rom=" + rom +
                ", os='" + os + '\'' +
                '}';
    }
}
