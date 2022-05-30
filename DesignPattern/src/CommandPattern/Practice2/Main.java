package CommandPattern.Practice2;
public class Main {
    public static void main(String[] args) {
        Device television = new Television();
        Command command = new OnCommand(television);
        Remote remote = new Remote(command);
        remote.press();
        command = new VolumeUp(television);
        remote = new Remote(command);
        remote.press();
        remote.press();
        remote.press();

        command = new VolumeDown(television);
        remote = new Remote(command);
        remote.press();
        remote.press();

        command = new OffCommand(television);
        remote = new Remote(command);
        remote.press();
    }
}
