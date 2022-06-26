package FirstCT.StrategyPattern1.Practice2;

public class Hero {
    public AttackEnemy attackingType;


    public void tryToAttack(String s){
        attackingType.attack(s);
    }
    public void setAttackingType(AttackEnemy newAttackingType){
        this.attackingType = newAttackingType;
    }
}
