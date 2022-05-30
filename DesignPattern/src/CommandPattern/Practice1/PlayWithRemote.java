package CommandPattern.Practice1;

public class PlayWithRemote {
    public static void main(String[] args) {
        ElectronicDevice newTelevision = new Television();

        TurnTvOn onCommand = new TurnTvOn(newTelevision);
        Remote onPress = new Remote(onCommand);
        onPress.press();

        TurnTvOff offCommand = new TurnTvOff(newTelevision);
        onPress  = new Remote(offCommand);
        onPress.press();

        VolumeUp increaseVolume = new VolumeUp(newTelevision);
        onPress = new Remote(increaseVolume);
        onPress.press();
        onPress.press();
        onPress.press();
        onPress.press();

        VolumeDown decreaseVolume = new VolumeDown(newTelevision);
        onPress = new Remote(decreaseVolume);
        onPress.press();
        onPress.press();



    }
}
