package StrategyPattern1.Practice1;

public class Animal {
public Flys flyingType;

public String tryToFly(){
    return flyingType.fly();
}
public void setFlying(Flys flyingType){
    this.flyingType=flyingType;
}
}
