package StrategyPattern1.Practice1;

public class Bird extends Animal{
    public Bird(){
        flyingType = new ItFlys();
    }
}
