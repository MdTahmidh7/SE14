package SecondCT.BuilderDp.Practice2;

public class PhoneBuilder {
    String name;
    int screenSize;
    int ram;
    int rom;
    String os;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public Phone getPhone(){
        return new Phone(name,screenSize,ram,rom,os);
    }
}
