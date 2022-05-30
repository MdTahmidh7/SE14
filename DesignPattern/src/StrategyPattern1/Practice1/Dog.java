package StrategyPattern1.Practice1;

public class Dog extends Animal{
    public Dog(){
        flyingType = new ItCanNotFly();
    }
}
