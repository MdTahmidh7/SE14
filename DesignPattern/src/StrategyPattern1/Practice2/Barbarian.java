package StrategyPattern1.Practice2;

public class Barbarian extends Hero{
    public Barbarian(){
        attackingType = new AttackWithHammer();
    }
}
