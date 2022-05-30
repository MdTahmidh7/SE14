package StrategyPattern1.Practice1;

public class ItCanNotFly implements Flys{
    @Override
    public String fly() {
        return "Can not fly";
    }
}
