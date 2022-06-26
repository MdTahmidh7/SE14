package FirstCT.StrategyPattern1.Practice2;

public class Hog extends Hero{
    public Hog(){
        attackingType = new AttackWithFire();
    }
}
